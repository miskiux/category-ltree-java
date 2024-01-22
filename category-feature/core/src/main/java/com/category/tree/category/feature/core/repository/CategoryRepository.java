package com.category.tree.category.feature.core.repository;

import com.category.tree.category.feature.core.entity.Category;
import com.category.tree.category.feature.core.structures.CategoryID;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

interface CategoryJpaRepository extends JpaRepository<Category, UUID> {
}

public interface CategoryRepository {
    Category create(Category category);

    Category findById(CategoryID id);
}

@Service
class CategoryRepositoryImpl implements CategoryRepository {

    private final CategoryJpaRepository categoryJpaRepository;

    CategoryRepositoryImpl(CategoryJpaRepository categoryJpaRepository) {
        this.categoryJpaRepository = categoryJpaRepository;
    }

    public Category create(Category category) {
        return categoryJpaRepository.save(category);
    }

    public Category findById(CategoryID id) {
        return categoryJpaRepository.findById(id.value)
                .orElseThrow(() -> new EntityNotFoundException(id.toString()));
    }

}
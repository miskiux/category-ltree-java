package com.category.tree.category.feature.core.repository;

import com.category.tree.category.feature.core.entity.Category;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

interface CategoryJpaRepository extends JpaRepository<Category, String> {
}

public interface CategoryRepository {
    Category create(Category category);

    Category findById(String id);
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

    public Category findById(String id) {
        return categoryJpaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id));
    }

}
package com.category.tree.category.feature.core.entity;

import com.category.tree.category.feature.core.structures.CategoryID;
import com.category.tree.category.feature.core.type.LtreeType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(nullable = false, columnDefinition = "text")
    private String name;

    @Column(nullable = true, columnDefinition = "money")
    private BigDecimal price;

    @Column(nullable = false, columnDefinition = "ltree")
    @Type(LtreeType.class)
    private String path;

    public String getPath() {
        return this.path;
    }

    public Category(CategoryID id, String name, String path) {
        this.id = id.value;
        this.name = name;
        this.path = path;
    }

    public Category() {
    }
}
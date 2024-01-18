package com.category.tree.category.feature.core.entity;

import com.category.tree.category.feature.core.type.LtreeType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

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

    public Category(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public Category() {
    }
}
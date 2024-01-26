package com.category.tree.category.feature.core.entity;

import com.category.tree.category.feature.core.structures.CategoryID;
import com.category.tree.category.feature.core.type.LtreeType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.util.UUID;


@Data
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category {
    public Category(CategoryID id, String name, String path) {
        this.id = id.value;
        this.name = name;
        this.path = path;
    }

    @Id
    @Column(nullable = false, name = "id")
    private UUID id;

    @Column(nullable = false, columnDefinition = "text")
    private String name;

    @Column(nullable = true, columnDefinition = "money")
    private BigDecimal price;

    @Column(nullable = false, columnDefinition = "ltree")
    @Type(LtreeType.class)
    private String path;
}
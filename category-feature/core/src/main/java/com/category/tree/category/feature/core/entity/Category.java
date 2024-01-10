package com.category.tree.category.feature.core.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    public Category(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
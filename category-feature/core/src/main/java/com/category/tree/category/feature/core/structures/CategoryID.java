package com.category.tree.category.feature.core.structures;

import java.util.UUID;

public class CategoryID {

    public UUID value;

    public CategoryID(UUID value) {
        this.value = value;
    }

    public CategoryID(String value) {
        this.value = UUID.fromString(value);
    }

    public String toString() {
        return this.value.toString();
    }
}

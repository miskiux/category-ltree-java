package com.category.tree.category.feature.core.unit;

import com.category.tree.category.feature.core.builder.PathBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CategoryPathBuilderTest {

    @Test
    @DisplayName("it should build category path by extending its ancestors path")
    public void shouldBuildCorrectCategoryPath() {
        String ancestorPath = "Catalog.Books";
        String categoryName = "Science-fiction";
        String correctCategoryPath = "Catalog.Books.Science-fiction";
        PathBuilder pathBuilder = new PathBuilder();

        String path = pathBuilder.buildPath(ancestorPath, categoryName);

        Assertions.assertEquals(path, correctCategoryPath);
    }
}

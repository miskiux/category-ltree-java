package com.category.tree.category.feature.core.builder;


import org.springframework.lang.Nullable;

import java.util.*;

public class PathBuilder {
    private final List<String> pathList = new ArrayList<>();

    public String getPath() {
        return stringifyPathList(this.pathList);
    }

    public String buildPath(@Nullable String... args) {
        Arrays.stream(args).filter(Objects::nonNull).forEach(this::addToListPath);

        return this.getPath();
    }

    public void addToListPath(String node) {
        Arrays.stream(node.split("\\."))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .forEach(this.pathList::add);
    }

    public String stringifyPathList(List<String> path) {
        return String.join(".", path);
    }
}

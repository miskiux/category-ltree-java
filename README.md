## category-app-tree-representation

Representing hierarchical tree-like structure: storing categories, retrieving category branches.

## `ltree` extension

Utilizing postgres extension-ltree which includes operators and functions for fast (gist index), convenient search of
ancestors.

## `gradle` composite build

project is structured into isolated components. each component declares locations of other
components `settings.gradle.kts`, this makes
components known to each other. sub-projects of components, declare dependencies to binary components, or, to included
component plugins.

component `build-logic` defines a single source of truth for builds and are used for common project configurations.








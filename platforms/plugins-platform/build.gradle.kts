plugins {
    id("java-platform")
}

group = "com.category.tree.platform"

dependencies.constraints {
    api(libs.spring.boot.gradle.plugin) {
        version { prefer("3.2.1") }
    }
}
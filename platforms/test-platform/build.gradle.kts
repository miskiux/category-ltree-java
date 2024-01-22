plugins {
    id("java-platform")
}

group = "com.category.tree.platform"

dependencies.constraints {
    api(libs.spring.boot.starter.test) {
        version { prefer("3.2.1") }
    }
}
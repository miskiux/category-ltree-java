plugins {
    id("java-platform")
}

group = "com.category.tree.platform"

dependencies.constraints {
    api(libs.spring.boot.starter.data) {
        version { prefer("3.2.1") }
    }
    api(libs.postgresql) {
        version { prefer("42.7.1") }
    }
    api(libs.hibernateJpaModelGen) {
        version { prefer("6.4.0.Final") }
    }
}
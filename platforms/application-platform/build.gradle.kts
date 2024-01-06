plugins {
    id("java-platform")
}

group = "com.category.tree.platform"

dependencies.constraints {
    api(libs.spring-boot-starter-web) {
        version { prefer("3.2.0") }
    }
}

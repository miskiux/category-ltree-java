plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("org.springframework.boot:org.springframework.boot.gradle.plugin")
    implementation(platform("com.category.tree.platform:plugins-platform"))

    implementation(project(":commons"))
}

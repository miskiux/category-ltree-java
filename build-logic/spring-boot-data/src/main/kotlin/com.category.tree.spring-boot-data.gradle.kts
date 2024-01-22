plugins {
    id("com.category.tree.commons")
    id("org.springframework.boot")
}

val libs = the<VersionCatalogsExtension>().named("libs")

dependencies {
    implementation(libs.findLibrary("spring-boot-starter-data").get())
    implementation(libs.findLibrary("postgresql").get())
    implementation(libs.findLibrary("hibernateJpaModelGen").get())
    implementation(platform("com.category.tree.platform:data-platform"))
    implementation(platform("com.category.tree.platform:test-platform"))
    testImplementation(libs.findLibrary("spring-boot-starter-test").get())
}

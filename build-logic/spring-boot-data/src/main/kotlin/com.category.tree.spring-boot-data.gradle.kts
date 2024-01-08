plugins {
    id("com.category.tree.commons")
}

val libs = the<VersionCatalogsExtension>().named("libs")

dependencies {
    implementation(libs.findLibrary("spring-boot-starter-data").get())
    implementation(platform("com.category.tree.platform:data-platform"))
}

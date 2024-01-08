plugins {
    id("com.category.tree.commons")
    id("org.springframework.boot")
}

val libs = the<VersionCatalogsExtension>().named("libs")

dependencies {
    implementation(libs.findLibrary("spring-boot-starter-web").get())
    implementation(platform("com.category.tree.platform:application-platform"))
}
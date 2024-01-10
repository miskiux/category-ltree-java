pluginManagement {
    repositories {
        gradlePluginPortal() // if pluginManagement.repositories looks like this, it can be omitted as this is the default
    }
    includeBuild("../build-logic")
}

dependencyResolutionManagement {
    repositories.mavenCentral()
    repositories.gradlePluginPortal()
    repositories.google()

    versionCatalogs.create("libs") {
        from(files("../libs.versions.toml"))
    }
}
includeBuild("../platforms")

rootProject.name = "category-feature"
include("core")

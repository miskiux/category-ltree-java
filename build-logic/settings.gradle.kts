dependencyResolutionManagement {
    repositories.mavenCentral()
    repositories.gradlePluginPortal()
    repositories.google()

    versionCatalogs.create("libs") {
        from(files("../libs.versions.toml"))
    }
}

rootProject.name = "build-logic"
include("commons")
include("spring-boot-application")

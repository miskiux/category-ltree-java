dependencyResolutionManagement {
    repositories.mavenCentral()
    repositories.gradlePluginPortal()

    versionCatalogs.create("libs") {
        from(files("../libs.versions.toml"))
    }
}

rootProject.name = "build-logic"
include("commons")
include("spring-boot-application")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://androidx.dev/snapshots/builds/11527140/artifacts/repository")
    }
}

rootProject.name = "MaterialComposeGallery"
include(":app")
include(":feature:home")
include(":feature:m2overview")
include(":feature:m3overview")
include(":data")
include(":data-impl")

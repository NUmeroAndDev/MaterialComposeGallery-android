import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "jp.numero.material_compose_gallery.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

dependencies {
    compileOnly(libs.androidGradlePlugin)
    compileOnly(libs.kotlinGradlePlugin)
    compileOnly(libs.kspPlugin)
    implementation(libs.hiltPlugin)
}

gradlePlugin {
    plugins {
        // primitives
        register("androidApplication") {
            id = "buildlogic.primitive.androidapplication"
            implementationClass =
                "jp.numero.material_compose_gallery.buildlogic.primitive.AndroidApplicationPlugin"
        }
        register("androidLibrary") {
            id = "buildlogic.primitive.androidlibrary"
            implementationClass =
                "jp.numero.material_compose_gallery.buildlogic.primitive.AndroidLibraryPlugin"
        }
        register("compose") {
            id = "buildlogic.primitive.compose"
            implementationClass = "jp.numero.material_compose_gallery.buildlogic.primitive.ComposePlugin"
        }
        register("kotlin") {
            id = "buildlogic.primitive.kotlin"
            implementationClass = "jp.numero.material_compose_gallery.buildlogic.primitive.KotlinPlugin"
        }
        register("hilt") {
            id = "buildlogic.primitive.hilt"
            implementationClass = "jp.numero.material_compose_gallery.buildlogic.primitive.HiltPlugin"
        }

        // conventions
        register("appModule") {
            id = "buildlogic.conventions.appmodule"
            implementationClass = "jp.numero.material_compose_gallery.buildlogic.conventions.AppModulePlugin"
        }
        register("featureModule") {
            id = "buildlogic.conventions.featuremodule"
            implementationClass = "jp.numero.material_compose_gallery.buildlogic.conventions.FeatureModulePlugin"
        }
    }
}

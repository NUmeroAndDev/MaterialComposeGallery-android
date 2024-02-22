buildscript {
    dependencies {
        // ref: https://github.com/google/dagger/issues/3068
        classpath("com.squareup:javapoet:1.13.0")
    }
}

plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    alias(libs.plugins.kspPlugin) apply false
}

subprojects {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>()
        .configureEach {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_11.toString()
                compilerOptions
                    .freeCompilerArgs
                    .add("-Xcontext-receivers")
            }
        }
}
package jp.numero.material_compose_gallery.buildlogic.primitive

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class HiltPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.android")
                apply("com.google.devtools.ksp")
                apply("dagger.hilt.android.plugin")
            }
            android {
                sourceSets.configureEach {
                    kotlin.srcDir("$buildDir/generated/ksp/$name/kotlin/")
                }
            }
            dependencies {
                implementation(libs.findLibrary("hilt.android"))
                ksp(libs.findLibrary("hilt.compiler"))
            }
        }
    }
}
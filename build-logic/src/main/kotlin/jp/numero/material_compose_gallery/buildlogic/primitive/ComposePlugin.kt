package jp.numero.material_compose_gallery.buildlogic.primitive

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.io.File

class ComposePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            android {
                buildFeatures.compose = true
                composeOptions {
                    kotlinCompilerExtensionVersion =
                        libs.findVersion("composeCompiler").get().toString()
                }
                tasks.withType<KotlinCompile>().configureEach {
                    kotlinOptions {
                        freeCompilerArgs = freeCompilerArgs + buildComposeMetricsParameters()
                    }
                }
            }
            dependencies {
                implementation(libs.findLibrary("androidxComposeUi"))
                implementation(libs.findLibrary("androidxComposeUiToolingPreview"))
                implementation(libs.findLibrary("androidxComposeFoundation"))
                implementation(libs.findLibrary("androidxComposeMaterialIconsExtended"))
                implementation(libs.findLibrary("androidxComposeMaterial3WindowSizeClass"))

                testImplementation(libs.findLibrary("androidxComposeUiTest"))

                debugImplementation(libs.findLibrary("androidxComposeUiTooling"))

                implementation(libs.findLibrary("androidxActivity"))
                implementation(libs.findLibrary("androidxNavigationCompose"))
                implementation(libs.findLibrary("androidxLifecycleViewModel"))
                implementation(libs.findLibrary("androidxHiltNavigationCompose"))
            }
        }
    }

    // ref: https://github.com/android/nowinandroid/blob/0d23e64848adea66ec878293a7c1bd18d128689a/build-logic/convention/src/main/kotlin/com/google/samples/apps/nowinandroid/AndroidCompose.kt#L55-L77
    private fun Project.buildComposeMetricsParameters(): List<String> {
        val metricParameters = mutableListOf<String>()
        val enableMetricsProvider = project.providers.gradleProperty("enableComposeCompilerMetrics")
        val enableMetrics = (enableMetricsProvider.orNull == "true")
        if (enableMetrics) {
            val metricsFolder = File(project.buildDir, "compose-metrics")
            metricParameters.add("-P")
            metricParameters.add(
                "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=" + metricsFolder.absolutePath,
            )
        }

        val enableReportsProvider = project.providers.gradleProperty("enableComposeCompilerReports")
        val enableReports = (enableReportsProvider.orNull == "true")
        if (enableReports) {
            val reportsFolder = File(project.buildDir, "compose-reports")
            metricParameters.add("-P")
            metricParameters.add(
                "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination=" + reportsFolder.absolutePath,
            )
        }
        return metricParameters.toList()
    }
}

package jp.numero.material_compose_gallery.buildlogic.primitive

import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidApplicationPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
            }

            application {
                commonConfiguration()
            }
        }
    }
}

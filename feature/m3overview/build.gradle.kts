plugins {
    id("buildlogic.conventions.featuremodule")
}

android {
    namespace = "jp.numero.material_compose_gallery.feature.home"
}

dependencies {
    implementation(libs.androidxComposeMaterial3)
}
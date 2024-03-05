plugins {
    id("buildlogic.primitive.androidlibrary")
    id("buildlogic.primitive.kotlin")
    id("buildlogic.primitive.hilt")
}

android {
    namespace = "jp.numero.material_compose_gallery.data"
}

dependencies {
    implementation(projects.data)
}
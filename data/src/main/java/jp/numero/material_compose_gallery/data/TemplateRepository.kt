package jp.numero.material_compose_gallery.data

interface TemplateRepository {
    suspend fun fetch(): List<String>
}
package jp.numero.material_compose_gallery.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TemplateRepositoryImpl @Inject constructor(
) : TemplateRepository {

    override suspend fun fetch(): List<String> {
        return emptyList()
    }
}
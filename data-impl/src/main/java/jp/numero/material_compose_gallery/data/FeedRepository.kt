package jp.numero.material_compose_gallery.data

import okhttp3.OkHttpClient
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TemplateRepositoryImpl @Inject constructor(
    private val okHttpClient: OkHttpClient,
) : TemplateRepository {

    override suspend fun fetch(): List<String> {
        return emptyList()
    }
}
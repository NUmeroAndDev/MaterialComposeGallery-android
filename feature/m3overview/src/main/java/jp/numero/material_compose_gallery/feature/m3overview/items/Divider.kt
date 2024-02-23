package jp.numero.material_compose_gallery.feature.m3overview.items

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.HorizontalDivider
import androidx.compose.ui.Modifier

fun LazyListScope.dividerItem() {
    item {
        ComponentItem(
            label = "Divider",
            modifier = Modifier.fillMaxWidth()
        ) {
            HorizontalDivider()
        }
    }
}
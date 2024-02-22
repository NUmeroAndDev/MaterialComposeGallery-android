package jp.numero.material_compose_gallery.feature.m2overview.items

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.Divider
import androidx.compose.material.Switch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

fun LazyListScope.dividerItem() {
    item {
        ComponentItem(
            label = "Divider",
            modifier = Modifier.fillMaxWidth()
        ) {
            Divider()
        }
    }
}
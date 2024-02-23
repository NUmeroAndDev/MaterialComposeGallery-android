package jp.numero.material_compose_gallery.feature.m3overview.items

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

fun LazyListScope.checkboxItem() {
    item {
        ComponentItem(
            label = "Checkbox",
            modifier = Modifier.fillMaxWidth()
        ) {
            var checkedState by remember { mutableStateOf(true) }
            Checkbox(
                checked = checkedState,
                onCheckedChange = { checkedState = it }
            )
        }
    }
}
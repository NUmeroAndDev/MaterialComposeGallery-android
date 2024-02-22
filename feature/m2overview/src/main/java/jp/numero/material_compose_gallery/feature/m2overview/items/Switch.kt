package jp.numero.material_compose_gallery.feature.m2overview.items

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.Switch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

fun LazyListScope.switchItem() {
    item {
        ComponentItem(
            label = "Switch",
            modifier = Modifier.fillMaxWidth()
        ) {
            var checkedState by remember { mutableStateOf(true) }
            Switch(
                checked = checkedState,
                onCheckedChange = { checkedState = it }
            )
        }
    }
}
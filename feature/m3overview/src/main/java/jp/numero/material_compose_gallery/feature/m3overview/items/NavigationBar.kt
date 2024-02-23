package jp.numero.material_compose_gallery.feature.m3overview.items

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp

fun LazyListScope.navigationBarItem() {
    item {
        ComponentItem(
            label = "NavigationBar"
        ) {
            var selectedItem by remember { mutableIntStateOf(0) }
            val items = listOf(
                "Home" to Icons.Default.Home,
                "List" to Icons.AutoMirrored.Default.List,
                "Settings" to Icons.Default.Settings
            )

            NavigationBar(
                windowInsets = WindowInsets(0.dp)
            ) {
                items.forEachIndexed { index, (label, icon) ->
                    NavigationBarItem(
                        icon = {
                            Icon(
                                imageVector = icon,
                                contentDescription = null
                            )
                        },
                        label = { Text(label) },
                        selected = selectedItem == index,
                        onClick = { selectedItem = index }
                    )
                }
            }
        }
    }
}
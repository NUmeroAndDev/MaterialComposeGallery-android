package jp.numero.material_compose_gallery.feature.m2overview.items

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.Icon
import androidx.compose.material.NavigationRail
import androidx.compose.material.NavigationRailItem
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

fun LazyListScope.navigationRailItem() {
    item {
        ComponentItem(
            label = "Navigation Rail",
            modifier = Modifier.fillMaxWidth()
        ) {
            var selectedItem by rememberSaveable { mutableIntStateOf(0) }
            val items = listOf(
                "Home" to Icons.Default.Home,
                "List" to Icons.AutoMirrored.Default.List,
                "Settings" to Icons.Default.Settings
            )

            NavigationRail {
                items.forEachIndexed { index, (label, icon) ->
                    NavigationRailItem(
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
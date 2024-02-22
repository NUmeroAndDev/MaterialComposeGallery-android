package jp.numero.material_compose_gallery.feature.m2overview.items

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

fun LazyListScope.bottomNavigationItem() {
    item {
        ComponentItem(
            label = "BottomNavigation"
        ) {
            var selectedItem by remember { mutableIntStateOf(0) }
            val items = listOf(
                "Home" to Icons.Default.Home,
                "List" to Icons.AutoMirrored.Default.List,
                "Settings" to Icons.Default.Settings
            )

            BottomNavigation {
                items.forEachIndexed { index, (label, icon) ->
                    BottomNavigationItem(
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
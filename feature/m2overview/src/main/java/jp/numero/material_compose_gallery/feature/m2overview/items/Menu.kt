package jp.numero.material_compose_gallery.feature.m2overview.items

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

fun LazyListScope.menuItem() {
    item {
        ComponentItem(
            label = "Menu",
            modifier = Modifier.fillMaxWidth()
        ) {
            Box {
                var expanded by rememberSaveable { mutableStateOf(false) }
                IconButton(onClick = { expanded = true }) {
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "Show menu"
                    )
                }

                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    DropdownMenuItem(
                        content = { Text("Edit") },
                        onClick = { },
                    )
                    DropdownMenuItem(
                        content = { Text("Settings") },
                        onClick = { },
                    )
                    DropdownMenuItem(
                        content = { Text("Send Feedback") },
                        onClick = { },
                    )
                }
            }
        }
    }
}
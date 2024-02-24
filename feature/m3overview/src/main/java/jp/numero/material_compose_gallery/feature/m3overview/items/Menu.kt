package jp.numero.material_compose_gallery.feature.m3overview.items

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
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
                        text = { Text("Edit") },
                        onClick = { },
                    )
                    DropdownMenuItem(
                        text = { Text("Settings") },
                        onClick = { },
                    )
                    DropdownMenuItem(
                        text = { Text("Send Feedback") },
                        onClick = { },
                    )
                }
            }
        }
    }
}
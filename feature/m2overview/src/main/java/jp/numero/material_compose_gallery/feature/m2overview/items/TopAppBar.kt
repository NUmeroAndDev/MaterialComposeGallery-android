package jp.numero.material_compose_gallery.feature.m2overview.items

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack

fun LazyListScope.topAppBarItem() {
    item {
        ComponentItem(
            label = "TopAppBar"
        ) {
            TopAppBar(
                title = {
                    Text(text = "Title")
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                actions = {
                    // TODO: Menu
                }
            )
        }
    }
}
package jp.numero.material_compose_gallery.feature.m3overview.items

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun LazyListScope.bottomAppBarItem() {
    item {
        ComponentItem(
            label = "BottomAppBar"
        ) {
            BottomAppBar(
                windowInsets = WindowInsets(0.dp)
            ) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu"
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "Favorites"
                    )
                }
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.CalendarToday,
                        contentDescription = "calendar"
                    )
                }
            }
        }
    }
}
package jp.numero.material_compose_gallery.feature.m3overview.items

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
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
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(
                        elevation = 3.dp
                    )
                ),
                windowInsets = WindowInsets(0.dp)
            )
        }
    }
}
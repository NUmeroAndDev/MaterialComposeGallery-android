package jp.numero.material_compose_gallery.feature.m2overview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import jp.numero.material_compose_gallery.feature.m2overview.items.bottomAppBarItem
import jp.numero.material_compose_gallery.feature.m2overview.items.bottomNavigationItem
import jp.numero.material_compose_gallery.feature.m2overview.items.buttonsItem
import jp.numero.material_compose_gallery.feature.m2overview.items.topAppBarItem

@Composable
fun Material2Overview(
    onBack: () -> Unit,
) {
    MaterialTheme {
        Material2Overview(
            onBack = onBack,
            modifier = Modifier,
        )
    }
}

@Composable
private fun Material2Overview(
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = "Material 2") },
                navigationIcon = {
                    IconButton(
                        onClick = onBack
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                windowInsets = WindowInsets.safeDrawing.only(WindowInsetsSides.Top)
            )
        }
    ) {
        Material2OverviewContent(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        )
    }
}

@Composable
private fun Material2OverviewContent(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(32.dp),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {
        bottomNavigationItem()
        buttonsItem()
        topAppBarItem()
        bottomAppBarItem()
    }
}
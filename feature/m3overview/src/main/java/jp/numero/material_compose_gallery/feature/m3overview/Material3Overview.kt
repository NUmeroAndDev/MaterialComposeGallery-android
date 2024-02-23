package jp.numero.material_compose_gallery.feature.m3overview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import jp.numero.material_compose_gallery.feature.m3overview.items.bottomAppBarItem
import jp.numero.material_compose_gallery.feature.m3overview.items.navigationBarItem
import jp.numero.material_compose_gallery.feature.m3overview.items.buttonItem
import jp.numero.material_compose_gallery.feature.m3overview.items.cardItem
import jp.numero.material_compose_gallery.feature.m3overview.items.checkboxItem
import jp.numero.material_compose_gallery.feature.m3overview.items.chipsItem
import jp.numero.material_compose_gallery.feature.m3overview.items.dialogItem
import jp.numero.material_compose_gallery.feature.m3overview.items.dividerItem
import jp.numero.material_compose_gallery.feature.m3overview.items.floatingActionButtonItem
import jp.numero.material_compose_gallery.feature.m3overview.items.progressIndicatorItem
import jp.numero.material_compose_gallery.feature.m3overview.items.sliderItem
import jp.numero.material_compose_gallery.feature.m3overview.items.switchItem
import jp.numero.material_compose_gallery.feature.m3overview.items.topAppBarItem

@Composable
fun Material3Overview(
    onBack: () -> Unit,
) {
    MaterialTheme {
        Material3Overview(
            onBack = onBack,
            modifier = Modifier,
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Material3Overview(
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    Scaffold(
        modifier = modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                title = { Text(text = "Material 3") },
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
                windowInsets = WindowInsets.safeDrawing.only(WindowInsetsSides.Top),
                scrollBehavior = scrollBehavior
            )
        }
    ) {
        Material3OverviewContent(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        )
    }
}

@Composable
private fun Material3OverviewContent(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(42.dp),
        contentPadding = WindowInsets
            .safeDrawing
            .only(WindowInsetsSides.Bottom)
            .add(WindowInsets(top = 16.dp, bottom = 16.dp))
            .asPaddingValues()
    ) {
        bottomAppBarItem()
        buttonItem()
        cardItem()
        checkboxItem()
        chipsItem()
        dialogItem()
        dividerItem()
        floatingActionButtonItem()
        navigationBarItem()
        progressIndicatorItem()
        sliderItem()
        switchItem()
        topAppBarItem()
    }
}
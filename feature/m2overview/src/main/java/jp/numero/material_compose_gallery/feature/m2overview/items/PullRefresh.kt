package jp.numero.material_compose_gallery.feature.m2overview.items

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterialApi::class)
fun LazyListScope.pullRefreshItem() {
    item {
        ComponentItem(
            label = "Pull Refresh",
            modifier = Modifier.fillMaxWidth()
        ) {
            val refreshing = true
            val state = rememberPullRefreshState(refreshing, {})
            PullRefreshIndicator(refreshing, state)
        }
    }
}
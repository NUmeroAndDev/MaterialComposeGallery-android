package jp.numero.material_compose_gallery.feature.m3overview.items

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.pulltorefresh.PullToRefreshContainer
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
fun LazyListScope.pullToRefreshItem() {
    item {
        ComponentItem(
            label = "Pull To Refresh",
            modifier = Modifier.fillMaxWidth()
        ) {
            val state = rememberPullToRefreshState()
            LaunchedEffect(state) {
                state.startRefresh()
            }
            PullToRefreshContainer(
                state = state,
            )
        }
    }
}
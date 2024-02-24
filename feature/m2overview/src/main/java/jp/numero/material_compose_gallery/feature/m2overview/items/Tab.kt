package jp.numero.material_compose_gallery.feature.m2overview.items

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

fun LazyListScope.tabItem() {
    item {
        ComponentItem(
            label = "Tab"
        ) {
            var primaryTabSelectedIndex by rememberSaveable { mutableIntStateOf(0) }
            val titles = listOf("Tab 1", "Tab 2", "Tab 3")
            TabRow(selectedTabIndex = primaryTabSelectedIndex) {
                titles.forEachIndexed { index, title ->
                    Tab(
                        selected = primaryTabSelectedIndex == index,
                        onClick = { primaryTabSelectedIndex = index },
                        text = {
                            Text(text = title)
                        }
                    )
                }
            }
        }
    }
}
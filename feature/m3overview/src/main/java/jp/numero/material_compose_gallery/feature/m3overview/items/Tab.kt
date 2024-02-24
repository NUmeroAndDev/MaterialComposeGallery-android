package jp.numero.material_compose_gallery.feature.m3overview.items

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.SecondaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
fun LazyListScope.tabItem() {
    item {
        ComponentItem(
            label = "Tab"
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                var primaryTabSelectedIndex by rememberSaveable { mutableIntStateOf(0) }
                val titles = listOf("Tab 1", "Tab 2", "Tab 3")
                PrimaryTabRow(selectedTabIndex = primaryTabSelectedIndex) {
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

                var secondaryTabSelectedIndex by rememberSaveable { mutableIntStateOf(0) }
                SecondaryTabRow(selectedTabIndex = secondaryTabSelectedIndex) {
                    titles.forEachIndexed { index, title ->
                        Tab(
                            selected = secondaryTabSelectedIndex == index,
                            onClick = { secondaryTabSelectedIndex = index },
                            text = {
                                Text(text = title)
                            }
                        )
                    }
                }
            }
        }
    }
}
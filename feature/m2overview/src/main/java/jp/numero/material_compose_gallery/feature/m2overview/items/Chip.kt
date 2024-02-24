package jp.numero.material_compose_gallery.feature.m2overview.items

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FilterChip
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class, ExperimentalMaterialApi::class)
fun LazyListScope.chipsItem() {
    item {
        ComponentItem(
            label = "Chip",
        ) {
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Chip(onClick = { }) {
                    Text("Action Chip")
                }
                Chip(
                    onClick = { },
                    border = ChipDefaults.outlinedBorder,
                    colors = ChipDefaults.outlinedChipColors(),
                ) {
                    Text("Outlined Action Chip")
                }
                var filterChipState by remember { mutableStateOf(false) }
                FilterChip(
                    selected = filterChipState,
                    onClick = { filterChipState = !filterChipState },
                    selectedIcon = {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = null,
                            modifier = Modifier.requiredSize(ChipDefaults.SelectedIconSize)
                        )
                    }) {
                    Text("Filter chip")
                }
                var outlinedFilterChipState by remember { mutableStateOf(false) }
                FilterChip(
                    selected = outlinedFilterChipState,
                    onClick = { outlinedFilterChipState = !outlinedFilterChipState },
                    border = ChipDefaults.outlinedBorder,
                    colors = ChipDefaults.outlinedFilterChipColors(),
                    selectedIcon = {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = null,
                            modifier = Modifier.requiredSize(ChipDefaults.SelectedIconSize)
                        )
                    }) {
                    Text("Outlined Filter chip")
                }
            }
        }
    }
}
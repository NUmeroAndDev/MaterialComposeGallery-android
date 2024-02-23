package jp.numero.material_compose_gallery.feature.m3overview.items

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.AssistChip
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ElevatedSuggestionChip
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
fun LazyListScope.chipsItem() {
    item {
        ComponentItem(
            label = "Chip",
        ) {
            FlowRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                AssistChip(
                    onClick = { },
                    label = {
                        Text("Assist Chip")
                    }
                )

                ElevatedAssistChip(
                    onClick = { },
                    label = {
                        Text("Elevated Assist Chip")
                    }
                )

                var filterChipState by remember { mutableStateOf(false) }
                FilterChip(
                    selected = filterChipState,
                    onClick = { filterChipState = !filterChipState },
                    leadingIcon = if (filterChipState) {
                        {
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = null,
                                modifier = Modifier.requiredSize(FilterChipDefaults.IconSize)
                            )
                        }
                    } else null,
                    label = {
                        Text("Filter chip")
                    }
                )

                var elevatedFilterChipState by remember { mutableStateOf(false) }
                ElevatedFilterChip(
                    selected = elevatedFilterChipState,
                    onClick = { elevatedFilterChipState = !elevatedFilterChipState },
                    leadingIcon = if (elevatedFilterChipState) {
                        {
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = null,
                                modifier = Modifier.requiredSize(FilterChipDefaults.IconSize)
                            )
                        }
                    } else null,
                    label = {
                        Text("Elevated Filter chip")
                    }
                )

                var inputChipState by remember { mutableStateOf(false) }
                ElevatedFilterChip(
                    selected = inputChipState,
                    onClick = { inputChipState = !inputChipState },
                    label = {
                        Text("Input chip")
                    }
                )

                SuggestionChip(
                    onClick = { },
                    label = {
                        Text("Suggestion chip")
                    }
                )

                ElevatedSuggestionChip(
                    onClick = { },
                    label = {
                        Text("Elevated Suggestion chip")
                    }
                )
            }
        }
    }
}
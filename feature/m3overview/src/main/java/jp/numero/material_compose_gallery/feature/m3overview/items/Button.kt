package jp.numero.material_compose_gallery.feature.m3overview.items

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
fun LazyListScope.buttonItem() {
    item {
        ComponentItem(
            label = "Button",
        ) {
            FlowRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Button(onClick = { }) {
                    Text(text = "Button")
                }
                ElevatedButton(onClick = { }) {
                    Text(text = "ElevatedButton")
                }
                FilledTonalButton(onClick = { }) {
                    Text(text = "FilledTonalButton")
                }
                OutlinedButton(onClick = { }) {
                    Text(text = "OutlinedButton")
                }
                TextButton(onClick = { }) {
                    Text(text = "TextButton")
                }
            }
        }
    }
}
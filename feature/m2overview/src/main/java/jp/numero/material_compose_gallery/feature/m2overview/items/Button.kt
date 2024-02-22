package jp.numero.material_compose_gallery.feature.m2overview.items

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
fun LazyListScope.buttonsItem() {
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
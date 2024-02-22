package jp.numero.material_compose_gallery.feature.m2overview.items

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

fun LazyListScope.dialogItem() {
    item {
        ComponentItem(
            label = "Button",
            modifier = Modifier.fillMaxWidth()
        ) {
            var isShowDialog by rememberSaveable { mutableStateOf(false) }
            Button(onClick = { isShowDialog = true }) {
                Text(text = "Show dialog")
            }

            if (isShowDialog) {
                AlertDialog(
                    onDismissRequest = {
                        isShowDialog = false
                    },
                    title = {
                        Text("Title")
                    },
                    text = {
                        Text("Text")
                    },
                    confirmButton = {
                        TextButton(
                            onClick = {
                                isShowDialog = false
                            }
                        ) {
                            Text("Confirm")
                        }
                    },
                    dismissButton = {
                        TextButton(
                            onClick = {
                                isShowDialog = false
                            }
                        ) {
                            Text("Dismiss")
                        }
                    }
                )
            }
        }
    }
}
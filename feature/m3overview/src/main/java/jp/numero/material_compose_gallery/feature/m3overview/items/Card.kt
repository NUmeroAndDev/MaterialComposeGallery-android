package jp.numero.material_compose_gallery.feature.m3overview.items

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun LazyListScope.cardItem() {
    item {
        ComponentItem(
            label = "Card",
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Card",
                        modifier = Modifier.padding(12.dp)
                    )
                }

                ElevatedCard(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "ElevatedCard",
                        modifier = Modifier.padding(12.dp)
                    )
                }

                OutlinedCard(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "OutlinedCard",
                        modifier = Modifier.padding(12.dp)
                    )
                }
            }
        }
    }
}
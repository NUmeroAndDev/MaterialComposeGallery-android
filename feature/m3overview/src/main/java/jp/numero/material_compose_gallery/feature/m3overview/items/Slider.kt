package jp.numero.material_compose_gallery.feature.m3overview.items

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun LazyListScope.sliderItem() {
    item {
        ComponentItem(
            label = "Slider",
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                var sliderPosition by remember { mutableFloatStateOf(0f) }
                Slider(
                    value = sliderPosition,
                    valueRange = 0f..100f,
                    steps = 5,
                    onValueChange = { sliderPosition = it }
                )

                var rangeSliderPosition by remember { mutableStateOf(0f..100f) }
                RangeSlider(
                    value = rangeSliderPosition,
                    onValueChange = { rangeSliderPosition = it },
                    valueRange = 0f..100f,
                    steps = 5,
                )
            }
        }
    }
}
package com.masum.philiplackner

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

@Composable
fun StatesScreen() {
    Column(Modifier.fillMaxSize()) {
        val color = remember { mutableStateOf(Color.Cyan) }
        ColorBox(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            color = color.value,
            updateColor = { color.value = it }
        )
        Box(
            modifier = Modifier
                .background(color.value)
                .weight(1f)
                .fillMaxSize()
        )
    }
}

@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    color: Color,
    updateColor: (Color) -> Unit
) {
    Box(
        modifier = modifier
            .background(color)
            .background(Color.Red)
            .clickable {
                updateColor(
                    Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                        alpha = 1f
                    )
                )
            }
    )
}
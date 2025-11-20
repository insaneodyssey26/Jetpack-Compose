package com.masum.learning.Philip_Lackner

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@Composable
fun EffectHandlers(modifier: Modifier = Modifier) {
    var text by remember {
        mutableStateOf("")
    }
    @Composable
    fun EffectHandlersTheme(modifier: Modifier = Modifier) {
        LaunchedEffect(key1 = text) {
            delay(1000L)
            println("The text is $text")
        }
    }
}



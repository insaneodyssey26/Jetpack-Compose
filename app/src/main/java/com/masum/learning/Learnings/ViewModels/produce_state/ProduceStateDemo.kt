package com.masum.learning.Learnings.ViewModels.produce_state

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.produceState
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@Composable
fun ProduceStateDemo (countUpTo: Int) : State<Int> {
    return produceState (initialValue = 0) {
        while (value < countUpTo) {
            delay(1000L)
            value++
    }
    }
}
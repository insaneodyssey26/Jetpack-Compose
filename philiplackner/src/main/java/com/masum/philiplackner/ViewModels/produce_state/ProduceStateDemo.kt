package com.masum.philiplackner.ViewModels.produce_state

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.produceState
import kotlinx.coroutines.delay

@Composable
fun ProduceStateDemo (countUpTo: Int) : State<Int> {
    return produceState (initialValue = 0) {
        for (i in 1..countUpTo) {
            delay(1000L)
            value = i
        }
    }
}
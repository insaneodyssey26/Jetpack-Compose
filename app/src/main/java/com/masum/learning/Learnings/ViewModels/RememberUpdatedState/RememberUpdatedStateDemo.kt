package com.masum.learning.Learnings.ViewModels.RememberUpdatedState

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@Composable
fun RememberUpdatedStateDemo (
    onTimeout: () -> Unit
) {
    val updatedTimeOut by rememberUpdatedState(onTimeout)
    LaunchedEffect(key1 = true) {
        delay(3000L)
        updatedTimeOut()
    }
}
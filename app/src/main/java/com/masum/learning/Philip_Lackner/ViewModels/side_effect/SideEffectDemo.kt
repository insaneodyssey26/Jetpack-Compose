package com.masum.learning.Philip_Lackner.ViewModels.side_effect

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier

@Composable
fun SideEffect(modifier: Modifier = Modifier) {
    SideEffect {
        println("It gets called after every successful recomposition")
    }
}
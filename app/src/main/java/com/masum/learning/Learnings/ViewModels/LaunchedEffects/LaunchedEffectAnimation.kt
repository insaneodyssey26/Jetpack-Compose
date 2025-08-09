package com.masum.learning.Learnings.ViewModels.LaunchedEffects

import androidx.compose.animation.core.Animatable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun LaunchedEffectAnimation(
    counter: Int
) {
    val animatable = remember {
        Animatable(0f)
    }
    LaunchedEffect(key1 = counter) {
        animatable.animateTo(counter.toFloat())
    }
}
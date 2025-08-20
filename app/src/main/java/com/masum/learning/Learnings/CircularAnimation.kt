package com.masum.learning.Learnings

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CircularProgressBar (
    modifier: Modifier = Modifier,
    percentage : Float,
    number: Int,
    fontSize: TextUnit = 20.sp,
    radius: Dp = 50.dp,
    color: Color = Color.Cyan,
    strokeWidth: Dp = 8.dp,
    animDuration: Int = 1000,
    animDelay : Int = 0
) {
    var isAnimationPlayed by remember {
        mutableStateOf(false)
    }
    val currPercentage = animateFloatAsState(
        targetValue = if (isAnimationPlayed) percentage else 0f,
        animationSpec = tween (
            durationMillis = animDuration,
            delayMillis = animDelay
        )
    )
    LaunchedEffect(true) {
        isAnimationPlayed = true
    }
}
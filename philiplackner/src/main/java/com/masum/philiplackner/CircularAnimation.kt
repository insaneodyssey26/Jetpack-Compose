package com.masum.philiplackner

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CircularProgressBar (
    percentage : Float,
    number: Int,
    fontSize: TextUnit = 20.sp,
    radius: Dp = 50.dp,
    color: Color = Color.Red,
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
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.size(radius * 2f)
    ) {
        Canvas(modifier = Modifier.size(radius *2f)) {
            drawArc(
                color = color,
                -90f,
                360 * currPercentage.value,
                useCenter = false,
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
            )
        }
        Text(
            text = (currPercentage.value * number).toInt().toString(),
            color = Color.Black,
            fontSize = fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}
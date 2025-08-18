package com.masum.learning.Learnings

import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SimpleAnimation(modifier: Modifier = Modifier) {
    var sizeState by remember { mutableStateOf(200.dp) }
    val size by animateDpAsState(
        targetValue = sizeState,
//        tween (
//            durationMillis = 1000,
//            delayMillis = 200,
//            easing = LinearOutSlowInEasing
//        )
//        spring(
//            Spring.DampingRatioMediumBouncy
//        )
        keyframes {
            durationMillis = 5000
            sizeState at 0 using LinearEasing
            sizeState * 1.5f at 1000 using FastOutLinearInEasing
            sizeState * 2f at 5000
        }
        
    )
    Box (
        modifier = Modifier
            .background(Color.Red)
            .size(size),
        contentAlignment = Alignment.Center
    ){
        Button(onClick = {
            sizeState += 50.dp
        }) {
            Text("Click me")
        }
    }
}
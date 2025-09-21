package com.masum.learning.Learnings

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun DropDownMenu (
    text: String,
    modifier: Modifier = Modifier,
    opened: Boolean = false,
    content: @Composable () -> Unit
) {
    var isOpened by remember {
        mutableStateOf(opened)
    }
    val alpha = animateFloatAsState(
        targetValue = if(isOpened) 1f else 0f,
        animationSpec = tween (durationMillis = 300)
    )
    val rotateX = animateFloatAsState(
        targetValue = if(isOpened) 0f else -90f,
        animationSpec = tween (durationMillis = 300)
    )
}
//package com.masum.learning.Learnings
//
//import androidx.compose.foundation.Canvas
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.BoxWithConstraints
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.rotate
//import androidx.compose.ui.geometry.CornerRadius
//import androidx.compose.ui.geometry.Offset
//import androidx.compose.ui.geometry.Size
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.input.pointer.pointerInteropFilter
//import androidx.compose.ui.layout.boundsInWindow
//import androidx.compose.ui.layout.onGloballyPositioned
//import androidx.compose.ui.res.painterResource
//import com.masum.learning.R
//import kotlin.math.PI
//import kotlin.math.atan2
//
//@Composable
//fun VolumeBar(
//    modifier: Modifier = Modifier,
//    activeBars: Int = 0,
//    totalBars: Int = 10
//) {
//    BoxWithConstraints(
//        contentAlignment = Alignment.Center,
//        modifier = modifier
//    ) {
//        var barWidth = remember {
//            constraints.maxWidth / (2f * totalBars)
//        }
//        Canvas(modifier = modifier) {
//            for (i in 0 until totalBars) {
//                drawRoundRect(
//                    color = if (i in 0..activeBars) Color.Green else Color.DarkGray,
//                    topLeft = Offset(i * 2 * barWidth + barWidth + 2f, 0f),
//                    size = Size(barWidth, constraints.maxHeight.toFloat()),
//                    cornerRadius = CornerRadius(0f)
//                )
//            }
//        }
//    }
//}
//@Composable
//fun MusicKnob (
//    modifier: Modifier = Modifier,
//    limitingAngle: Float = 25f,
//    onValueChange: (Float) -> Unit
//) {
//    var rotation by remember {
//        mutableStateOf(limitingAngle)
//    }
//    var touchX by remember {
//        mutableStateOf(0f)
//    }
//    var touchY by remember {
//        mutableStateOf(0f)
//    }
//    var centerX by remember {
//        mutableStateOf(0f)
//    }
//    var centerY by remember {
//        mutableStateOf(0f)
//    }
//    Image(painter = painterResource(
//        R.drawable.music_knob),
//        contentDescription = "Music Knob",
//        modifier = modifier
//            .fillMaxSize()
//            .onGloballyPositioned {
//                val windowBounds = it.boundsInWindow()
//                centerX = windowBounds.size.width / 2f
//                centerY = windowBounds.size.height / 2f
//            }
//            .pointerInteropFilter { event ->
//                touchX = event.x
//                touchY = event.y
//                val angle = -atan2(centerX - touchX, centerY - touchY) * (180f / PI).toFloat()
//                when (event.action) {
//                    android.view.MotionEvent.ACTION_DOWN,
//                    android.view.MotionEvent.ACTION_MOVE -> {
//                        if (angle in -limitingAngle..limitingAngle) {
//                            val fixedAngle = if (angle in -180f..-limitingAngle) {
//                                360f + angle
//                            } else {
//                                angle
//                            }
//                            rotation = fixedAngle
//                            val percent = (fixedAngle - limitingAngle) / (360f - 2 * limitingAngle)
//                            onValueChange(percent)
//                            true
//                        } else {
//                            false
//                        }
//                    }
//                }
//                false
//            }
//            .rotate(rotation)
//    )
//}

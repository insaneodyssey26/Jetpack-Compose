package com.masum.philiplackner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.masum.philiplackner.Timer
import com.masum.philiplackner.ui.theme.AndroidLearningsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLearningsComposeTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Timer(
                        totalTime = 100L * 1000L,
                        handleColor = Color.Green,
                        inactiveBarColor = Color.DarkGray,
                        activeBarColor = Color(0xFF37B900),
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}

package com.masum.learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.masum.learning.Learnings.Timer

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface (
                color = Color(0xFF101010),
                modifier = Modifier.fillMaxSize()
            ){
                Box (
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Timer(
                        totalTime = 13L * 1000L,
                        handleColor = Color(0xFF61E88A),
                        inactiveBarColor = Color(0xFF3D3D3D),
                        activeBarColor = Color(0xFF61E88A),
                        modifier = Modifier.size(200.dp)
                    )
                }
            }
        }
    }
}
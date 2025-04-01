package com.masum.learnings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Row(
                    modifier = Modifier
                       // .fillMaxSize(fraction = 1f) // By default value is set to 1f - This fills the entire screen
                        .width(300.dp)  // Instead of filling the entire screen, this will set the width to 300dp
                        .height(300.dp) // This will set the height to 300dp
                        .background (Color.Cyan), // Sets the background color to Cyan
                horizontalArrangement = Arrangement.SpaceEvenly, // As it's Row, this will be arranged horizontally, Texts will be spaced evenly
                    verticalAlignment = Alignment.CenterVertically // Aligned vertically, as it's a Row, Text comes in center
                ) {
                Text("I")
                Text("Love")
                Text("Saheli")
            }
        }
    }
}


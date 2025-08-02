package com.masum.learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.libertinussans_regular, FontWeight.Normal),
            Font(R.font.libertinussans_bold, FontWeight.Bold),
            Font(R.font.libertinussans_italic, FontWeight.Normal)
        )
        setContent {
            Box( modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF121212))
            ) {
                Text(
                    text = "Why am I doing this shit",
                    color = Color.Cyan,
                    fontSize = 40.sp,
                    fontFamily = fontFamily
                )
            }
        }
    }
}

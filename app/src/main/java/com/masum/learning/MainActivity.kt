package com.masum.learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.masum.learning.Learnings.CircularProgressBar
import com.masum.learning.Learnings.ConstraintLayout
import com.masum.learning.Learnings.EffectHandlers
import com.masum.learning.Learnings.Lists
import com.masum.learning.Learnings.SimpleAnimation
import com.masum.learning.Learnings.Snackbar
import com.masum.learning.Learnings.StatesScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                CircularProgressBar(percentage = 0.8f, number = 100)
            }
        }
    }
}
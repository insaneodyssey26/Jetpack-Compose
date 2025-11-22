package com.masum.learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.masum.learning.Android_CodeLabs.Unit2.Lemonade
import com.masum.learning.Android_CodeLabs.Unit2.TipTimeLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TipTimeLayout()
        }
    }
}
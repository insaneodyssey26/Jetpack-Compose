package com.masum.learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.masum.learning.Android_CodeLabs.Unit2.DiceWithButtonAndImage
import com.masum.learning.Philip_Lackner.MainDropDown

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceWithButtonAndImage()
        }
    }
}
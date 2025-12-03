package com.masum.learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.masum.learning.Android_CodeLabs.Unit3.AffirmationList
import com.masum.learning.Android_CodeLabs.Unit3.Datasource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AffirmationList(
                affirmationList = Datasource().loadAffirmations() // Load affirmations from the data source
            )
        }
    }
}
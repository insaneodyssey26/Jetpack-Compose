package com.masum.learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.masum.learning.Android_CodeLabs.Unit3.AffirmationCard
import com.masum.learning.Android_CodeLabs.Unit3.Datasource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val datasource = Datasource()
            val affirmation = datasource.loadAffirmations().first()
            AffirmationCard(affirmation = affirmation)
        }
    }
}
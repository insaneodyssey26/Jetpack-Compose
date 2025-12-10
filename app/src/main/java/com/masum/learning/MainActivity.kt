package com.masum.learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import com.masum.learning.Android_CodeLabs.Unit3.AffirmationList
import com.masum.learning.Android_CodeLabs.Unit3.AffirmationDatasource
import com.masum.learning.Android_CodeLabs.Unit3.CoursesCard
import com.masum.learning.Android_CodeLabs.Unit3.CoursesGrid
import com.masum.learning.Android_CodeLabs.Unit3.DataSource
import com.masum.learning.Android_CodeLabs.Unit3.DataSource.courses
import com.masum.learning.Android_CodeLabs.Unit3.Superhero.HeroesApp
import com.masum.learning.Android_CodeLabs.Unit3.Superhero.HeroesList
import com.masum.learning.Android_CodeLabs.Unit3.Superhero.HeroesRepository.heroes
import com.masum.learning.Android_CodeLabs.Unit3.WoofApp
import com.masum.learning.ui.theme.WoofTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeroesApp()
        }
    }
}
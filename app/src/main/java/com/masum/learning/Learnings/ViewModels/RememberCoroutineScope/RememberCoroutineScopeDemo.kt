package com.masum.learning.Learnings.ViewModels.RememberCoroutineScope

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun RememberCoroutineScopeDemo() {
    val scope = rememberCoroutineScope()
    Button(onClick =  {
        scope.launch {
            delay(1000L)
            println("Hello Masum")
        }
   }) {

    }
}

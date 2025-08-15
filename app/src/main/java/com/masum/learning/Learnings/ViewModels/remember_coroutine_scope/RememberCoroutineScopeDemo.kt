package com.masum.learning.Learnings.ViewModels.remember_coroutine_scope

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
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

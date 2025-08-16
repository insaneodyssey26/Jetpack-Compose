package com.masum.learning.Learnings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SimpleAnimation(modifier: Modifier = Modifier) {
    var sizeState by remember { mutableStateOf(200.dp) }
    Box (
        modifier = Modifier
            .background(Color.Red)
            .size(sizeState),
        contentAlignment = Alignment.Center
    ){
        Button(onClick = {
            sizeState += 50.dp
        }) {
            Text("Click me")
        }
    }
}
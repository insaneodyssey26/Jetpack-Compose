package com.masum.learning.Learnings

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ConstraintSet

@Composable
fun ConstraintLayout (modifier: Modifier = Modifier) {
    val constraints = ConstraintSet {
        val greenBox = createRefFor("greenBox")
        val redBox = createRefFor("redBox")
        constrain(greenBox) {

        }
    }
}
package com.masum.learning.Android_CodeLabs.Unit2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.masum.learning.R

@Composable
fun ArtSpaceApp(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
        ) {
            Image(
                painter = painterResource(R.drawable.test_image),
                contentDescription = "Test Image"
            )
        }
    }
}
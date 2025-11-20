package com.masum.learning.Android_CodeLabs.Unit2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.masum.learning.R

@Preview
@Composable
fun DiceWithButtonAndImage(
    modifier: Modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)  // center all the content
) {
    // we are using remember to store the state of the dice roll, as the value of result can change
    var result by remember { mutableStateOf(1) }
    val imageResource = when (result) { // select the image based on the result value
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    Column( // arrange items in a column
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(imageResource), // display the dice image from previously used value (imageResource)
            contentDescription = "Dice Image"
        )
        Button(
            // when the button is clicked, we change the value of result to a random number between 1 and 6
            onClick = { result = (1..6).random() }
        ) {
            // this is the text inside the button, we are using string resources for localization support
            Text(stringResource(R.string.roll))
        }
    }
}
package com.masum.learning.Android_CodeLabs.Unit2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.masum.learning.R
import com.masum.learning.ui.theme.Lemonadebg

@Composable
fun Lemonade(
    modifier: Modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
) {
    var currentStep by remember { mutableStateOf(1) }  // state to determine the current step
    var squeezeCount by remember { mutableStateOf(0) } // state to count squeezes needed

    val imageResource = when (currentStep) { // select image based on current step
        1 -> R.drawable.lemon_tree // step 1: lemon tree
        2 -> R.drawable.lemon_squeeze // step 2: squeezing lemon
        3 -> R.drawable.lemon_drink // step 3: drinking lemonade
        4 -> R.drawable.lemon_restart // step 4: empty glass
        else -> R.drawable.lemon_tree // default to lemon tree
    }

    val textResource = when (currentStep) { // select text based on current step
        1 -> R.string.tap_lemon_tree // step 1 : tap lemon tree
        2 -> R.string.squeeze_lemon // step 2 : squeeze lemon
        3 -> R.string.drink_lemonade // step 3 : drink lemonade
        4 -> R.string.empty_glass // step 4 : empty glass
        else -> R.string.tap_lemon_tree // default to tap lemon tree
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LemonStep(
            imageRes = imageResource, // pass selected image resource
            textRes = textResource, // pass selected text resource
            onClick = {
                when (currentStep) { // handle click based on current step
                    1 -> { // when tapping the lemon tree, move to squeezing step
                        currentStep = 2 // move to step 2
                        squeezeCount = (2..4).random() // random squeezes between 2 and 4
                    }
                    2 -> { // when squeezing the lemon
                        squeezeCount-- // decrement squeeze count, because one squeeze is done
                        if (squeezeCount == 0) { // if all squeezes are done
                            currentStep = 3 // move to drinking step
                        }
                    }
                    3 -> currentStep = 4 // when drinking lemonade, move to empty glass step
                    4 -> currentStep = 1 // when tapping empty glass, restart to lemon tree
                }
            }
        )
    }
}

@Composable
fun LemonStep( // this composable displays the image and text for each step, basically the UI for each step
    imageRes: Int, // image resource id passed as parameter
    textRes: Int, // text resource id passed as parameter
    onClick: () -> Unit // lambda function to handle click events
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(imageRes), // load image from resources based on imageRes
            contentDescription = stringResource(textRes), // content description for accessibility
            modifier = Modifier
                .background(Lemonadebg, shape = RoundedCornerShape(30.dp))
                .size(190.dp)
                .clickable { onClick() } // handle click events by invoking onClick lambda
        )
        Spacer(modifier = Modifier.padding(12.dp))
        Text(
            text = stringResource(textRes), // load text from resources based on textRes
            fontSize = 16.sp
        )
    }
}


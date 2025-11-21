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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
    var currentStep by remember { mutableStateOf(1) }

    val imageResource = when (currentStep) {
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        4 -> R.drawable.lemon_restart
        else -> R.drawable.lemon_tree
    }

    val textResource = when (currentStep) {
        1 -> R.string.tap_lemon_tree
        2 -> R.string.squeeze_lemon
        3 -> R.string.drink_lemonade
        4 -> R.string.empty_glass
        else -> R.string.tap_lemon_tree
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(imageResource),
            contentDescription = "Lemonade Step",
            modifier = Modifier
                .background(Lemonadebg, shape = RoundedCornerShape(30.dp))
                .size(190.dp)
                .clickable {
                    currentStep = if (currentStep < 4) currentStep + 1 else 1
                }
        )
        Spacer(modifier = Modifier.padding(12.dp))
        Text(
            fontSize = 16.sp,
            text = stringResource(textResource)
        )
    }
}

package com.masum.learning.Android_CodeLabs.Unit2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun Lemonade (
    modifier: Modifier = Modifier
        .fillMaxSize()
    .wrapContentSize(Alignment.Center)
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(R.drawable.lemon_tree),
            contentDescription = "Lemon Tree",
            modifier = Modifier
                .background(Lemonadebg, shape = RoundedCornerShape(30.dp))
                .size(190.dp)
        )
        Spacer(modifier = Modifier.padding(12.dp))
        Text(
            fontSize = 16.sp,
            text = stringResource(R.string.tap_lemon_tree)
        )
    }
}
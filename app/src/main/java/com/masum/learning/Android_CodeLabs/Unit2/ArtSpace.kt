package com.masum.learning.Android_CodeLabs.Unit2

import android.R.attr.text
import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.masum.learning.R

@Composable
fun ArtSpaceApp(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
//        Box(
//            modifier = Modifier
//                .fillMaxSize(),
//            contentAlignment = Alignment.Center
//        ) {
            Column(
             //   horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.weight(1f)
            ) {
                Image(
                    painter = painterResource(R.drawable.test_image),
                    contentDescription = "Test Image",
                    modifier = Modifier
                        .padding(30.dp)
                )
                val name = stringResource(R.string.author_name)
                val year = stringResource(R.string.year)
                Text(
                    text = "Just Trying Out Some Some Stuff To Learn Jetpack Compose",
                    fontSize = 30.sp,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 10.dp)
                )
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )) {
                            append(name)
                        }
                        append(" ")
                        append(year)
                    },
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 5.dp)
                )
         //   }
        }
    }
}
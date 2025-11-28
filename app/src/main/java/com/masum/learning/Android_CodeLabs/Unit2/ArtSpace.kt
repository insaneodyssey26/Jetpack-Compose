package com.masum.learning.Android_CodeLabs.Unit2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.masum.learning.R
import com.masum.learning.ui.theme.ArtButtons

@Composable
fun ArtSpaceApp(
    modifier: Modifier = Modifier
) {
    val artworkList = listOf(
        R.drawable.test_image,
        R.drawable.test_image2,
    )
    val currentImage by remember { mutableStateOf(0) }
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.weight(1f)
            ) {
                Card(
                    modifier = Modifier
                        .padding(horizontal = 30.dp, vertical = 16.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
                ) {
                    Box(modifier = Modifier.padding(16.dp)) {
                        Image(
                            painter = painterResource(R.drawable.test_image),
                            contentDescription = "Test Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(1f)
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(50.dp))
                val name = stringResource(R.string.author_name)
                val year = stringResource(R.string.year)

                Text(
                    text = "Just Trying Out Some Stuff To Learn Jetpack Compose",
                    fontSize = 30.sp,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 10.dp)
                )
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            )
                        ) {
                            append(name)
                        }
                        append(" ")
                        append(year)
                    },
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 5.dp)
                )
                Spacer(modifier = Modifier.padding(bottom = 20.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Button(
                        enabled = false,
                        onClick = {  },
                        colors = ButtonDefaults.buttonColors(
//                            containerColor = Color.Magenta,
//                            contentColor = Color.White,
                            disabledContainerColor = ArtButtons,
                            disabledContentColor = Color.White

                        ),
                        modifier = Modifier
                            .padding(start = 20.dp, top = 50.dp)
                            .weight(1f)
                    ) {
                        Text(
                            text = "Previous"
                        )
                    }
                    Spacer(modifier = Modifier.padding(start = 50.dp))
                    Button(
                        enabled = false,
                        onClick = {  },
                        colors = ButtonDefaults.buttonColors(
//                            containerColor = Color.Magenta,
//                            contentColor = Color.White,
                            disabledContainerColor = ArtButtons,
                            disabledContentColor = Color.White

                        ),
                        modifier = Modifier
                            .padding(end = 20.dp, top = 50.dp)
                            .weight(1f)
                    ) {
                        Text(
                            text = "Next"
                        )
                    }
                }
            }
    }
}
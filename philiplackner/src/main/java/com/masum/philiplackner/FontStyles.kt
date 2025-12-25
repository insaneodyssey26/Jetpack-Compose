package com.masum.philiplackner

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.masum.philiplackner.R

@Composable
fun FontStyle(modifier: Modifier = Modifier) {
    val fonts = FontFamily(
        Font(R.font.libertinussans_regular),
        Font(R.font.libertinussans_bold),
        Font(R.font.libertinussans_italic)
    )
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF121212)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp,
                    )
                ) {
                    append("W")
                }
                append("hy")
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp,
                    )
                ) {
                    append("T")
                }
                append("he ")
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp,
                    )
                ) {
                    append("H")
                }
                append("ell ")
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp,
                    )
                ) {
                    append("I ")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp,
                    )
                ) {
                    append("A")
                }
                append("m ")
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp,
                    )
                ) {
                    append("D")
                }
                append("oing ")
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp,
                    )
                ) {
                    append("T")
                }
                append("his!")
            },
            color = Color.Cyan,
            fontSize = 40.sp,
            fontFamily = fonts,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center
        )
    }
}

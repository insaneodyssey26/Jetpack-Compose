
// These are imported codes from my another package, so lots of errors are here. But these are just for basic logic understanding.

package com.masum.learning.Android_CodeLabs.Unit1_Old

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.masum.codelabs.ui.theme.CodelabsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodelabsTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GoodLuckImage(
                        message = stringResource(R.string.good_luck_text),
                        from = stringResource(R.string.from_text),
                    )
                }
            }
        }
    }
}

@Composable
fun GoodLuck (message: String, from: String) {
    Box(modifier = Modifier.fillMaxSize()){
        Column (
            modifier = Modifier
                .align(Alignment.TopCenter)
        ) {
            Text(
                text = message,
                fontSize = 50.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 100.sp,
                modifier = Modifier
                    .padding(67.dp)
            )
            Text(
                text = stringResource(R.string.message_text),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 30.sp,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(20.dp)
            )
        }
        Text(
            text = from,
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(20.dp)
                .align(alignment = Alignment.BottomCenter)
        )
    }
}
@Preview (showBackground = true)
@Composable
fun GoodLuckPreview() {
    CodelabsTheme {
        GoodLuckImage(
            message = stringResource(R.string.good_luck_text),
            from = stringResource(R.string.from_text)
        )
    }
}

@Composable
fun GoodLuckImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.usghibli)
    Box (modifier = modifier.fillMaxSize()) {
        Image(
            modifier = modifier.fillMaxSize(),
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GoodLuck(
            message = message,
            from = from
        )
    }
}
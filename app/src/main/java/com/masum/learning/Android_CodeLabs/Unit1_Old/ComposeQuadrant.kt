//package com.masum.learning.Android_CodeLabs.Unit1_Old
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import com.masum.composequadrant.ui.theme.ComposeQuadrantTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            ComposeQuadrantTheme {
//                Surface(modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    QuadrantScreen()
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun QuadrantScreen() {
//    Column(Modifier.fillMaxWidth()) {
//        Row(Modifier.weight(1f)) {
//            Cards(
//                title = stringResource(R.string.text_composable_title),
//                description = stringResource(R.string.text_composable_description),
//                backgroundColor = Color(0xFFEADDFF),
//                modifier = Modifier.weight(1f)
//            )
//            Cards(
//                title = stringResource(R.string.image_composable_title),
//                description = stringResource(R.string.image_composable_description),
//                backgroundColor = Color(0xFFFFD180),
//                modifier = Modifier.weight(1f),
//            )
//        }
//        Row(Modifier.weight(1f)) {
//            Cards(
//                title = stringResource(R.string.row_composable_title),
//                description = stringResource(R.string.row_composable_description),
//                backgroundColor = Color(0xFFB9FBC0),
//                modifier = Modifier.weight(1f),
//            )
//            Cards(
//                title = stringResource(R.string.column_composable_title),
//                description = stringResource(R.string.column_composable_description),
//                backgroundColor = Color(0xFFCFD8DC),
//                modifier = Modifier.weight(1f),
//            )
//        }
//    }
//}
//
//@Composable
//fun Cards(
//    title: String,
//    description: String,
//    backgroundColor: Color,
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier = modifier
//            .fillMaxSize()
//            .background(backgroundColor)
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text = title,
//            modifier = Modifier.padding(bottom = 16.dp),
//            fontWeight = FontWeight.Bold
//        )
//        Text(
//            text = description,
//            textAlign = TextAlign.Justify
//        )
//    }
//}
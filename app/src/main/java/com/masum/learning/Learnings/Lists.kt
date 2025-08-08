package com.masum.learning.Learnings

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Composable

// Normal column with scroll

//fun Lists (modifier: Modifier = Modifier) {
//    val scrollState: ScrollState = rememberScrollState()
//    Column (
//        modifier = Modifier.verticalScroll(scrollState)
//    ) {
//        for (i in 1..50) {
//            Text(
//                text  = "Item $i",
//                fontSize = 24.sp,
//                fontWeight = FontWeight.Bold,
//                textAlign = TextAlign.Center,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(vertical = 24.dp)
//            )
//        }
//    }
//}
// We have to manually make columns sccrollable, which is not the case with LazyColumn.... They are scrollable by default
// LazyColumn is more efficient for large lists as it only composes and lays out the visible items, while Column with verticalScroll will compose all items at once, which can lead to performance issues with large datasets.
// Here's the lazycolumn version:
@Composable
fun Lists(modifier: Modifier = Modifier) {
    LazyColumn {
        items(5000) {
            Text(
                text = "Item $it",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
            )
        }
    }
}
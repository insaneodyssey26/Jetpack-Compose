package com.masum.courses

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.masum.courses.R

@Composable
fun CoursesCard(
    modifier: Modifier = Modifier,
    courses: Courses
) {
    Card(modifier = modifier) {
        Row {
            Image(
                painter = painterResource(courses.imageResource),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(70.dp)
            )

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = stringResource(courses.courseName),
                    style = MaterialTheme.typography.bodyMedium
                )

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.ic_grain),
                        contentDescription = null
                    )
                    Text(
                        text = courses.courseCount.toString(),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}



@Composable
fun CoursesGrid (
    modifier: Modifier = Modifier,
    coursesList: List<Courses>
) {
    LazyVerticalGrid (
        columns = androidx.compose.foundation.lazy.grid.GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .padding(8.dp)
    ){
        items(coursesList) { coursesList ->
            CoursesCard(
                courses = coursesList,
                modifier = Modifier
            )
        }
    }
}

package com.masum.learning.Android_CodeLabs.Unit3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.masum.learning.R

@Composable
fun CoursesCard (
    modifier: Modifier = Modifier,
    courses: Courses
) {
    Card (
        modifier = modifier
    ) {
        Card {
            Row {
                Box {
                    Image(
                        painter = painterResource(courses.imageResource),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                    Column {
                        Text(
                            text = stringResource(courses.courseName),
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            text = stringResource(courses.courseCount),
                            style = MaterialTheme.typography.labelMedium
                        )
                        Row (
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.ic_grain),
                                contentDescription = null
                            )
                            Text(
                                text = stringResource(courses.courseCount),
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                }
            }
        }
    }
}

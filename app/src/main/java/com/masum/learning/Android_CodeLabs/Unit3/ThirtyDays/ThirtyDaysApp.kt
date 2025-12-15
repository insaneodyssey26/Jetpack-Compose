package com.masum.learning.Android_CodeLabs.Unit3.ThirtyDays

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.masum.learning.R

@Composable
fun EachCard (
    characters: Characters,
    modifier: Modifier = Modifier
) {
    Card (
        elevation = CardDefaults.cardElevation(5.dp),
        modifier = modifier
            .padding(20.dp)
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = stringResource(characters.characterCount),
                style = TypographyThirtyDays.displayMedium,
                modifier = Modifier
                    .padding(10.dp)
            )
            Text(
                text = stringResource(characters.character),
                style = TypographyThirtyDays.displaySmall,
                modifier = Modifier
                    .padding(10.dp)
            )
        }
    }
}
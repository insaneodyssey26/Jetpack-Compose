package com.masum.learning.Android_CodeLabs.Unit3.ThirtyDays

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
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
            Image(
                painter = painterResource(characters.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
            )
        }
    }
}

@Preview
@Composable
private fun CharacterPreview() {
    EachCard(
        characters = ThirtyDaysRepository.characters[0],
        modifier = Modifier.fillMaxSize()
    )
}
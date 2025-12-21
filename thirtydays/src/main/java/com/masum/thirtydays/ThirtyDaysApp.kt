package com.masum.thirtydays

import android.R.attr.onClick
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButtonDefaults.elevation
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.ModifierLocalModifierNode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.masum.thirtydays.ThirtyDaysRepository.characters
import com.masum.thirtydays.R


@Composable
fun CardsWithList() {
    Scaffold(
        topBar = { ThirtyDaysTopbar() }
    ) {
        padding ->
        LazyColumn(contentPadding = padding) {
            items(characters) {
                EachCard(
                    characters = it,
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {  }
                )
            }
        }
    }
}
@Composable
fun EachCard (
    characters: Characters,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = { }
) {
    Card (
        onClick = onClick,
        elevation = CardDefaults.cardElevation(5.dp),
        modifier = modifier
            .padding(top = 10.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = stringResource(characters.characterCount),
                style = TypographyThirtyDays.displayMedium,
                modifier = Modifier
                    .padding(12.dp)
            )
            Text(
                text = stringResource(characters.character),
                style = TypographyThirtyDays.displaySmall,
                modifier = Modifier
                    .padding(12.dp)
            )
            Image(
                painter = painterResource(characters.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
                    .shadow(elevation = 200.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .size(200.dp)
            )
            Text(
                text = stringResource(characters.charDescription),
                style = TypographyThirtyDays.bodyLarge,
                modifier = Modifier
                    .padding(12.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirtyDaysTopbar (
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Text(
                text = stringResource(R.string.days_app_name),
                style = TypographyThirtyDays.displayLarge,
                fontWeight = FontWeight.Bold
            )
        },
        modifier = modifier
    )
}

@Preview
@Composable
private fun CharacterPreview() {
    EachCard(
        characters = ThirtyDaysRepository.characters[0],
        modifier = Modifier.fillMaxSize()
    )
}
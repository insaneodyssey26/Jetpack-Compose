package com.masum.learning.Android_CodeLabs.Unit3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun AffirmationCard ( // Composable for each affirmation card
    modifier: Modifier = Modifier,
    affirmation: Affirmation // Affirmation data object
) {
    Card(
        modifier = modifier
    ) {
        Column {
            Image(
                painter = painterResource(affirmation.imageResourceId),
                contentDescription = stringResource(affirmation.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(190.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(affirmation.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Composable
fun AffirmationList (
    affirmationList: List<Affirmation>, // List of affirmation data objects
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = Modifier
    ) {
        items(affirmationList) { affirmation -> // Iterate through each affirmation
            AffirmationCard(
                affirmation = affirmation, // Pass the affirmation object to the card
                modifier = Modifier.padding(8.dp) // Add padding around each card
            )
        }
    }
}
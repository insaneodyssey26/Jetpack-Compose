package com.masum.learning.Learnings.ViewModels.snapshot_flow

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.mapNotNull

@Composable
fun SnapshotFlowDemo(modifier: Modifier = Modifier) {
    val scaffoldState = rememberScaffoldState()
    LaunchedEffect(scaffoldState) {
        snapshotFlow { scaffoldState.snackbarHostState.currentSnackbarData?.message }
            .mapNotNull { it }
            .distinctUntilChanged()
            .collect { message ->
                println("A snackbar with message '$message' was shown.")
            }
    }
}
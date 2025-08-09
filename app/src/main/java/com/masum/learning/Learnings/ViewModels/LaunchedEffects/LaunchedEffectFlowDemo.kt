package com.masum.learning.Learnings.ViewModels.LaunchedEffects

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier

@Composable
fun LaunchedEffectFlowDemo(
    viewModel: LaunchedEffectViewModel
) {
    LaunchedEffect(key1 = true) {
        viewModel.sharedFlow.collect { event ->
            when(event) {
                is LaunchedEffectViewModel.ScreenEvents.showSnackBar -> {

                }
                is LaunchedEffectViewModel.ScreenEvents.navigate -> {

                }
            }
        }
    }
}
package com.masum.learning.Learnings.ViewModels.launched_effect

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

// ViewModel handles UI event using SharedFlow and coroutine
class LaunchedEffectViewModel : ViewModel () {
    // MutableSharedFlow is used to share events with the UI
    private val _sharedFlow = MutableSharedFlow<ScreenEvents> ()
    // Shared flow is used for observing events in the UI
    val sharedFlow = _sharedFlow.asSharedFlow()

    init {
        // Coroutine starts when ViewModel is launched
        viewModelScope.launch {
            // A event is sent with a message to showSnackBar in ScreenEvents
            _sharedFlow.emit(ScreenEvents.showSnackBar("Hello Masum"))
        }
    }

    sealed class ScreenEvents {
        // This snackbar shows event with a message
        data class showSnackBar (val message: String) : ScreenEvents()
        // Route is used for navigation events
        data class navigate (val route: String) : ScreenEvents()
    }
}
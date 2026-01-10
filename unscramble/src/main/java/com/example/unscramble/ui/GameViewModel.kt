package com.example.unscramble.ui

import androidx.lifecycle.ViewModel
import com.example.unscramble.data.allWords
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class GameViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(GameUiState())
    val uiState: StateFlow<GameUiState> = _uiState.asStateFlow()
    private lateinit var currentWord: String
    private var usedWords: MutableSet<String> = mutableSetOf()

    private fun pickRandomWord(): String {
        currentWord = allWords.random()
        if (usedWords.contains(currentWord)) {
            return pickRandomWord()
        } else {
            usedWords.add(currentWord)
         //   return shuffleCurrentWord(currentWord)
        }
    }

}
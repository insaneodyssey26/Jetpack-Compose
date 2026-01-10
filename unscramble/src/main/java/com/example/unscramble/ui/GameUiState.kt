package com.example.unscramble.ui

data class GameUiState(
    val currentScrambledWord: String = "",
    val isGuessWrong: Boolean = false,
    val score: Int = 0,
    val currentWordCount: Int = 1
)

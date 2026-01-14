package com.masum.unscrambleUnitTest.ui.test

import com.masum.unscrambleUnitTest.data.SCORE_INCREASE
import com.masum.unscrambleUnitTest.ui.GameViewModel
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertFalse
import org.junit.Test

class GameViewModelTest {
    private val viewModel = GameViewModel()

    @Test
    fun gameViewModel_CorrectWordGuessed_ScoreUpdatedAndErrorFlagUnset()  {
        var currentGameUiTest = viewModel.uiState.value
        val correctPlayerWord = getUnscrambledWord(currentGameUiTest.currentScrambledWord)

        viewModel.updateUserGuess(correctPlayerWord)
        viewModel.checkUserGuess()

        currentGameUiTest = viewModel.uiState.value
        assertFalse(currentGameUiTest.isGuessedWordWrong)
        assertEquals(20, currentGameUiTest.score)
    }
    companion object {
        private const val SCORE_AFTER_FIRST_CORRECT_ANSWER = SCORE_INCREASE
    }
}
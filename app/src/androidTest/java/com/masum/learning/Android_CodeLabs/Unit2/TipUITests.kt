//// This is Instrumented Unit Test for Tip Calculator UI
//// And I don't understand this fucking thing at all
//// I just copied it from the official codelab and pasted it here
//// I will figure it out later
//
//package com.masum.learning.Android_CodeLabs.Unit2
//
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.Surface
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.test.assertTextEquals
//import androidx.compose.ui.test.junit4.createComposeRule
//import androidx.compose.ui.test.onNodeWithTag
//import androidx.compose.ui.test.performTextInput
//import com.masum.learning.ui.theme.AppTheme
//import org.junit.Rule
//import org.junit.Test
//import java.text.NumberFormat
//
//class TipUITests {
//
//    @get:Rule
//    val composeTestRule = createComposeRule()
//
//    @Test
//    fun calculate_20_percent_tip() {
//        composeTestRule.setContent {
//            TipTimeTheme {
//                Surface (modifier = Modifier.fillMaxSize()){
//                    TipTimeLayout()
//                }
//            }
//        }
//        composeTestRule.onNodeWithText("Bill Amount").performTextInput("10")
//        composeTestRule.onNodeWithText("Tip Percentage").performTextInput("20")
//        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
//        composeTestRule.onNodeWithText("Tip Amount: $expectedTip").assertExists(
//            "No node with this text was found."
//        )
//    }
//}
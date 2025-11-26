package com.masum.learning.Android_CodeLabs.Unit2

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {
    @Test
    fun testCalculateTip() {
        val amount = 100.0
        val tipPercent = 15.0
        val roundUp = false
        val expectedTip = NumberFormat.getCurrencyInstance().format(15)
        val actualTip = calculateTip(amount, tipPercent, roundUp)
        assertEquals(actualTip, expectedTip)
    }
}
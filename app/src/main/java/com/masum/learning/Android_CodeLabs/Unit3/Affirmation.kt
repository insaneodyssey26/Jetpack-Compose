package com.masum.learning.Android_CodeLabs.Unit3

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// This is the data class to represent an affirmation
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)

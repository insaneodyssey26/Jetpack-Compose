package com.masum.affirmation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// This is the data class to represent an affirmation
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)

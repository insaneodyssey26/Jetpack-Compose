package com.masum.learning.Android_CodeLabs.Unit3.ThirtyDays

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Characters(
    @StringRes val characterCount: Int,
    @StringRes val character: Int,
    @StringRes val charDescription: Int,
    @DrawableRes val image: Int
)

package com.masum.learning.Android_CodeLabs.Unit3.ThirtyDays

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ThirtyDaysDataclass(
    @StringRes val character: Int,
    @StringRes val charDescription: Int,
    @DrawableRes val image: Int
)

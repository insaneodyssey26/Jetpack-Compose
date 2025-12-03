package com.masum.learning.Android_CodeLabs.Unit3

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Courses(
    @StringRes val courseName: Int,
    val courseCount: Int,
    @DrawableRes val imageResource: Int
)

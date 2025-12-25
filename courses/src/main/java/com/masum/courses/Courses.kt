package com.masum.courses

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Courses(
    @StringRes val courseName: Int,
    val courseCount: Int,
    @DrawableRes val imageResource: Int
)

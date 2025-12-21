package com.masum.woof.ui.theme

import android.app.Activity
import android.os.Build
import android.view.View
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColors = lightColorScheme(
    primary = Color(0xFF006688),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFC2E8FF),
    onPrimaryContainer = Color(0xFF001E2B),
    secondary = Color(0xFF4E616D),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFD1E5F4),
    onSecondaryContainer = Color(0xFF0A1E28),
    tertiary = Color(0xFF5E5A7D),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFE4DFFF),
    onTertiaryContainer = Color(0xFF1A1835),
    error = Color(0xFFBA1A1A),
    errorContainer = Color(0xFFFFDAD6),
    onError = Color(0xFFFFFFFF),
    onErrorContainer = Color(0xFF410002),
    background = Color(0xFFFBFCFF),
    onBackground = Color(0xFF191C1E),
    surface = Color(0xFFFBFCFF),
    onSurface = Color(0xFF191C1E),
    surfaceVariant = Color(0xFFDCE3EA),
    onSurfaceVariant = Color(0xFF40484D),
    outline = Color(0xFF70787E),
    inverseOnSurface = Color(0xFFF0F0F4),
    inverseSurface = Color(0xFF2E3133),
    inversePrimary = Color(0xFF7BD0FF),
    surfaceTint = Color(0xFF006688),
    outlineVariant = Color(0xFFC0C7CD),
    scrim = Color(0xFF000000),
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFF7BD0FF),
    onPrimary = Color(0xFF003549),
    primaryContainer = Color(0xFF004C67),
    onPrimaryContainer = Color(0xFFC2E8FF),
    secondary = Color(0xFFB5CAD6),
    onSecondary = Color(0xFF20333D),
    secondaryContainer = Color(0xFF364954),
    onSecondaryContainer = Color(0xFFD1E5F4),
    tertiary = Color(0xFFC8C3EA),
    onTertiary = Color(0xFF2E2B4B),
    tertiaryContainer = Color(0xFF454263),
    onTertiaryContainer = Color(0xFFE4DFFF),
    error = Color(0xFFFFB4AB),
    errorContainer = Color(0xFF93000A),
    onError = Color(0xFF690005),
    onErrorContainer = Color(0xFFFFDAD6),
    background = Color(0xFF0F1417),
    onBackground = Color(0xFFE1E2E6),
    surface = Color(0xFF0F1417),
    onSurface = Color(0xFFE1E2E6),
    surfaceVariant = Color(0xFF40484D),
    onSurfaceVariant = Color(0xFFC0C7CD),
    outline = Color(0xFF8A9298),
    inverseOnSurface = Color(0xFF0F1417),
    inverseSurface = Color(0xFFE1E2E6),
    inversePrimary = Color(0xFF006688),
    surfaceTint = Color(0xFF7BD0FF),
    outlineVariant = Color(0xFF40484D),
    scrim = Color(0xFF000000),
)

@Composable
fun WoofTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColors
        else -> LightColors
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            setUpEdgeToEdge(view, darkTheme)
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        shapes = androidx.compose.material3.Shapes(),
        typography = androidx.compose.material3.Typography(),
        content = content
    )
}

private fun setUpEdgeToEdge(view: View, darkTheme: Boolean) {
    val window = (view.context as Activity).window
    WindowCompat.setDecorFitsSystemWindows(window, false)
    window.statusBarColor = Color.Transparent.toArgb()
    val navigationBarColor = when {
        Build.VERSION.SDK_INT >= 29 -> Color.Transparent.toArgb()
        Build.VERSION.SDK_INT >= 26 -> Color(0xFF, 0xFF, 0xFF, 0x63).toArgb()
        else -> Color(0x00, 0x00, 0x00, 0x50).toArgb()
    }
    window.navigationBarColor = navigationBarColor
    val controller = WindowCompat.getInsetsController(window, view)
    controller.isAppearanceLightStatusBars = !darkTheme
    controller.isAppearanceLightNavigationBars = !darkTheme
}
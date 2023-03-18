package com.opentry.android_storage_samples.scopedstorage.common

import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver

/**
 * Composite of local content color at 12% alpha over background color, used by borders.
 */
@Composable
fun compositeBorderColor(): Color = LocalContentColor.current.copy(alpha = BorderAlpha)
    .compositeOver(MaterialTheme.colors.background)

private const val BorderAlpha = 0.12f
package com.ajp.discover.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Calculating sweep angle
 * 0% => 0 degrees
 * 100% => 360 degrees
 *
 * for x%,
 * y = 360 * x / 100
 */
@Composable
fun CircularProgress(
    modifier: Modifier = Modifier,
    percentProgress: Float = 0f,
    size: Dp = 100.dp,
    strokeWidth: Dp = 10.dp,
    startAngle: Float = -90f,
    progressColor: Color = Color.Magenta,
    pathColor: Color = Color.Gray.copy(alpha = 0.3f)
) {

    val sweepAngle = (360f * percentProgress / 100)
    val fSize = convertDpToPx(dp = size)
    val fStrokeWidth = convertDpToPx(dp = strokeWidth)

        Canvas(
            modifier = modifier.background(Color.Transparent)
        ) {
            drawArc(
                size = Size(fSize, fSize),
                color = pathColor,
                style = Stroke(
                    width = fStrokeWidth,
                    cap = StrokeCap.Round
                ),
                startAngle = startAngle,
                sweepAngle = 360f,
                useCenter = false,
            )

            drawArc(
                size = Size(fSize, fSize),
                color = progressColor,
                style = Stroke(width = fStrokeWidth, cap = StrokeCap.Round),
                startAngle = startAngle,
                sweepAngle = sweepAngle,
                useCenter = false
            )
        }

}

@Composable
fun convertDpToPx(dp: Dp): Float {
    val density = LocalDensity.current.density
    return dp.value * density
}


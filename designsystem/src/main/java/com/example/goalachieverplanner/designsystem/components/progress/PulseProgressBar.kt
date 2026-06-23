package com.example.goalachieverplanner.designsystem.components.progress

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import com.example.goalachieverplanner.designsystem.theme.AppTheme
import com.example.goalachieverplanner.designsystem.theme.Radius4
import com.example.goalachieverplanner.designsystem.theme.Space8

@Composable
fun PulseProgressBar(
    progress: Float,
    modifier: Modifier = Modifier
) {
    LinearProgressIndicator(
        progress = { progress },
        modifier = modifier
            .fillMaxWidth()
            .height(Space8)
            .clip(RoundedCornerShape(Radius4)),
        color = MaterialTheme.colorScheme.primary,
        trackColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.3f),
        strokeCap = StrokeCap.Round
    )
}

@Preview(showBackground = true)
@Composable
fun PulseProgressBarPreview() {
    AppTheme {
        PulseProgressBar(progress = 0.63f)
    }
}

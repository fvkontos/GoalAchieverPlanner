package com.example.goalachieverplanner.designsystem.components.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.goalachieverplanner.designsystem.theme.AppTheme
import com.example.goalachieverplanner.designsystem.theme.BorderLight
import com.example.goalachieverplanner.designsystem.theme.Radius24
import com.example.goalachieverplanner.designsystem.theme.Space1
import com.example.goalachieverplanner.designsystem.theme.Space16
import com.example.goalachieverplanner.designsystem.theme.Space24

@Composable
fun PulseCard(
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colorScheme.surface,
    borderColor: Color = BorderLight,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(Radius24),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        border = BorderStroke(Space1, borderColor)
    ) {
        Column(
            modifier = Modifier.padding(Space24),
            content = content
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PulseCardPreview() {
    AppTheme {
        PulseCard(modifier = Modifier.padding(Space16)) {
            Text(text = "TOTAL PROGRESS", style = MaterialTheme.typography.labelLarge)
            Text(text = "63%", style = MaterialTheme.typography.headlineLarge)
        }
    }
}

package com.example.goalachieverplanner.designsystem.components.cards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.goalachieverplanner.designsystem.theme.AppTheme
import com.example.goalachieverplanner.designsystem.theme.Radius24
import com.example.goalachieverplanner.designsystem.theme.Space16
import com.example.goalachieverplanner.designsystem.theme.Space20

@Composable
fun StreakCard(
    streakValue: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(Radius24),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary)
    ) {
        Column(modifier = Modifier.padding(Space20)) {
            Text(
                text = "CURRENT STREAK",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.8f)
            )
            Text(
                text = "$streakValue \uD83D\uDD25",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StreakCardPreview() {
    AppTheme {
        StreakCard(streakValue = "5 Days", modifier = Modifier.padding(Space16))
    }
}

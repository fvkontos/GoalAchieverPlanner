package com.example.goalachieverplanner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.goalachieverplanner.designsystem.components.cards.PulseCard
import com.example.goalachieverplanner.designsystem.components.cards.StreakCard
import com.example.goalachieverplanner.designsystem.components.progress.PulseProgressBar
import com.example.goalachieverplanner.designsystem.theme.AppTheme
import com.example.goalachieverplanner.designsystem.theme.Space12
import com.example.goalachieverplanner.designsystem.theme.Space16
import com.example.goalachieverplanner.designsystem.theme.Space24

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DashboardPreview(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun DashboardPreview(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(Space16)) {
        Text(
            text = "Welcome back, Champion",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(Space24))
        
        PulseCard(modifier = Modifier.width(200.dp)) {
            Text(
                text = "TOTAL PROGRESS",
                style = MaterialTheme.typography.labelLarge
            )
            Text(
                text = "63%",
                style = MaterialTheme.typography.headlineLarge
            )
            Spacer(modifier = Modifier.height(Space12))
            PulseProgressBar(progress = 0.63f)
        }
        
        Spacer(modifier = Modifier.height(Space24))
        
        StreakCard(streakValue = "5 Days", modifier = Modifier.width(200.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardLayoutPreview() {
    AppTheme {
        DashboardPreview()
    }
}

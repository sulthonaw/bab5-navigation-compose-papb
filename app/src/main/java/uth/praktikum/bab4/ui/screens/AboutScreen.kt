package uth.praktikum.bab4.ui.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AboutScreen(onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("About Screen", style = MaterialTheme.typography.headlineMedium)
        Text("Aplikasi Praktikum 05 - Navigation Compose FILKOM UB.")
        Text("Dibuat untuk mempelajari NavHost, NavController, Back Stack, dan Arguments.")
        Button(onClick = onBack) {
            Text("Kembali")
        }
    }
}
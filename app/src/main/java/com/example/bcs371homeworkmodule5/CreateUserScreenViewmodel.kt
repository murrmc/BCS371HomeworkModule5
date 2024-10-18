package com.example.bcs371homeworkmodule5

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CreateUserScreenViewmodel() : ViewModel() {

    @Composable
    fun HeaderText(X: String) {
        Text(
            text = "$X",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.Gray,
            fontWeight = FontWeight.Bold,

        )//END OF TEXT
    }
}
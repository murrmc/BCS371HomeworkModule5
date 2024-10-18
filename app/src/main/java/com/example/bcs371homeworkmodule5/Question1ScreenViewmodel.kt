package com.example.bcs371homeworkmodule5

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.lifecycle.ViewModel

class Question1ScreenViewmodel() : ViewModel() {



    @Composable
    fun HeaderText(X: String) {
        Text(
            text = "$X",
            style = MaterialTheme.typography.displayLarge,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            )//END OF TEXT
    }


}
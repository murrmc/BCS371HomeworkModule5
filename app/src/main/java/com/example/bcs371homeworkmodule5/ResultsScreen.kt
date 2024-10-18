package com.example.bcs371homeworkmodule5

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController

@Composable
fun ResultsScreen(navController: NavHostController, name : String, amount : Int, numberCorrect : Int) {
    var ResultsScreenViewmodel =  viewModel { ResultsScreenViewmodel() }
    LazyColumn(horizontalAlignment = (Alignment.CenterHorizontally)) { item {
        Spacer(Modifier.padding(30.dp))
        ResultsScreenViewmodel.HeaderText(X = "Trivia Quiz Over!")
        Spacer(Modifier.padding(50.dp))
        Text(
            text = "${name} got ${numberCorrect}/7 Correct",
            style = MaterialTheme.typography.displayMedium
        )
        Spacer(Modifier.padding(50.dp))
        Text(
            text = "${name} earned a total of $${amount}",
            style = MaterialTheme.typography.displayMedium
        )
        Spacer(Modifier.padding(50.dp))
        Button(onClick = { navController.navigate("CreateUserScreen") }) { Icon (imageVector = Icons.Default.PlayArrow, contentDescription = "Sign up"); Text(text = "Play Again?") }
    }
    }

}
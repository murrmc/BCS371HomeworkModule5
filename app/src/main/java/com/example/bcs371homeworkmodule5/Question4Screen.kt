package com.example.bcs371homeworkmodule5

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Question4Screen(navController: NavHostController, name : String, amount : Int, numberCorrect : Int) {
    val Context = LocalContext.current
    var Question4ScreenViewmodel =  viewModel { Question4ScreenViewmodel() }
    val radioOptions = listOf("Jean Scout Louise Finch", "Boo Radley", "Atticus Finch", "Bob Ewell")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[0]) }

    LazyColumn(
        Modifier
            .selectableGroup()
        , horizontalAlignment = (Alignment.CenterHorizontally)) {
        stickyHeader{
            Question4ScreenViewmodel.HeaderText(X = "${name} Earned : $${amount}")
            Text(text = "In the Book 'To Kill A Mocking Bird', who is the Lawyer that represents Tom Robison")
            HorizontalDivider()
        }
        items(radioOptions) { name ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .selectable(
                        selected = (name == selectedOption),
                        onClick = { onOptionSelected(name) },
                        role = Role.RadioButton
                    )
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(selected = (name == selectedOption), onClick = null)
                Text(
                    text = name,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
            HorizontalDivider()
        }
        item {
            Spacer(Modifier.padding(10.dp))
            Button(onClick = {
                if (selectedOption == "Atticus Finch") {
                    Toast.makeText(Context, "You got it Right! You've earned $1,000", Toast.LENGTH_LONG).show()
                    navController.navigate("Question5Screen/${name},${amount + 1000},${numberCorrect + 1}")
                } else {
                    Toast.makeText(Context, "You got it Wrong!", Toast.LENGTH_LONG).show()
                    navController.navigate("Question5Screen/${name},${amount},${numberCorrect}")
                }
            }) { Icon (imageVector = Icons.Default.Done, contentDescription = "Sign up"); Text(text = "Confirm") }
        }
    }

}
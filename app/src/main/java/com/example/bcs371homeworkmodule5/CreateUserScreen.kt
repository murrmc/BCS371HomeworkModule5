package com.example.bcs371homeworkmodule5

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.Break
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun CreateUserScreen(navController: NavController) {

    var usernametext by rememberSaveable { mutableStateOf("") }
    val Context = LocalContext.current

    var CreateUserScreenViewmodel =  viewModel { CreateUserScreenViewmodel() }
    var amount : Int = 0
    var numberCorrect : Int = 0


    Column(Modifier.padding(vertical = 100.dp),  horizontalAlignment = Alignment.CenterHorizontally) {
        CreateUserScreenViewmodel.HeaderText(X = "Create an Account to get started!")
        Spacer(modifier = Modifier.padding(20.dp))
        TextField(value = usernametext, onValueChange = { usernametext = it }, label = { Text(text = "First Name") })
        Spacer(modifier = Modifier.padding(20.dp))
        HorizontalDivider(thickness = DividerDefaults.Thickness)
        Button(onClick = {
                if (usernametext == ""){
                    Toast.makeText(Context, "Please Don't leave fields Empty!", Toast.LENGTH_LONG).show()
                    Break
                }
                else {
                    navController.navigate("Question1Screen/${usernametext},${amount},${numberCorrect}")
                }
            }) {
            Icon (imageVector = Icons.Default.AccountCircle, contentDescription = "Sign up")
            Text(text = "Sign up") }
        }
}



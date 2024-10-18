package com.example.bcs371homeworkmodule5

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun navHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "CreateUserScreen") {
        composable(route = "CreateUserScreen") {
            CreateUserScreen(navController)
        }//End of composable
        composable(route = "Question1Screen/{data},{data2},{data3}", arguments = listOf(navArgument("data2") { type = NavType.IntType }, navArgument("data3") { type = NavType.IntType })) {
        val param = it.arguments!!.getString("data")
        val param2 = it.arguments!!.getInt("data2")
        val param3 = it.arguments!!.getInt("data3")
            if (param != null) {
                if (param2 != null) {
                    if (param3 != null) {
                        Question1Screen(navController, param, param2, param3)
                    }
                }
            }
        }
        composable(route = "Question2Screen/{data},{data2},{data3}", arguments = listOf(navArgument("data2") { type = NavType.IntType }, navArgument("data3") { type = NavType.IntType })) {
            val param = it.arguments?.getString("data")
            val param2 = it.arguments?.getInt("data2")
            val param3 = it.arguments!!.getInt("data3")
            if (param != null) {
                if (param2 != null) {
                    if (param3 != null) {
                        Question2Screen(navController, param, param2, param3)
                    }
                }
            }
        }
        composable(route = "Question3Screen/{data},{data2},{data3}", arguments = listOf(navArgument("data2") { type = NavType.IntType }, navArgument("data3") { type = NavType.IntType })) {
            val param = it.arguments?.getString("data")
            val param2 = it.arguments?.getInt("data2")
            val param3 = it.arguments!!.getInt("data3")
            if (param != null) {
                if (param2 != null) {
                    if (param3 != null) {
                        Question3Screen(navController, param, param2, param3)
                    }
                }
            }
        }
        composable(route = "Question4Screen/{data},{data2},{data3}", arguments = listOf(navArgument("data2") { type = NavType.IntType }, navArgument("data3") { type = NavType.IntType })) {
            val param = it.arguments?.getString("data")
            val param2 = it.arguments?.getInt("data2")
            val param3 = it.arguments!!.getInt("data3")
            if (param != null) {
                if (param2 != null) {
                    if (param3 != null) {
                        Question4Screen(navController, param, param2, param3)
                    }
                }
            }
        }
        composable(route = "Question5Screen/{data},{data2},{data3}", arguments = listOf(navArgument("data2") { type = NavType.IntType }, navArgument("data3") { type = NavType.IntType })) {
            val param = it.arguments?.getString("data")
            val param2 = it.arguments?.getInt("data2")
            val param3 = it.arguments!!.getInt("data3")
            if (param != null) {
                if (param2 != null) {
                    if (param3 != null) {
                        Question5Screen(navController, param, param2, param3)
                    }
                }
            }
        }
        composable(route = "Question6Screen/{data},{data2},{data3}", arguments = listOf(navArgument("data2") { type = NavType.IntType }, navArgument("data3") { type = NavType.IntType })) {
            val param = it.arguments?.getString("data")
            val param2 = it.arguments?.getInt("data2")
            val param3 = it.arguments!!.getInt("data3")
            if (param != null) {
                if (param2 != null) {
                    if (param3 != null) {
                        Question6Screen(navController, param, param2, param3)
                    }
                }
            }
        }
        composable(route = "Question7Screen/{data},{data2},{data3}", arguments = listOf(navArgument("data2") { type = NavType.IntType }, navArgument("data3") { type = NavType.IntType })) {
            val param = it.arguments?.getString("data")
            val param2 = it.arguments?.getInt("data2")
            val param3 = it.arguments!!.getInt("data3")
            if (param != null) {
                if (param2 != null) {
                    if (param3 != null) {
                        Question7Screen(navController, param, param2, param3)
                    }
                }
            }
        }
        composable(route = "ResultsScreen/{data},{data2},{data3}", arguments = listOf(navArgument("data2") { type = NavType.IntType }, navArgument("data3") { type = NavType.IntType })) {
            val param = it.arguments?.getString("data")
            val param2 = it.arguments?.getInt("data2")
            val param3 = it.arguments!!.getInt("data3")
            if (param != null) {
                if (param2 != null) {
                    if (param3 != null) {
                        ResultsScreen(navController, param, param2, param3)
                    }
                }
            }
        }
    }//End of Navhost
}
package com.tp3.pruebaappfv.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tp3.pruebaappfv.ui.theme.LoginScreen
import com.tp3.pruebaappfv.ui.theme.RegisterScreen
import com.tp3.pruebaappfv.ui.theme.WelcomeScreen

sealed class Screen(val route: String) {
    object Welcome : Screen("welcome")
    object Login : Screen("login")
    object Register : Screen("register")
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Welcome.route) {
        composable(Screen.Welcome.route) {
            WelcomeScreen(
                onLogin = { navController.navigate(Screen.Login.route) },
                onRegister = { navController.navigate(Screen.Register.route) }
            )
        }

        composable(Screen.Login.route) {
            LoginScreen(onRegisterClick = { navController.navigate(Screen.Register.route) })
        }

        composable(Screen.Register.route) {
            RegisterScreen(onLoginClick = { navController.navigate(Screen.Login.route) })
        }
    }
}
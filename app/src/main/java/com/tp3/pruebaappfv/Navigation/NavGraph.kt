package com.tp3.pruebaappfv.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tp3.pruebaappfv.ui.theme.FormScreen
import com.tp3.pruebaappfv.ui.theme.ResultScreen
import com.tp3.pruebaappfv.ui.theme.WelcomeScreen

// Define las rutas de navegación
sealed class Screen(val route: String) {
    object Welcome : Screen("welcome")
    object Form : Screen("form")
    object Result : Screen("result/{name}/{surname}/{age}/{email}") {
        fun createRoute(name: String, surname: String, age: String, email: String) =
            "result/$name/$surname/$age/$email"
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Welcome.route) {
        // PANTALLA 1: BIENVENIDA
        composable(Screen.Welcome.route) {
            WelcomeScreen(onNext = { navController.navigate(Screen.Form.route) })
        }

        // PANTALLA 2: FORMULARIO
        composable(Screen.Form.route) {
            FormScreen(onFinish = { n, s, a, e ->
                navController.navigate(Screen.Result.createRoute(n, s, a, e))
            })
        }

        // PANTALLA 3: RESULTADO
        composable(Screen.Result.route) { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name") ?: ""
            val surname = backStackEntry.arguments?.getString("surname") ?: ""
            val age = backStackEntry.arguments?.getString("age") ?: ""
            val email = backStackEntry.arguments?.getString("email") ?: ""

            ResultScreen(name, surname, age, email, onBack = {
                navController.popBackStack(Screen.Welcome.route, inclusive = false)
            })
        }
    }
}
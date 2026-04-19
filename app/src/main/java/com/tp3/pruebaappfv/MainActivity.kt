package com.tp3.pruebaappfv


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.tp3.pruebaappfv.navigation.AppNavigation
import com.tp3.pruebaappfv.ui.theme.PruebaAppFVTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PruebaAppFVTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    AppNavigation()
                }


            }
        }
    }
}

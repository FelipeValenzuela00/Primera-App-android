package com.tp3.pruebaappfv.ui.theme


import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tp3.pruebaappfv.R
import com.tp3.pruebaappfv.components.ButtonAction

@Composable
fun ResultScreen(name: String, surname: String, age: String, email: String, onBack: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize().padding(24.dp), verticalArrangement = Arrangement.Center) {
        Text(text = "Resumen de datos", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Nombre completo: $name $surname")
        Text(text = "Edad: $age años")
        Text(text = "Correo: $email")
        Spacer(modifier = Modifier.height(32.dp))
        ButtonAction(text = "Volver", onClick = onBack)
    }
}
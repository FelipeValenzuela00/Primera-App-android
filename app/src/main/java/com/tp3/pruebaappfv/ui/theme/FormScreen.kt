package com.tp3.pruebaappfv.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.tp3.pruebaappfv.R
import com.tp3.pruebaappfv.components.ButtonAction

@Composable
fun FormScreen(onFinish: (String, String, String, String) -> Unit) {
    var name by remember { mutableStateOf("") }
    var surname by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFF0F172A))) { // Fondo manual
        Column(modifier = Modifier.padding(24.dp)) {
            Text(
                text = "Ingresá tus datos",
                color = Color.White, // ⚪ Texto blanco
                style = MaterialTheme.typography.headlineSmall,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
            )
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text("Nombre") },
                modifier = Modifier.fillMaxWidth()
            )
            OutlinedTextField(
                value = surname,
                onValueChange = { surname = it },
                label = { Text("Apellido") },
                modifier = Modifier.fillMaxWidth()
            )
            OutlinedTextField(
                value = age,
                onValueChange = { age = it },
                label = { Text("Edad") },
                modifier = Modifier.fillMaxWidth()
            )
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(32.dp))
            ButtonAction(
                text = "Finalizar",
                onClick = { onFinish(name, surname, age, email) },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
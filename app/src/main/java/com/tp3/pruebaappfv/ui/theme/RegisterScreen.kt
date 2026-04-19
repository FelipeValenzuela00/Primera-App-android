package com.tp3.pruebaappfv.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.tp3.pruebaappfv.R
import com.tp3.pruebaappfv.components.ButtonAction

@Composable
fun RegisterScreen(
    onLoginClick: () -> Unit,
    onSignUpClick: () -> Unit = {}
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6F7FB))
            .padding(horizontal = 24.dp, vertical = 22.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(28.dp))
        Text(
            text = "Create Account",
            color = Color(0xFF1E3AB8),
            fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Create an account so you can explore all\nthe existing jobs",
            color = Color(0xFF111827),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(28.dp))
        RegisterTextField(value = email, onValueChange = { email = it }, placeholder = "Email")
        Spacer(modifier = Modifier.height(12.dp))
        RegisterTextField(value = password, onValueChange = { password = it }, placeholder = "Password")
        Spacer(modifier = Modifier.height(12.dp))
        RegisterTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            placeholder = "Confirm Password"
        )

        Spacer(modifier = Modifier.height(20.dp))
        ButtonAction(
            text = "Sign up",
            onClick = onSignUpClick,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))
        TextButton(onClick = onLoginClick) {
            Text(text = "Already have an account", color = Color(0xFF111827))
        }

        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Or continue with", color = Color(0xFF2E4ACF))
        Spacer(modifier = Modifier.height(10.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            RegisterSocialProviderBadge(label = "G")
            RegisterSocialProviderBadge(label = "f")
            RegisterSocialProviderBadge(label = "A")
        }
    }
}

@Composable
private fun RegisterTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        placeholder = { Text(text = placeholder, color = Color(0xFF6B7280)) },
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color(0xFF2E4ACF),
            unfocusedBorderColor = Color(0xFFD9DDEA),
            focusedContainerColor = Color(0xFFF0F2F8),
            unfocusedContainerColor = Color(0xFFF0F2F8)
        ),
        singleLine = true
    )
}

@Composable
private fun RegisterSocialProviderBadge(label: String) {
    Text(
        text = label,
        modifier = Modifier
            .background(color = Color(0xFFE5E7EB), shape = RoundedCornerShape(8.dp))
            .padding(horizontal = 12.dp, vertical = 6.dp),
        color = Color(0xFF111827)
    )
}


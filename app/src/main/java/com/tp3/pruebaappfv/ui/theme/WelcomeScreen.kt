package com.tp3.pruebaappfv.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.TextButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tp3.pruebaappfv.R
import com.tp3.pruebaappfv.components.ButtonAction

@Composable
fun WelcomeScreen(
    onLogin: () -> Unit,
    onRegister: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 28.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.welcome_image),
            contentDescription = null,
            modifier = Modifier.size(220.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Discover Your\nDream Job here",
            style = MaterialTheme.typography.headlineMedium,
            color = Color(0xFF1E3AB8),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
            fontWeight = FontWeight.SemiBold,
            lineHeight = 38.sp
        )
        Spacer(modifier = Modifier.height(14.dp))
        Text(
            text = "Explore all the existing job roles based on your interest and study major",
            textAlign = TextAlign.Center,
            color = Color(0xFF6B7280),
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(modifier = Modifier.height(32.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ButtonAction(
                text = "Login",
                onClick = onLogin,
                modifier = Modifier.weight(1f)
            )
            TextButton(
                onClick = onRegister,
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Register",
                    color = Color(0xFF111827),
                    fontFamily = FontFamily(Font(R.font.poppins_semi_bold))
                )
            }
        }
    }
}
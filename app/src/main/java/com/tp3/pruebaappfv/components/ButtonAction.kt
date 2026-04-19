package com.tp3.pruebaappfv.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tp3.pruebaappfv.R

@Composable
fun ButtonAction(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF2E4ACF)
        )
    ) {
        Text(
            text = text,
            fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            color = Color.White
        )
    }
}
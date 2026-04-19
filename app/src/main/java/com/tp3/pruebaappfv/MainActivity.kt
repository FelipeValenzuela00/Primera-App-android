package com.tp3.pruebaappfv


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.tp3.pruebaappfv.Navigation.AppNavigation
import com.tp3.pruebaappfv.components.ButtonAction
import com.tp3.pruebaappfv.ui.theme.PruebaAppFVTheme
import com.tp3.pruebaappfv.ui.theme.poppinFonts


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

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {


        Image(
            painter = painterResource(id = R.drawable.welcome_image),
            contentDescription = "Welcome Image",
        )
        Text(
            text = "Discover Your Dream Job here",
            fontFamily = poppinFonts,
            fontSize = 35.sp,
            fontWeight = FontWeight.SemiBold,

            modifier = modifier
        )
        Text(
            text = "Explore all the existing job roles based on your interest and study major",)
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PruebaAppFVTheme {
        Greeting("Android")
    }
}

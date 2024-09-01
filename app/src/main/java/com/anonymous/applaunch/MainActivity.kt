package com.anonymous.applaunch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.anonymous.applaunch.ui.Login
import com.anonymous.applaunch.ui.Userlist
import com.anonymous.applaunch.ui.WelcomeScreen
import com.anonymous.applaunch.ui.theme.ApplaunchTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity() : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApplaunchTheme {
           //     onBoard()
                val navController = rememberNavController()

                NavHost(navController, startDestination = "welcome") {
                    composable("welcome") { WelcomeScreen(navController) }
                    composable("login") { Login(navController) }
                    composable("userlist") { Userlist(navController) }
                }
            }
        }
    }
}


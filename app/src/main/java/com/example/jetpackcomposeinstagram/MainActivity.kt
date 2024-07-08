package com.example.jetpackcomposeinstagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.jetpackcomposeinstagram.login.ui.LoginScreen
import com.example.jetpackcomposeinstagram.login.ui.LoginViewModel
import com.example.jetpackcomposeinstagram.ui.theme.JetpackComposeInstagramTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInstagramTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    LoginScreen(loginViewModel)
                }
            }
        }
    }
}


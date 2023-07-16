package com.example.main.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController


@Composable
fun SplashScreen(
    rootNavController: NavHostController
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Button(onClick = { rootNavController.navigate("main") }) {

        }
        Button(onClick = { rootNavController.navigate("authorization") }) {

        }
    }
}
package com.example.main.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.main.MainScreen
import com.example.main.presentation.SplashScreen

@Composable
fun AppNavGraph(
) {
    val authApi = getFeatureProvider().getAuthApi()
    val rootNavController = rememberNavController()

    NavHost(
        navController = rootNavController,
        startDestination = "splash"
    ) {
        register(
            featureApi = authApi,
            navController = rootNavController,
        )
        composable(
            route = "main"
        ) {
            MainScreen()
        }
        composable(
            route = "splash",
        ) {
            SplashScreen(rootNavController)
        }
    }
}


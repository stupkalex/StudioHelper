package com.example.feature_auth_impl.data

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.core_api.FeatureApi
import com.example.feature_auth_api.FeatureAuthApi
import com.example.feature_auth_impl.presentation.AuthScreen
import javax.inject.Inject

class FeatureAuthImpl @Inject constructor() : FeatureAuthApi {

    override val baseRoute = "authorization"

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(baseRoute) {
            AuthScreen(
                modifier = modifier,
                onNavigateToABFlow = {
                    navController.navigate(baseRoute)
                }
            )
        }
    }

}
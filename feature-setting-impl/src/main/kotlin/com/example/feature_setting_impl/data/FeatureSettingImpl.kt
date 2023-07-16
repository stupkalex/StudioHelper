package com.example.feature_setting_impl.data

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.feature_setting_api.FeatureSettingApi
import com.example.feature_setting_impl.presentation.SettingScreen
import javax.inject.Inject

class FeatureSettingImpl  @Inject constructor() : FeatureSettingApi {

    override val baseRoute = "setting"

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(baseRoute) {
            SettingScreen(
                modifier = modifier,
                onNavigateToABFlow = {
                    navController.navigate(baseRoute)
                }
            )
        }
    }

}
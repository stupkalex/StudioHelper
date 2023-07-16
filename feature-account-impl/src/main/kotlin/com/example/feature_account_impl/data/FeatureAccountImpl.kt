package com.example.feature_account_impl.data

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.feature_account_api.FeatureAccountApi
import com.example.feature_account_impl.presentation.AccountScreen
import javax.inject.Inject

class FeatureAccountImpl @Inject constructor() : FeatureAccountApi {


    override val baseRoute = "account"

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(baseRoute) {
            AccountScreen(
                modifier = modifier,
                onNavigateToABFlow = {
                    navController.navigate(baseRoute)
                }
            )
        }
    }

}
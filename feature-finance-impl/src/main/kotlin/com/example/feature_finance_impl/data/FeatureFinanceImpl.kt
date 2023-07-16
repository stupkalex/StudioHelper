package com.example.feature_finance_impl.data

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.feature_finance_api.FeatureFinanceApi
import com.example.feature_finance_impl.presentation.FinanceScreen
import javax.inject.Inject

class FeatureFinanceImpl @Inject constructor() : FeatureFinanceApi {

    override val baseRoute = "finance"

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(baseRoute) {
            FinanceScreen(
                modifier = modifier,
                onNavigateToABFlow = {
                    navController.navigate(baseRoute)
                }
            )
        }
    }

}
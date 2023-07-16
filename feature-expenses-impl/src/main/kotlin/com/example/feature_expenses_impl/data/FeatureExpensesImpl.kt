package com.example.feature_expenses_impl.data

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.feature_expenses_api.FeatureExpensesApi
import com.example.feature_expenses_impl.presentation.ExpensesScreen
import javax.inject.Inject

class FeatureExpensesImpl @Inject constructor() : FeatureExpensesApi {

    override val baseRoute = "expenses"

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(baseRoute) {
            ExpensesScreen(
                modifier = modifier,
                onNavigateToABFlow = {
                    navController.navigate(baseRoute)
                }
            )
        }
    }
}

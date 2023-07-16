package com.example.main.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.core_api.FeatureApi
import com.example.core_impl.ApplicationComponent
import com.example.core_impl.FeaturesApiProvider

@Composable
fun MainNavGraph(
    navHostController: NavHostController,
    settingApi: FeatureApi,
    financeApi: FeatureApi,
    expensesApi: FeatureApi,
    accountApi: FeatureApi,
    appointmentApi: FeatureApi
) {
    NavHost(
        navController = navHostController,
        startDestination = financeApi.baseRoute
    )  {
        register(
            featureApi = settingApi,
            navController = navHostController,
            modifier = Modifier
        )
        register(
            featureApi = financeApi,
            navController = navHostController,
            modifier = Modifier
        )
        register(
            featureApi = expensesApi,
            navController = navHostController,
            modifier = Modifier
        )
        register(
            featureApi = accountApi,
            navController = navHostController,
            modifier = Modifier
        )
        register(
            featureApi = appointmentApi,
            navController = navHostController,
            modifier = Modifier
        )
    }


}

fun NavGraphBuilder.register(
    featureApi: FeatureApi,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    featureApi.registerGraph(
        navGraphBuilder = this,
        navController = navController,
        modifier = modifier
    )
}

fun NavGraphBuilder.register(
    route: String,
    navController: NavController,
    modifier: Modifier = Modifier,
    screen: @Composable () -> Unit
) {
    composable(route) {
        screen.invoke()
    }
}


@Composable
fun getFeatureProvider() : FeaturesApiProvider {
    return (LocalContext.current.applicationContext as ApplicationComponent).getFeaturesProvider()
}
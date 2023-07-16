package com.example.main.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.core_api.FeatureApi
import com.example.core_impl.ApplicationComponent
import com.example.core_impl.FeaturesApiProvider
import com.example.feature_account_api.FeatureAccountApi
import com.example.feature_appointment_api.FeatureAppointmentApi
import com.example.feature_auth_api.FeatureAuthApi
import com.example.feature_expenses_api.FeatureExpensesApi
import com.example.feature_finance_api.FeatureFinanceApi
import com.example.feature_setting_api.FeatureSettingApi

@Composable
fun AppNavGraph(
    navHostController: NavHostController,
    settingApi: FeatureApi,
    financeApi: FeatureApi,
    expensesApi: FeatureApi,
    accountApi: FeatureApi,
    authApi: FeatureApi,
    appointmentApi: FeatureApi
) {

    NavHost(
        navController = navHostController,
        startDestination = financeApi.baseRoute
    ) {
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


@Composable
fun getFeatureProvider() : FeaturesApiProvider {
    return (LocalContext.current.applicationContext as ApplicationComponent).getFeaturesProvider()
}
package com.example.main.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.feature_appointment_api.FeatureAppointmentApi
import com.example.feature_setting_api.FeatureSettingApi

@Composable
fun AppNavGraph(
    navHostController: NavHostController,
    settingApi: FeatureSettingApi,
    financeApi: FeatureSettingApi,
    authApi: FeatureSettingApi,
    expensesApi: FeatureSettingApi,
    accountApi: FeatureSettingApi,
    appointmentApi: FeatureAppointmentApi
) {

    NavHost(
        navController = navHostController,
        startDestination = "home") {
        settingApi.registerGraph(
            navGraphBuilder = this,
            navController = navHostController,
            modifier = Modifier
        )
        financeApi.registerGraph(
            navGraphBuilder = this,
            navController = navHostController,
            modifier = Modifier
        )
        authApi.registerGraph(
            navGraphBuilder = this,
            navController = navHostController,
            modifier = Modifier
        )
        expensesApi.registerGraph(
            navGraphBuilder = this,
            navController = navHostController,
            modifier = Modifier
        )
        accountApi.registerGraph(
            navGraphBuilder = this,
            navController = navHostController,
            modifier = Modifier
        )
        appointmentApi.registerGraph(
            navGraphBuilder = this,
            navController = navHostController,
            modifier = Modifier
        )
    }
}
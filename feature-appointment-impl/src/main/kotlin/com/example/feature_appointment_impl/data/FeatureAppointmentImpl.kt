package com.example.feature_appointment_impl.data

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.feature_appointment_api.FeatureAppointmentApi
import com.example.feature_appointment_impl.presentation.AppointmentScreen
import javax.inject.Inject

class FeatureAppointmentImpl @Inject constructor() : FeatureAppointmentApi {

    override val baseRoute = "appointment"

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(baseRoute) {
            AppointmentScreen(
                modifier = modifier,
                onNavigateToABFlow = {
                    navController.navigate(baseRoute)
                }
            )
        }
    }

}
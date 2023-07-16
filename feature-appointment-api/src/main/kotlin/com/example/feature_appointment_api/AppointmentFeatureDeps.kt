package com.example.feature_appointment_api

import com.example.feature_appointment_api.FeatureAppointmentApi

interface AppointmentFeatureDeps {
    fun getAppointmentApi(): FeatureAppointmentApi
}
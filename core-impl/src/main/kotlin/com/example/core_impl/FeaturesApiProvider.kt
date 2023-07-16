package com.example.core_impl

import com.example.core_api.FeatureApi

interface FeaturesApiProvider {

    fun getFinanceApi(): FeatureApi

    fun getAppointmentApi(): FeatureApi

    fun getExpensesApi(): FeatureApi

    fun getAccountApi(): FeatureApi

    fun getSettingApi(): FeatureApi

    fun getAuthApi(): FeatureApi

}
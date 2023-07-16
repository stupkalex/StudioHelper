package com.example.feature_finance_api

import com.example.feature_finance_api.FeatureFinanceApi

interface FinanceFeatureDeps {
    fun getFinanceApi(): FeatureFinanceApi
}
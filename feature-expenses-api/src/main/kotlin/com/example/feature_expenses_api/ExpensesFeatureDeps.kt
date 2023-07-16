package com.example.feature_expenses_api

import com.example.feature_expenses_api.FeatureExpensesApi

interface ExpensesFeatureDeps {
    fun getExpensesApi(): FeatureExpensesApi
}
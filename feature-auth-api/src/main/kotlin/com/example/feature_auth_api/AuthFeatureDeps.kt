package com.example.feature_auth_api

import com.example.feature_auth_api.FeatureAuthApi

interface AuthFeatureDeps {
    fun getAuthApi(): FeatureAuthApi
}
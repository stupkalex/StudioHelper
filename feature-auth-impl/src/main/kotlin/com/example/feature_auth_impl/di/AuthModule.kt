package com.example.feature_auth_impl.di

import com.example.feature_auth_api.FeatureAuthApi
import com.example.feature_auth_impl.data.FeatureAuthImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface AuthModule {
    @Singleton
    @Binds
    fun bindsAuthApi(impl: FeatureAuthImpl): FeatureAuthApi

}
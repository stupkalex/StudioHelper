package com.example.feature_account_impl.di

import com.example.feature_account_api.FeatureAccountApi
import com.example.feature_account_impl.data.FeatureAccountImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface AccountModule {

    @Singleton
    @Binds
    fun bindsAccountApi(impl: FeatureAccountImpl): FeatureAccountApi

}
package com.example.feature_finance_impl.di

import com.example.feature_finance_api.FeatureFinanceApi
import com.example.feature_finance_impl.data.FeatureFinanceImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton


@Module
interface FinanceModule {

    @Singleton
    @Binds
    fun bindsFinanceApi(impl: FeatureFinanceImpl): FeatureFinanceApi

}
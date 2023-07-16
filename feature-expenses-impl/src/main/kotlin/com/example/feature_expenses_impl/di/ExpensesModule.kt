package com.example.feature_expenses_impl.di

import com.example.feature_expenses_api.FeatureExpensesApi
import com.example.feature_expenses_impl.data.FeatureExpensesImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface ExpensesModule {

    @Singleton
    @Binds
    fun bindsExpensesApi(impl: FeatureExpensesImpl): FeatureExpensesApi

}
package com.example.feature_expenses_impl.di

import com.example.feature_expenses_api.ExpensesFeatureDeps
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ExpensesModule::class])
interface ExpensesComponent: ExpensesFeatureDeps {

    @Component.Factory
    interface Factory {
        fun create() : ExpensesComponent
    }

}
package com.example.feature_finance_impl.di

import com.example.feature_finance_api.FinanceFeatureDeps
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [FinanceModule::class])
interface FinanceComponent : FinanceFeatureDeps {

    @Component.Factory
    interface Factory {
        fun create(): FinanceComponent
    }

}

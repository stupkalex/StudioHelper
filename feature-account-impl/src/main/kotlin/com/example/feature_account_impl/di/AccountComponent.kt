package com.example.feature_account_impl.di

import com.example.feature_account_api.AccountFeatureDeps
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AccountModule::class])
interface AccountComponent: AccountFeatureDeps {

    @Component.Factory
    interface Factory {
        fun create() : AccountComponent
    }

}
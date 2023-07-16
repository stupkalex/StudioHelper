package com.example.feature_auth_impl.di

import com.example.feature_auth_api.AuthFeatureDeps
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AuthModule::class])
interface AuthComponent: AuthFeatureDeps {

    @Component.Factory
    interface Factory {
        fun create() : AuthComponent
    }

}
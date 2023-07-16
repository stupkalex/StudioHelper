package com.example.feature_setting_impl.di

import com.example.feature_setting_api.SettingFeatureDeps
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [SettingModule::class])
interface SettingComponent: SettingFeatureDeps {

    @Component.Factory
    interface Factory {
        fun create(): SettingComponent
    }

}
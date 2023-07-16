package com.example.feature_setting_impl.di

import com.example.feature_setting_api.FeatureSettingApi
import com.example.feature_setting_impl.data.FeatureSettingImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface SettingModule {

    @Singleton
    @Binds
    fun bindsSettingApi(impl: FeatureSettingImpl): FeatureSettingApi

}
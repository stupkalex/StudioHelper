package com.example.feature_appointment_impl.di

import com.example.feature_appointment_api.FeatureAppointmentApi
import com.example.feature_appointment_impl.data.FeatureAppointmentImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface AppointmentModule {

    @Singleton
    @Binds
    fun bindsAppointmentApi(impl: FeatureAppointmentImpl): FeatureAppointmentApi

}
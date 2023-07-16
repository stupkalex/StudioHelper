package com.example.feature_appointment_impl.di

import com.example.feature_appointment_api.AppointmentFeatureDeps
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component( modules = [AppointmentModule::class])
interface AppointmentComponent: AppointmentFeatureDeps {

    @Component.Factory
    interface Factory {
        fun create() : AppointmentComponent
    }

}
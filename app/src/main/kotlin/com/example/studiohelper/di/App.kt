package com.example.studiohelper.di

import android.app.Application
import androidx.compose.runtime.Composable
import com.example.core_impl.ApplicationComponent
import com.example.core_impl.FeaturesApiProvider
import com.example.feature_account_impl.di.DaggerAccountComponent
import com.example.feature_appointment_impl.di.DaggerAppointmentComponent
import com.example.feature_auth_impl.di.DaggerAuthComponent
import com.example.feature_expenses_impl.di.DaggerExpensesComponent
import com.example.feature_finance_impl.di.DaggerFinanceComponent
import com.example.feature_setting_impl.di.DaggerSettingComponent

class App() : Application(), ApplicationComponent {

    private val financeComponent by lazy {
        DaggerFinanceComponent.factory().create()
    }

    private val appointmentComponent by lazy {
        DaggerAppointmentComponent.factory().create()
    }

    private val expensesComponent by lazy {
        DaggerExpensesComponent.factory().create()
    }

    private val accountComponent by lazy {
        DaggerAccountComponent.factory().create()
    }

    private val settingComponent by lazy {
        DaggerSettingComponent.factory().create()
    }

    private val authComponent by lazy {
        DaggerAuthComponent.factory().create()
    }

    private val appComponent: FeaturesApiProvider by lazy {
      DaggerAppComponent
          .builder()
          .financeDeps(financeComponent)
          .appointmentDeps(appointmentComponent)
          .expensesDeps(expensesComponent)
          .accountDeps(accountComponent)
          .settingDeps(settingComponent)
          .authDeps(authComponent)
          .application(this)
          .build()
    }

    @Composable
    override fun getFeaturesProvider(): FeaturesApiProvider {
        return appComponent
    }

}





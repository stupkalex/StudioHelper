package com.example.studiohelper.di

import android.app.Application
import com.example.core_impl.FeaturesApiProvider
import com.example.feature_account_api.FeatureAccountApi
import com.example.feature_account_impl.data.FeatureAccountImpl
import com.example.feature_account_api.AccountFeatureDeps
import com.example.feature_appointment_api.FeatureAppointmentApi
import com.example.feature_appointment_api.AppointmentFeatureDeps
import com.example.feature_auth_api.FeatureAuthApi
import com.example.feature_auth_api.AuthFeatureDeps
import com.example.feature_expenses_api.FeatureExpensesApi
import com.example.feature_expenses_api.ExpensesFeatureDeps
import com.example.feature_finance_api.FeatureFinanceApi
import com.example.feature_finance_api.FinanceFeatureDeps
import com.example.feature_setting_api.FeatureSettingApi
import com.example.feature_setting_api.SettingFeatureDeps
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [
        FinanceFeatureDeps::class,
        SettingFeatureDeps::class,
        AppointmentFeatureDeps::class,
        ExpensesFeatureDeps::class,
        AccountFeatureDeps::class,
        AuthFeatureDeps::class
    ]
)
interface AppComponent: FeaturesApiProvider {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: Application): Builder

        fun financeDeps(financeDeps: FinanceFeatureDeps): Builder

        fun settingDeps(settingDeps: SettingFeatureDeps): Builder

        fun appointmentDeps(appointmentDeps: AppointmentFeatureDeps): Builder

        fun expensesDeps(expensesDeps: ExpensesFeatureDeps): Builder

        fun accountDeps(accountDeps: AccountFeatureDeps): Builder

        fun authDeps(authDeps: AuthFeatureDeps): Builder

        fun build(): AppComponent
    }

    override fun getAccountApi(): FeatureAccountApi

    override fun getAppointmentApi(): FeatureAppointmentApi

    override fun getAuthApi(): FeatureAuthApi

    override fun getExpensesApi(): FeatureExpensesApi

    override fun getFinanceApi(): FeatureFinanceApi

    override fun getSettingApi(): FeatureSettingApi

}

package com.example.core_impl

import androidx.compose.runtime.Composable

interface ApplicationComponent {

    @Composable
    fun getFeaturesProvider(): FeaturesApiProvider
}
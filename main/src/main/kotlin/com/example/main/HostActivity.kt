package com.example.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.main.navigation.AppNavGraph
import com.example.main.navigation.getFeatureProvider
import com.example.main.navigation.rememberNavigationState
import com.example.ui_kit.theme.StudioHelperTheme

class FeaturesActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudioHelperTheme {
               AppNavGraph()
            }
        }
    }

}

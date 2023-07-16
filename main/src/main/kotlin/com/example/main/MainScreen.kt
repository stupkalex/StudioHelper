package com.example.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.core_impl.FeaturesApiProvider
import com.example.feature_account_api.FeatureAccountApi
import com.example.feature_appointment_api.FeatureAppointmentApi
import com.example.feature_expenses_api.FeatureExpensesApi
import com.example.feature_finance_api.FeatureFinanceApi
import com.example.feature_setting_api.FeatureSettingApi
import com.example.main.navigation.AppNavGraph
import com.example.main.navigation.getFeatureProvider
import com.example.main.navigation.rememberNavigationState
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

    val featureProvider = getFeatureProvider()

    val drawerItems = initDrawerItems(featureProvider)

    val drawerState = remember {
        DrawerState(
            initialValue = DrawerValue.Closed
        )
    }

    val headerTitle = rememberSaveable {
        mutableStateOf(R.string.main_screen)
    }

    val scope = rememberCoroutineScope()

    val navState = rememberNavigationState()

    NavigationDrawer(
        drawerState = drawerState,
        drawerItems = drawerItems,
        itemClickListener = {
            scope.launch {
                navState.navigationTo(it.route)
                headerTitle.value = it.titleResId
                drawerState.close()
            }
        }
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    modifier = Modifier.clickable {
                        scope.launch {
                            drawerState.open()
                        }
                    },
                    title = {
                        Text(
                            text = stringResource(headerTitle.value),
                            color = MaterialTheme.colorScheme.primary,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    },
                    navigationIcon = {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                )
            },

            ) {
            AppNavGraph(
                navHostController = navState.navHostController,
                appointmentApi = featureProvider.getAppointmentApi(),
                expensesApi = featureProvider.getExpensesApi(),
                settingApi = featureProvider.getSettingApi(),
                financeApi = featureProvider.getFinanceApi(),
                accountApi = featureProvider.getAccountApi(),
                authApi = featureProvider.getAuthApi()
            )
        }
    }
}





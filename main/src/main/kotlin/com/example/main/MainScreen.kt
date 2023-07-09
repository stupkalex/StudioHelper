package com.example.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val drawerState = remember {
        DrawerState(
            initialValue = DrawerValue.Closed
        )
    }
    val scope = rememberCoroutineScope()

    NavigationDrawer(
        drawerState = drawerState
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
                            text = "Главный экран",
                            color = MaterialTheme.colorScheme.primary
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

        }
    }
}



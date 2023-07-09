package com.example.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@Composable
fun NavigationDrawer(
    drawerState: DrawerState,
    content: @Composable () -> Unit
) {
    val items = listOf<NavigationItem>(
        NavigationItem.Sessions,
        NavigationItem.Expenses,
        NavigationItem.Finance,
        NavigationItem.Masters,
        NavigationItem.Setting,
        NavigationItem.Accounts,
        NavigationItem.Notifications,
        NavigationItem.Exit,
    )
    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet(
                Modifier.wrapContentWidth()
            ) {
                NavigationDriverHeader()
                items.forEach { item ->
                    NavigationItem(navigationItem = item)
                }
            }
        },
        drawerState = drawerState
    ) {
        content.invoke()
    }
}

@Composable
fun NavigationDriverHeader() {
    Column(
        modifier = Modifier
            .padding(12.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.avatar_default_image),
                contentDescription = null,
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(48.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = "Изменить",
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 14.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Имя Пользователя",
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(12.dp))
        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.width(172.dp)
        )
    }
}
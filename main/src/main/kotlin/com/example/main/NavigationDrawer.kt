package com.example.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
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
import com.example.core_impl.FeaturesApiProvider
import kotlinx.coroutines.launch

@Composable
fun NavigationDrawer(
    drawerState: DrawerState,
    drawerItems: List<NavigationItem>,
    itemClickListener: (NavigationItem) -> Unit,
    content: @Composable () -> Unit
) {
    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet(
                Modifier.wrapContentWidth()
            ) {
                NavigationDriverHeader()
                drawerItems.forEach { item ->
                    NavigationItem(
                        navigationItem = item,
                        itemClickListener = itemClickListener
                    )
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

fun initDrawerItems(featureProvider: FeaturesApiProvider): List<NavigationItem> {
    with(featureProvider) {
        return listOf(
            NavigationItem(
                titleResId = R.string.expenses,
                icon = Icons.Default.Favorite,
                route = getExpensesApi().baseRoute
            ),
            NavigationItem(
                titleResId = R.string.appointments,
                icon = Icons.Default.Favorite,
                route = getAppointmentApi().baseRoute
            ),
            NavigationItem(
                titleResId = R.string.finance,
                icon = Icons.Default.Favorite,
                route = getFinanceApi().baseRoute
            ),
            NavigationItem(
                titleResId = R.string.account,
                icon = Icons.Default.Favorite,
                route = getAccountApi().baseRoute
            ),
            NavigationItem(
                titleResId = R.string.setting,
                icon = Icons.Default.Favorite,
                route = getSettingApi().baseRoute
            ),
            NavigationItem(
                titleResId = R.string.do_exit,
                icon = Icons.Default.Favorite,
                route = getAccountApi().baseRoute
            ),
        )
    }
}
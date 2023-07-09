package com.example.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationItem (
    val titleResId: Int,
    val icon: ImageVector,
    val screen: String
) {

    object Sessions : NavigationItem(
        titleResId = R.string.sessions,
        icon = Icons.Default.Favorite,
        screen = "Sessions"
    )

    object Expenses : NavigationItem(
        titleResId = R.string.expenses,
        icon = Icons.Default.Favorite,
        screen = "Expenses"
    )

    object Finance : NavigationItem(
        titleResId = R.string.finance,
        icon = Icons.Default.Favorite,
        screen = "Finance"
    )

    object Masters : NavigationItem(
        titleResId = R.string.masters,
        icon = Icons.Default.Favorite,
        screen = "Masters"
    )

    object Notifications : NavigationItem(
        titleResId = R.string.notifications,
        icon = Icons.Default.Favorite,
        screen = "Notifications"
    )

    object Exit : NavigationItem(
        titleResId = R.string.do_exit,
        icon = Icons.Default.Favorite,
        screen = "Exit"
    )

    object Setting : NavigationItem(
        titleResId = R.string.setting,
        icon = Icons.Default.Favorite,
        screen = "Setting"
    )

    object Accounts : NavigationItem(
        titleResId = R.string.accounts,
        icon = Icons.Default.Favorite,
        screen = "Accounts"
    )
}


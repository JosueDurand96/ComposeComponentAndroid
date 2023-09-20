package com.durand.composecomponentandroid

import androidx.navigation.NavHostController
import com.durand.composecomponentandroid.AllDestinations.HOME
import com.durand.composecomponentandroid.AllDestinations.SETTINGS

object AllDestinations {
    const val HOME = "Home"
    const val SETTINGS = "Settings"
}

class AppNavigationActions(private val navController: NavHostController) {

    fun navigateToHome() {
        navController.navigate(HOME) {
            popUpTo(HOME)
        }
    }

    fun navigateToSettings() {
        navController.navigate(SETTINGS) {
            launchSingleTop = true
            restoreState = true
        }
    }
}

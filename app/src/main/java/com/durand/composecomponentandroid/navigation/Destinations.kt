package com.durand.composecomponentandroid.navigation

import androidx.navigation.NavHostController
import com.durand.composecomponentandroid.navigation.Destinations.DETAIL
import com.durand.composecomponentandroid.navigation.Destinations.HOME
import com.durand.composecomponentandroid.navigation.Destinations.SETTINGS

object Destinations {
    const val HOME = "Home"
    const val SETTINGS = "Settings"
    const val DETAIL = "Detail"
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

    fun navigateToDetail(){
        navController.navigate(DETAIL){
            launchSingleTop = true
            restoreState = true
        }
    }
}

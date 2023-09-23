package com.durand.composecomponentandroid.navigation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.durand.composecomponentandroid.screens.DetailScreen
import com.durand.composecomponentandroid.screens.HomeScreen
import com.durand.composecomponentandroid.screens.SettingsScreen
import com.durand.composecomponentandroid.ui.theme.GreenToolbar
import com.durand.composecomponentandroid.ui.theme.Purple40
import com.durand.composecomponentandroid.ui.theme.PurpleGrey80
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    drawerState: DrawerState = rememberDrawerState(initialValue = DrawerValue.Closed),
) {
    val currentNavBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentNavBackStackEntry?.destination?.route ?: Destinations.HOME
    val navigationActions = remember(navController) {
        AppNavigationActions(navController)
    }
    ModalNavigationDrawer(drawerContent = {
        AppDrawer(
            route = currentRoute,
            navigateToHome = { navigationActions.navigateToHome() },
            navigateToSettings = { navigationActions.navigateToSettings() },
            navigateToDetail = { navigationActions.navigateToDetail() },
            closeDrawer = { coroutineScope.launch { drawerState.close() } },
            modifier = Modifier
        )
    }, drawerState = drawerState) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = currentRoute) },
                    modifier = Modifier.fillMaxWidth(),
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch { drawerState.open() }
                        }, content = {
                            Icon(
                                imageVector = Icons.Default.Menu, contentDescription = null
                            )
                        })
                    },
                    colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = GreenToolbar)
                )
            }, modifier = Modifier
        ) {
            NavHost(
                navController = navController,
                startDestination = Destinations.HOME,
                modifier = modifier.padding(it)
            ) {
                composable(Destinations.HOME) {
                    HomeScreen()
                }
                composable(Destinations.SETTINGS) {
                    SettingsScreen()
                }
                composable(Destinations.DETAIL) {
                    DetailScreen()
                }
            }
        }
    }
}
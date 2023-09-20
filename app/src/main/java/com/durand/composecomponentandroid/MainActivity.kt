package com.durand.composecomponentandroid

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.durand.composecomponentandroid.ui.theme.ComposeComponentAndroidTheme
import com.durand.composecomponentandroid.ui.theme.SampleDrawerTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeComponentAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
                    val scope = rememberCoroutineScope()
                    val navController = rememberNavController()
                    SampleDrawerTheme {
                        SampleAppNavGraph()
                    }
//                    NavHost(navController = navController, startDestination = "home") {
//                        composable(route = "home") {
//                            HomeScreen()
//                        }
//                        composable(route = "detail") {
//                            DetailScreen()
//                        }
//                    }
//                    NavHost(navController = navController, startDestination = "home") {
//                        composable(route = "home") {
//                            HomeScreen {
//                                navController.navigate("detail/$it ")
//                            }
//                        }
//                        composable(
//                            route = "detail/{body}",
//                            arguments = listOf(
//                                navArgument("body") {
//                                    type = NavType.StringType
//                                }
//                            )
//                        ) {
//                            val body = it.arguments?.getString("body") ?: ""
//                            DetailScreen(body)
//                        }
//                    }


                }
            }
        }
    }


//    @OptIn(ExperimentalMaterial3Api::class)
//    @Preview(showBackground = true)
//    @Composable
//    fun PrincipalScreen(
//        modifier: Modifier = Modifier.fillMaxWidth()
//    ) {
//        val scope = rememberCoroutineScope()
//        val navController = rememberNavController()
//        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
//
//        val navigationItems = listOf(
//            Screen.ScreenOne,
//            Screen.ScreenTwo,
//            Screen.ScreenThree,
//        )
//        ModalNavigationDrawer(
//            modifier = modifier.fillMaxWidth(),
//            drawerContent = {
//                ModalDrawerSheet {
//                    Spacer(Modifier.height(12.dp))
//                    items.forEach { item ->
//                        NavigationDrawerItem(
//                            icon = { Icon(item, contentDescription = null) },
//                            label = { Text(item.name) },
//                            selected = item == selectedItem.value,
//                            onClick = {
//                                scope.launch { drawerState.close() }
//                                selectedItem.value = item
//                            },
//                            modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
//                        )
//                    }
//                }
//            },
//            drawerState = drawerState,
//            content ={ innerPadding ->
//                LazyColumn(contentPadding = innerPadding){
//                    item {
//                        DetailScreen()
//                    }
//                }
//            }
//
//        )
//    }

//    @Composable
//    fun Drawer(
//        menu_items: List<Screen>
//    ) {
////        val menu_items = listOf(
////            "Home",
////            "Detail",
////            "Close"
////        )
//        Column {
//            menu_items.forEach { item ->
//                DrawerItem(item = item)
//            }
//        }
//    }

//    @Composable
//    fun DrawerItem(
//        item:  Screen
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(56.dp)
//                .padding(6.dp)
//                .background(Color.White)
//                .clip(RoundedCornerShape(12))
//        ) {
//            Icon(
//                imageVector = item.icon, contentDescription = "drawer",
//                tint = Color.White
//            )
//            Spacer(modifier = Modifier.width(12.dp))
//            Text(text = item.title, style = MaterialTheme.typography.bodyLarge)
//        }
//
//    }

//    ModalNavigationDrawer(
//    drawerState = drawerState,
//    drawerContent = {
//        ModalDrawerSheet() {
//            /* Drawer content */
//            NavigationDrawer(
//                name = "Josue Durand",
//                email = "josh@gmail.com",
//                items = DrawerItem.values().toList()
//            ) {
//                when (it) {
//                    DrawerItem.ABOUT -> {
//                        navController.navigate("home") {
//                            // pops the route to root and places new screen
//                            launchSingleTop = true
//                        }
//                    }
//                    DrawerItem.SETTINGS -> {
//                        navController.navigate("detail") {
//                            // pops the route to root and places new screen
//                            launchSingleTop = true
//                        }
//                    }
//
//                    DrawerItem.PERSONAL -> {
//                        println()
//                    }
//
//                }
//                scope.launch {
//                    drawerState.close()
//                }
//            }
//        }
//    },
//    ) {
//        Scaffold(
//            topBar = {
//                TopBar {
//                    scope.launch {
//                        drawerState.apply {
//                            if (isClosed) open() else close()
//                        }
//                    }
//                }
//            },
//            content = {
//
//            }
//        )
//    }
}


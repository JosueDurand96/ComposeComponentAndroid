package com.durand.composecomponentandroid.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

enum class DrawerItem(
    val icon: ImageVector,
    val text: String
) {
    ABOUT(Icons.Default.Info, "About"),
    SETTINGS(Icons.Default.Settings, "Settings"),
    PERSONAL(Icons.Default.Person, "Personal")
}
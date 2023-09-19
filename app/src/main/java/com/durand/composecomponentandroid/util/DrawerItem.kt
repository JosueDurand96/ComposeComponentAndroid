package com.durand.composecomponentandroid.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

enum class DrawerItem(
    val icon: ImageVector,
    val text: String
) {
    ABOUT(Icons.Outlined.Info, "About"),
    SETTINGS(Icons.Outlined.Settings, "Settings"),
    PERSONAL(Icons.Outlined.Person, "Personal")
}
package com.durand.composecomponentandroid.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun HomeScreen() {
    Column {
        Text(text = "Hello", color = Color(android.graphics.Color.RED))
    }

}


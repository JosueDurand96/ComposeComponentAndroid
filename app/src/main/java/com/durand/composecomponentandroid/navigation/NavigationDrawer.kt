package com.durand.composecomponentandroid.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.durand.composecomponentandroid.util.DrawerItem

@Composable
fun NavigationDrawer(
    name: String,
    email: String,
    items: List<DrawerItem>,
    modifier: Modifier = Modifier,
    onItemClick: (DrawerItem) -> Unit
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(text = name)
        Text(text = email)
        Divider()
        items.forEach {
            Row(
                modifier = modifier
                    .fillMaxWidth  ()
                    .clickable {
                        onItemClick(it)
                    }
            ) {
                Icon(imageVector = it.icon, contentDescription = it.text)
                Text(text = it.text)
            }
        }

    }
}
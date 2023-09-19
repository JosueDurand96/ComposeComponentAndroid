package com.durand.composecomponentandroid.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        Column(
            modifier = modifier.padding(top = 20.dp, start = 16.dp),

            ) {
            Text(text = name, fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Text(text = email, fontWeight = FontWeight.Light, fontSize = 16.sp)
        }
        Divider(
            modifier = modifier.padding(
                top = 20.dp,
                start = 10.dp,
                end = 10.dp,
                bottom = 10.dp
            )
        )
        items.forEach {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .clickable {
                        onItemClick(it)
                    }.padding(16.dp)
            ) {
                Row(
                    modifier = modifier.fillMaxWidth()
                ) {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = it.text,
                    )
                    Text(
                        text = it.text,
                        modifier = modifier.padding(start = 8.dp),
                        fontWeight = FontWeight.Normal,
                        color = Color.Black
                    )
                }
            }
        }

    }
}
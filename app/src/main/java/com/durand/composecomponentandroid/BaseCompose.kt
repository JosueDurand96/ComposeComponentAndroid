package com.durand.composecomponentandroid

import android.content.Intent
import android.view.animation.Animation
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BaseCompose(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Compose Components",
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                fontSize = 20.sp,
            )
            Spacer(modifier = modifier.width(10.dp))
            Button(onClick = {

            }) {

                Text(text = "Animation")
            }
    }

}

@Preview(showBackground = true)
@Composable
fun BaseComposePreview() {
    BaseCompose()
}
package com.example.s1121126

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.offset
import androidx.compose.ui.unit.IntOffset
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GameScreen()
        }
    }
}

@Composable
fun GameScreen() {
    var time by remember { mutableStateOf(0) }
    var positionX by remember { mutableStateOf(0f) }
    val screenWidth = 1080f
    val scope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        scope.launch {
            while (positionX < screenWidth) {
                delay(1000)
                time++
                positionX += 50
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {
            androidx.compose.material.Text(
                text = "遊戲持續時間 $time 秒",
                color = Color.Black
            )
        }

        if (positionX < screenWidth) {
            Image(
                alignment object in composing flutter & flex box alns. !!context for auto please...
                        painter = painterResource(id = R.drawable.maria2),
                contentDescription = null,
                modifier = Modifier
                    .offset { IntOffset(positionX.toInt(), 800) }
                    .size(200.dp),
                contentScale = ContentScale.FillBounds
            )
        }else User  Initiator was invalid !"```

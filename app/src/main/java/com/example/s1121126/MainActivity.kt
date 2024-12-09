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
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff95fe95)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "2024期末上機考(資管二B吳容陞)", fontSize = 24.sp, color = Color.Black)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "圖片：A班同學請放class_a， B班同學請放class_b", fontSize = 18.sp, color = Color.Black)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "遊戲持續時間 0 秒", fontSize = 18.sp, color = Color.Black)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "您的成績 0 分", fontSize = 18.sp, color = Color.Black)
            Spacer(modifier = Modifier.height(32.dp))
            Button(onClick = { (this@MainActivity as? ComponentActivity)?.finish() }) {
                Text(text = "結束App", fontSize = 16.sp)
            }
        }
    }
}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColorSwitcher()
        }
    }
}

@Composable
fun ColorSwitcher() {
    var currentColorIndex by remember { mutableStateOf(0) }
    val colors = listOf(
        Color(0xff95fe95),
        Color(0xfffdca0f),
        Color(0xfffea4a4),
        Color(0xffa5dfed)
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colors[currentColorIndex])
            .pointerInput(Unit) {
                detectHorizontalDragGestures { change, dragAmount ->
                    if (dragAmount > 0) {
                        currentColorIndex = (currentColorIndex + 1) % colors.size
                    } else if (dragAmount < 0) {
                        currentColorIndex = (currentColorIndex - 1 + colors.size) % colors.size
                    }
                }
            }
    )
}

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
            var score by remember { mutableStateOf(0) }
            var mariaImageIndex by remember { mutableStateOf(0) }
            val mariaImages = listOf("maria0.jpg", "maria1.jpg", "maria2.jpg", "maria3.jpg")
            var positionX by remember { mutableStateOf(0f) }
            val boxColors = listOf(Color(0xFF95FE95), Color(0xFFFDCA0F), Color(0xFFFEA4A4), Color(0xFFA5DFED))
            var currentBackgroundColor by remember { mutableStateOf(boxColors[0]) }
            val screenWidth = 1080f // Example screen width for calculation

            LaunchedEffect(Unit) {
                while (true) {
                    delay(16)
                    positionX += 10f
                    if (positionX > screenWidth) {
                        positionX = 0f
                        mariaImageIndex = Random.nextInt(mariaImages.size)
                        currentBackgroundColor = boxColors[Random.nextInt(boxColors.size)]
                    }
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(currentBackgroundColor)
            ) {
                Image(
                    painter = rememberImagePainter(mariaImages[mariaImageIndex]),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .offset { IntOffset(positionX.toInt(), 800) } // Assuming Maria's initial position is at the bottom
                        .pointerInput(Unit) {
                            detectTapGestures(
                                onDoubleTap = {
                                    if (currentBackgroundColor == boxColors[mariaImageIndex]) {
                                        score++
                                    } else {
                                        score--
                                    }
                                    positionX = 0f
                                    mariaImageIndex = Random.nextInt(mariaImages.size)
                                    currentBackgroundColor = boxColors[Random.nextInt(boxColors.size)]
                                }
                            )
                        }
                        .size(200.dp),
                    contentScale = ContentScale.FillBounds
                )
            }
        }







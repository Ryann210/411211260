package com.example.s1121126

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

package com.example.simplejetapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainUI()
        }
    }

    @Composable
    private fun MainUI() {
        Surface(modifier = Modifier.fillMaxSize().padding(top = 60.dp)) {
            Scaffold(
            ) {
                it

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
//                    Image using in the jetpack compose
                    Image(
                        contentScale = ContentScale.FillWidth,
                        contentDescription = "Image",
                        painter = painterResource(R.drawable.img),
                        modifier = Modifier
                            .height(200.dp)
                            .fillMaxWidth()
                    )
//                    Top row using in the jetpack compose
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 32.dp),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Text(text = "Jetpack")
                        Text(text = "Compose")
                    }

                    //           coding challenge for master coding android
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .padding(32.dp)
                            .border(
                                3.dp,
                                color = Color.Black,
                                shape = RectangleShape
                            )
                            .padding(10.dp)
                            .border(2.dp, color = Color.Red),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Master Developer",
                            style = TextStyle(
                                fontSize = 32.sp,
                                fontWeight = FontWeight.Light,
                                textDecoration = TextDecoration.combine(
                                    listOf(
                                        TextDecoration.Underline,
                                        TextDecoration.LineThrough,
                                        TextDecoration.Underline
                                    )
                                )
                            ),
                        )
                        Text(
                            text = "Coding Android",
                            style = TextStyle(fontSize = 32.sp, fontWeight = FontWeight.Light)
                        )
                    }

//                Button usage
                    Button(onClick = {
                        Log.d("Tag", "MainUI:  is running and button is  clicked")
                    }) {
                        Text("Button Simple")
                    }
                }

            }
        }
    }

    //    make preview
    @Preview
    @Composable
    private fun PreviewMainUI() {
        MainUI()
    }

}



package com.example.anorgulshoes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.anorgulshoes.ui.theme.AnorgulShoesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnorgulShoesTheme {
                MainScreen()
            }
                }
            }
        }

@Composable
@Preview
fun AnorgulShoesPreview() {
    AnorgulShoesTheme {
        MainScreen()

    }
}
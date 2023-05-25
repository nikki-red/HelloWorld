package com.example.firstapplicationhelloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstapplicationhelloworld.ui.theme.FirstApplicationHelloWorldTheme

class MainActivity : ComponentActivity() {
    // onCreate fxn is the entry pt to this Android app
    // It calls other fxns to build the UI
    // = main() in Kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContent fxn defines layout through composable fxns
        setContent {
            FirstApplicationHelloWorldTheme {
                // A surface container using the 'background' color from the theme
                // A container that represents a section of UI where appearances alterations can be made
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

// Fxns marked '@Composable' can be called from setContent fxn or from other composable fxns
// '@Composable' tells Kotlin compiler that this fxn is used by JetPack Compose to generate UI
@Composable
// Greeting is a composable fxn
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.LightGray) {
        Text(
            text = "Bonjour, je m'appelle $name!",
            modifier = modifier.padding(24.dp)
        )
    }
}

// '@Preview' tells Android Studio to show the composable's design view
@Preview(showBackground = true)
@Composable
// GreetingPreview is a composable fxn
fun GreetingPreview() {
    FirstApplicationHelloWorldTheme {
        Greeting("Android")
    }
}

/*
You add the @Composable annotation before the function.
@Composable function names are capitalized.
@Composable functions can't return anything.
 */

/*
Composable fxn -> fxn that describes some part of the UI and emits Unit.
Basic building block of Compose
 */
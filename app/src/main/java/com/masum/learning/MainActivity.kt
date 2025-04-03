package com.masum.learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Cyan)
                    .border(10.dp, Color.Red)
                    .padding(5.dp)
                    .border(10.dp, Color.Green)
                    .padding(5.dp)
                    .border(20.dp, Color.Blue)
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("I'm Masum and ")
                //Spacer(Modifier.height(50.dp))
                Text("I love Saheli.",  modifier = Modifier
                    //.draggable(5.dp, onDrag = {}) Was just testing, doesn't work right now
                    .border(5.dp, Color.Red)
                    .padding(10.dp)
                    .border(5.dp, Color.Black))
                Row(
                    modifier = Modifier
//                        .width(300.dp)
//                        .height(300.dp)
                        .background(Color.Cyan),
                      //  .padding(top = 300.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("I ")
                    Text("Love ")
                    Text("Saheli")
                }
            }
        }
    }
}
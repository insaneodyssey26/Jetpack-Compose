package com.masum.learning.Android_CodeLabs.Unit1_Old

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.masum.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface (modifier = Modifier.fillMaxSize()) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Profile()
        Spacer(modifier = Modifier.height(50.dp))
        Contacts()
    }
}

@Composable
fun  Profile() {
    Column (
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val image = painterResource(R.drawable.android_logo)
        Image(painter = image, contentDescription = null)
        Text(
            text = stringResource(R.string.masum),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.android_developer),
            fontSize = 20.sp
        )
    }
}

@Composable
fun Contacts() {
    Column (
        modifier = Modifier
            .padding(bottom = 20.dp),
        verticalArrangement = Arrangement.spacedBy(7.dp), // Sob row te individually modifier na kore, erokom korle sob row er moddhe space thakbe
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row {
            Icon(Icons.Rounded.Phone, contentDescription = "Phone", modifier = Modifier.padding(end = 16.dp))
            Text(text = "+91 98308 81509")
        }
        Row {
            Icon(Icons.Rounded.Share, contentDescription = "Socials", modifier = Modifier.padding(end = 16.dp))
            Text(text = "Social Media")
        }
        Row {
            Icon(Icons.Rounded.Email, contentDescription = "Email", modifier = Modifier.padding(end = 16.dp))
            Text(text = "Email")
        }
    }
}
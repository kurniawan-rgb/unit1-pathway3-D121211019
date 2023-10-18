package com.example.bussinescard_task

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.bussinescard_task.ui.theme.BussinesCard_TaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinesCard_TaskTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BussinesCard()
                }
            }
        }
    }
}


@Composable
fun BussinesCard() {
    val gambarFoto = painterResource(R.drawable.logo_linux)
   Column (
       horizontalAlignment = Alignment.CenterHorizontally,
       modifier = Modifier
           .fillMaxSize()
           .background(color = Color(0xFFDDECD6))

   )
   {
       Image(
           painter = gambarFoto,
           contentDescription = "gambarLinux" ,
           contentScale = ContentScale.Crop,
           modifier = Modifier
               .padding(top = 300.dp)
               .size(100.dp)
               .clip(CircleShape)

       )
       Text(
           text = "Reza Kurniawan",
           fontSize = 20.sp,
           lineHeight = 200.sp,

           )
       Text(
           text = "Student"
       )
       Column (
           modifier = Modifier
               .padding(top = 150.dp, start = 50.dp)
       ) {
           Row {
               Icon(
                   Icons.Filled.Call,
                   contentDescription = null,
                   modifier = Modifier
                       .padding(top = 10.dp)
                       .size(20.dp)
               )

               Text(
                   text = "+62838383xxx",
                   modifier = Modifier
                       .padding(top = 10.dp, start = 8.dp)

               )
           }
           Row {
               Icon(
                   Icons.Filled.Share,
                   contentDescription = null,
                   modifier = Modifier
                       .padding(top = 10.dp)
                       .size(20.dp)
               )
               Text(
                   text = "@rezaaa.krniawan",
                   modifier = Modifier
                       .padding(top = 10.dp, start = 8.dp)
               )
           }
           Row {
               Icon(
                   Icons.Filled.Email,
                   contentDescription = null,
                   modifier = Modifier
                       .padding(top = 10.dp)
                       .size(20.dp)
               )
               Text(
                   text = "kurniawanreza2323@gmail.com",
                   modifier = Modifier
                       .padding(top = 10.dp, start = 8.dp)
               )
           }

       }
   }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BussinesCard_TaskTheme {
        BussinesCard()
    }
}
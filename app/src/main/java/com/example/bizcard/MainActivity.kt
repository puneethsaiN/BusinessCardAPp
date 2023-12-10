package com.example.bizcard

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bizcard.ui.theme.BizCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BizCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardCreator()
                }
            }
        }
    }
}
@Composable
@Preview (
    showSystemUi = true,
    showBackground = true,
)
fun BusinessCardCreator(
    modifier: Modifier = Modifier
){
    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,

    ) {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            val androidLogo = painterResource(R.drawable.daco_1838733)
            Image(
                painter = androidLogo,
                contentDescription = null,
                modifier = Modifier.height(140.dp)
            )

            Text(
                text = "Puneeth Sai Nukala",
                modifier = Modifier.padding(8.dp),
                color = Color.White,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraLight,
            )

            Text(
                text = "Android Development Enthusiast",
                color = Color(0xFF3ddc84),
                modifier = Modifier,
                fontFamily = FontFamily.SansSerif,
            )
        }

        Column(
            modifier = Modifier
                .padding(20.dp),
            verticalArrangement = Arrangement.Bottom,

        ) {
            val myIcons = Icons.Filled
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ){
                Icon(
                    Icons.Filled.Call,
                    contentDescription = null,
                    tint = Color(0xFF3ddc84),
                    modifier = Modifier.size(15.dp),
                )
                Text(
                    modifier = modifier
                        .padding(5.dp),
                    text = "8639305857",
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Justify,
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    Icons.Filled.Share,
                    contentDescription = null,
                    tint = Color(0xFF3ddc84),
                    modifier = Modifier.size(15.dp),
                )

                Text(
                    modifier = modifier
                        .padding(5.dp),
                    text = "@puneeth-nukala",
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Justify,
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    Icons.Filled.Email,
                    contentDescription = null,
                    tint = Color(0xFF3ddc84),
                    modifier = Modifier.size(15.dp),
                )
                Text(
                    modifier = modifier
                        .padding(5.dp),
                    text = "nukalapuneethsai@gmail.com",
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Justify,
                )
            }
        }
    }
}



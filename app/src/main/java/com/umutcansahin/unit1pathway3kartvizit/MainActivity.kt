package com.umutcansahin.unit1pathway3kartvizit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.umutcansahin.unit1pathway3kartvizit.ui.theme.Unit1Pathway3KartvizitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Unit1Pathway3KartvizitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Kart()
                }
            }
        }
    }
}
@Composable
fun Kart(){
    Column(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Column (
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
                ){

            Image(
                painter = painterResource(
                    id = R.drawable.android_logo),
                    contentDescription = null
            )
            Text(
                text = stringResource(id = R.string.full_name),
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp
            )
            Text(
                text = stringResource(id = R.string.title),
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 32.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .padding(4.dp)
            ) {
                Image(
                    painter = painterResource(
                        id = R.drawable.ic_baseline_local_phone_24),
                        contentDescription = null,
                    modifier = Modifier
                        .padding(start = 16.dp,end = 16.dp)
                )
                Text(
                    text = stringResource(id = R.string.phone_number),

                )
            }
            Row(
                modifier = Modifier.padding(4.dp)
            ) {
                Image(
                    painter = painterResource(
                        id = R.drawable.ic_baseline_share_24),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 16.dp,end = 16.dp)
                )
                Text(
                    text = stringResource(id = R.string.social_media),

                    )
            }
            Row(
                modifier = Modifier.padding(4.dp)
            ) {
                Image(
                    painter = painterResource(
                        id = R.drawable.ic_baseline_email_24),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 16.dp,end = 16.dp)
                )
                Text(
                    text = stringResource(id = R.string.email),

                    )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Unit1Pathway3KartvizitTheme {
        Kart()
    }
}
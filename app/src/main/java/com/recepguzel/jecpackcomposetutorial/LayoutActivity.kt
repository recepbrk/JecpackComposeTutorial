package com.recepguzel.jecpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.recepguzel.jecpackcomposetutorial.ui.theme.JecpackComposeTutorialTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JecpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LearnRowColumnBox()
                }
            }
        }
    }
}
/*
ColumnLayout -> LinearLayout Vertical
RowLayout -> LinearLayout Horizontal
BoxLayout -> Card view

match-parent ->Modifier.fillMaxSize(),Modifier.fillMaxWidth(),Modifier.fillMaxHeight()
wrap-content -> Modifier.size(),Modifier.width(),Modifier.height()
size -> yataydaki genişlik
height -> dikeydeki genişlik
 */

@Composable
fun LearnRowColumnBox() {
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Hello Column 1")
            Text(text = "Hello Column 2")
        }


        Row(

            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = stringResource(id = R.string.app_name), color = Color.Black)
            Text(text = "Hello Row 2")
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .padding(5.dp)
                    .height(200.dp) // dikeydeki kutu uzunluk
                    .width(300.dp) // yataydaki kutu uzunluk
                    .background(Color.Green)
            ) {
                Text(
                    text = "Hello Box",
                    modifier = Modifier.align(Alignment.Center),
                    color = Color.Blue,
                    fontStyle = FontStyle.Normal,
                    fontSize = 30.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowPreviewLayout() {
    JecpackComposeTutorialTheme {
        LearnRowColumnBox()
    }
}
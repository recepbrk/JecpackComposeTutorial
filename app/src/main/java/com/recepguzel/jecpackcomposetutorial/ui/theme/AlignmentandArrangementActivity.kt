package com.recepguzel.jecpackcomposetutorial.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.recepguzel.jecpackcomposetutorial.ui.theme.ui.theme.JecpackComposeTutorialTheme

class AlignmentandArrangementActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JecpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FullAlignmentAndArrangementExample()
                }
            }
        }
    }
}
/*
Alignment (Hizalama)
Yatay Hizalama (Horizontal Alignment)

Aligment.Start -> Bileşeni konteynerin sol tarafına hizalar.
Aligment.CenterHorizontally ->Bileşeni konteynerin yatay ekseninde ortalar
Aligment.End -> Bileşeni konteynerin sağ tarafına hizalar.

Dikey Hizalama (Vertical Alignment)

Aligment.Top -> Bileşeni konteynerin üst tarafına hizalar.
Aligment.CenterVertically -> Bileşeni konteynerin dikey ekseninde ortalar.
Aligment.Bottom -> Bileşeni konteynerin alt tarafına hizalar.


Arrangement (Düzenleme)
Vertical Arrangement (Dikey Düzenleme)

Arrangement.Top -> Bileşeni konteynerin üst kısmına hizaalar.
Arrangement.Center -> Bileşenleri konteynerin dikey ekseninde ortalar.
Arrangement.Bottom -> Bileşenleri konteynerin alt kısmına hizlar.
Arrangement.SpaceBetween -> İlk bileşen ile konteynerin üstü ve son bileşen ile konteynerin altı arasında boşluk bırakır,
 diğer bileşenler arasında eşit boşluk bırakır.

 Arrangement.SpaceAround -> Tüm bileşenler arasında eşit boşluk bırakır.
  İlk ve son bileşenler ile konteynerin kenarları arasında yarı boşluk bırakır.

Arrangement.SpaceEvenly: Bileşenler arasında ve konteynerin kenarları arasında eşit boşluk bırakır.

Horizontal Arrangement (Yatay Düzenleme)


Arrangement.Start: Bileşenleri konteynerin sol tarafına hizalar.
Arrangement.Center: Bileşenleri konteynerin yatay ekseninde ortalar.
Arrangement.End: Bileşenleri konteynerin sağ tarafına hizalar.
Arrangement.SpaceBetween: İlk bileşen ile konteynerin solu ve son bileşen ile konteynerin sağı arasında boşluk bırakır, diğer bileşenler arasında eşit boşluk bırakır.
Arrangement.SpaceAround: Tüm bileşenler arasında eşit boşluk bırakır. İlk ve son bileşenler ile konteynerin kenarları arasında yarı boşluk bırakır.
Arrangement.SpaceEvenly: Bileşenler arasında ve konteynerin kenarları arasında eşit boşluk bırakır.
 */

@Composable
fun FullAlignmentAndArrangementExample() {
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.Green),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Column içindeki Text bileşenleri
        Text(
            "Top and Start",
            modifier = Modifier.align(Alignment.Start)
        )
        Text(
            "Center Horizontally",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            "Bottom and End",
            modifier = Modifier.align(Alignment.End)
        )

        // Row içindeki düzenlemeler
        Row(
            modifier = Modifier.fillMaxWidth().height(100.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Start")
            Text("Center")
            Text("End")
        }

        // Başka bir Row düzenlemesi
        Row(
            modifier = Modifier.fillMaxWidth().height(100.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Start")
            Text("Center")
            Text("End")
        }

        // Bir başka Row düzenlemesi
        Row(
            modifier = Modifier.fillMaxWidth().height(100.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Start")
            Text("Center")
            Text("End")
        }

        // Son Row düzenlemesi
        Row(
            modifier = Modifier.fillMaxWidth().height(100.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Start")
            Text("Center")
            Text("End")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JecpackComposeTutorialTheme {
        FullAlignmentAndArrangementExample()
    }
}
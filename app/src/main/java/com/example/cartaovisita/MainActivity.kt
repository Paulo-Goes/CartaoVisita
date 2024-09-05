package com.example.cartaovisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaovisita.ui.theme.CartaoVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoVisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CartaoImage(
                        stringResource(R.string.nome),
                        stringResource(R.string.profissao)
                    )
                }
            }
        }
    }
}

@Composable
fun CartaoText(nome: String, profissao: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = nome,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = profissao,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(end = 16.dp)
                .align(alignment = Alignment.End)

        )
    }
}

@Composable
fun CartaoImage(nome: String, profissao: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.linuxpenguin)
    Box(modifier) {
        Image(
            painter = painterResource(id = R.drawable.linuxpenguin),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        CartaoText(
            nome = nome,
            profissao = profissao,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = false)
@Composable
fun CartaoPreview() {
    CartaoVisitaTheme {
        CartaoImage(
            nome = stringResource(R.string.nome),
            profissao = stringResource(R.string.profissao)
        )
    }
}
package com.example.cartaovisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaovisita.ui.theme.CartaoVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoVisitaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Gray
                ) {
                    CartaoVisita(
                        stringResource(R.string.nome),
                        stringResource(R.string.profissao),
                        stringResource(R.string.actualProfissao)
                    )
                }
            }
        }
    }
}

@Composable
fun TopContent(nome: String, modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp),
    ) {
        Image(
            painter = painterResource(R.drawable.fotoeu),
            contentDescription = null,
            modifier = Modifier
                .size(250.dp)
                .clip(CircleShape)
        )
        Text(
            text = nome,
            fontSize = 60.sp,
            color = Color(0xFF54C285),
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
fun CenterContent(profissao: String, actualProfissao: String, modifier: Modifier) {
    Box(modifier) {
        Image(
            painter = painterResource(R.drawable.androidlogo),
            contentDescription = null,
            alpha = 0.7f,
            modifier = Modifier.align(Alignment.Center)
        )
        Text(
            text = profissao,
            style = TextStyle(
                fontSize = 32.sp,
                color = Color(0xFF54C285),
                textDecoration = TextDecoration.LineThrough
            ),
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 130.dp)
        )
        Text(
            text = actualProfissao,
            fontSize = 32.sp,
            color = Color.DarkGray,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 220.dp)
        )
    }
}

@Composable
fun CartaoVisita(
    nome: String,
    profissao: String,
    actualProfissao: String,
    modifier: Modifier = Modifier
) {
    TopContent(nome, modifier)
    CenterContent(profissao, actualProfissao, modifier)
    Column(

    ) {

    }
}

@Preview(showBackground = false)
@Composable
fun CartaoPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Gray
    ) {
        CartaoVisita(
            stringResource(R.string.nome),
            stringResource(R.string.profissao),
            stringResource(R.string.actualProfissao)
        )
    }
}
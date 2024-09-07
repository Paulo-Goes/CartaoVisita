package com.example.cartaovisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Gray
                ) {
                    CartaoVisita(
                        nome = stringResource(R.string.nome),
                        profissao = stringResource(R.string.profissao),
                        actualProfissao = stringResource(R.string.actualProfissao)
                    )
                }
            }
        }
    }
}

@Composable
fun CartaoVisita(
    nome: String,
    profissao: String,
    actualProfissao: String,
    modifier: Modifier = Modifier
) {
    Box(modifier) {
        Image(
            painter = painterResource(R.drawable.androidlogo),
            contentDescription = null,
            modifier = Modifier.align(Alignment.Center),
            alpha = 0.7f
        )

    }
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp),
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
            color = Color(0xFF3ddc84),
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = profissao,
            fontSize = 50.sp,
            color = Color(0xFF3ddc84),
            modifier = Modifier
                .padding(top = 60.dp)
        )
        Text(
            text = actualProfissao,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(top = 16.dp)
        )
    }
    Column() {
        Row() {

        }
        Row() {

        }
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
            nome = stringResource(R.string.nome),
            profissao = stringResource(R.string.profissao),
            actualProfissao = stringResource(R.string.actualProfissao)
        )
    }
}
package com.example.coffeeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
private fun OfferPreview() {
    Offer("This is a title", "Description of the offer")
}

@Composable
fun Offer(title: String, description: String = "") {
    Box(
        modifier = Modifier.padding(16.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.background_pattern),
            contentDescription = "Background Pattern",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.matchParentSize()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = title,
             //   style = MaterialTheme.typography.h5,
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.Cyan)
                    .padding(16.dp)
            )
            Text(
                text = description,
            //    style = MaterialTheme.typography.h6,
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.Cyan)
                    .padding(16.dp)
            )

        }
    }

}
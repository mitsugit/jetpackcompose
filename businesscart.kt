package com.example.layouttest


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.material3.Text

@Composable
fun CardLayout(modifier: Modifier=Modifier){
    Card(
        modifier = modifier
            .padding(16.dp)
            .size(width = 300.dp, height = 150.dp))
            {
                Box(
                    contentAlignment = Alignment.CenterStart,
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize()
                ){
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription=null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                    )
                    Row(horizontalArrangement=Arrangement.spacedBy(8.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_launcher_background),
                            contentDescription = null,

                            modifier = Modifier
                                .size(100.dp)
                                .clip(CircleShape)
                        )
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(text = "Murata",
                                style = MaterialTheme.typography.titleLarge
                            )
                            Text(text="My name is Mitsuhiro. I'm a developer of Android")
                        }
                    }
                }
            }
}

@Preview(showBackground = true)
@Composable
fun CardLayoutPreview() {
    CardLayout()
}

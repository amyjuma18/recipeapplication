package com.example.recipeapplication

import android.text.Layout.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Arrowback
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.recipeapplication.models.enticingrecipes
import java.lang.reflect.Modifier

@Composable
fun DetailScreen(id: Long, name: String?, onNavigateUp: () ->
Unit){
    val recipes = enticingrecipes.first{it.id == id }
    val scrollState = rememberScrollState()
    Scaffold{
        Column(Modifier.padding(it)) {
            Row(
                verticalAlignment =
Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 10.dp),
            ){
                IconButton(onClick = onNavigateUp) {
                    Icon(Icons.Rounde.ArrowBack,
                    contentDescription = "Back")
                }
                Spacer(modifier = Modifier.width(80.dp))
                val link = LocalUriHandler.current

                Button(onClick = {
                    link. openUrl("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Kh4BUcKcrdE\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write;" +
                            " encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>")
                }) {
                    Text("A YouTube Video showing how to prepare the dish")

                }
            }
            Column(modifier = Modifier.verticalScroll(state = scrollState)) {

                Image(
                    painterResource(recipes.imageResource),
                    contentDescription = null,
                            modifier = Modifier
                                .fillMaxiWidth()
                                .aspectRatio(16f / 9f), contentScale =
                        ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp)
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
                         style =
            MaterialTheme.typography.body1, text = recipes.title
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text("INGREDIENTS")
                    for (ingredient in recipes.ingredients) (
                            Text(
                                "-$ingredient",
                                style =
                                    MaterialTheme.typography.body1,
                            )
                            )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text("METHOD")
                for (method in recipes.method) {
                    Text(
                        "-$method", modifier =
                            Modifier.fillMaxSize(),
                        style =
                            MaterialTheme.typpographhy.body1,
                    )
                }
            }
        }
    }
}
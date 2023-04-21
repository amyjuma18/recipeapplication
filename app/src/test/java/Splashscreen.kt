package com.example.recipeapplication

import android.window.SplashScreen
import androidx.compose.foundation.layout.row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.recipeapplication.models.enticingrecipes
import java.lang.reflect.Modifier

@Composable
fun SplashScreen(onDetailsClick:(id : Long) -> Unit) {
    Scaffold {
        LazyColumn(contentPadding = it) {
            item {
                SplashScreenBar()
            }
            items(enticingrecipes) {
                RecipeCard(it, onClick = {
                    onDetailsClick(it.id)
                })
            }
        }
    }
}
@Composable
private fun SplashScreenBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 16.dp,
            vertical = 10.dp)
                    ){
                        Text("The best Recipes", style =
                        MaterialTheme.typography.h6)
                    }
                }
        }
    }
}


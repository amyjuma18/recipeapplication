package com.example.recipeapplication.models;

import androidx.annotation.DrawableRes

data class Recipe (
    val id : Long,
    val title : String,
    val ingredients:List<String>,
    @DrawableRes
    val imageResource:Int,
    val method : List<String>
        )

val beefpilau = Recipe (
    1,
    "Beef Pilau",
    listOf("250g Beef",
    "2 Onions",
    "4 cloves garlic",
    "thumb sized ginger",
    "2 small bay leaves",
     "salt to taste",
     "1/4 cup sunflower oil",
     "1 tea spoon ground cloves",
     "1/2 teaspoon ground cumin(optional)",
     "1/2 teaspoon ground cardamom",
     "1/2 teaspoon Ground pepper",
     "2 cups Rice",
    " INSTRUCTIONS ",
        "1.Peel the onions and garlic cloves. \n",
        "2.Wash the beef and add into a pan. Slice in one onion and 2 garlic cloves with the ginger. " +
                "Add bay leaves, with a cup of water and some salt to taste.\n ",
        "3.Cook until the beef is tender, then remove from heat. Keep the meet chunks and stock to one side.\n",
        "4.Chop the remaining onion and garlic.\n",
        "5.Wash the rice and repeat until the water runs clear.\n",
        "6.In another pan, heat the oil under low heat. Add the onions into the pot and cook until the onions start to caramelize and become brown. " +
                "You should stir the onions with a wooden spoon continuously to prevent burning.\n",
        "7.Pour in the garlic and the ground spices. Stir for 30 secs.\n",
        "8.Add the rice into the pot. Pour in the stock and meat chunks. Add more water so there is enough to cook the rice (read the rice pack instructions)." +
                " Taste for salt and add more if needed.\n",
        "9.Cover the allow the rice to cook until all the moisture is absorbed.\n" )

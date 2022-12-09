package com.moj.androidlistview.Services

import com.moj.androidlistview.Model.Category
import com.moj.androidlistview.Model.Product

object DataServices { // object is like static in java, its a pattern name SINGLETON, helping us to access this data in all the app

    val categories = listOf(
        Category("BALL", "ball_cover"),
        Category("Gloves", "gloves_cover"),
        Category("Flask", "flask_cover"),
        Category("SHOE", "shoe_cover")
    )

    val balls = listOf(
        Product("ball #1", "98,000 T", "ball1"),
        Product("ball #2", "110,000 T", "ball2"),
        Product("ball #3", "120,000 T", "ball3"),
        Product("ball #4", "130,000 T", "ball4"),
        Product("ball #5", "140,000 T", "ball5"),
        Product("ball #6", "150,000 T", "ball6"),
    )

    val gloves = listOf(
        Product("gloves #1", "98,0000 T", "gloves1"),
        Product("gloves #2", "110,000 T", "gloves2"),
        Product("gloves #3", "120,000 T", "gloves3"),
        Product("gloves #4", "130,000 T", "gloves4"),
        Product("gloves #5", "140,000 T", "gloves5"),
        Product("gloves #6", "150,000 T", "gloves6"),
    )

    val shoes = listOf(
        Product("shoes #1", "98,0000 T", "shoes1"),
        Product("shoes #2", "110,000 T", "shoes2"),
        Product("shoes #3", "120,000 T", "shoes3"),
        Product("shoes #4", "130,000 T", "shoes4"),
        Product("shoes #5", "140,000 T", "shoes5"),
        Product("shoes #6", "150,000 T", "shoes6"),
    )

    val flasks = listOf(
        Product("flask #1", "98,0000 T", "flask1"),
        Product("flask #2", "110,000 T", "flask2"),
        Product("flask #3", "120,000 T", "flask3"),
        Product("flask #4", "130,000 T", "flask4"),
        Product("flask #5", "140,000 T", "flask5"),
        Product("flask #6", "150,000 T", "flask6"),
    )


}
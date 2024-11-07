package com.paudam.recicleviewbase

class DataSource {
    val arrayChanclas = listOf(
        Chancles(R.drawable.chanclas, 20, "Nike"),
        Chancles(R.drawable.chanclas, 10, "Arena"),
        Chancles(R.drawable.chanclas, 15, "Adidas"),
        Chancles(R.drawable.chanclas, 12, "Puma"),
        Chancles(R.drawable.chanclas, 19, "NorthFace"),
    )

     fun loadChancles(): List<Chancles> {
        return arrayChanclas
    }
}
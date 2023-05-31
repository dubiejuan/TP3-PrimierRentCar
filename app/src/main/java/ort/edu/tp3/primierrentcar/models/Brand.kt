package ort.edu.tp3.primierrentcar.models

import java.io.Serializable

data class Brand(
    val image: String,
    val name: String,
    val amount: Int,
) : Serializable

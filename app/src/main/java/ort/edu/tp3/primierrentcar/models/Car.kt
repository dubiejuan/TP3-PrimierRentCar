package ort.edu.tp3.primierrentcar.models

import java.io.Serializable

data class CarResponse(val cars: List<Car>)

data class Car(
    val fuelType: String,
    val make: String,
    val model: String,
    val transmission: String,
    val year: Int
) : Serializable
package ort.edu.tp3.primierrentcar.models

import java.io.Serializable
import com.google.gson.annotations.SerializedName


data class Car(
    @SerializedName("fuel_type") val fuelType: String,
    @SerializedName("make") val brand: String,
    val model: String,
    val transmission: String,
    val year: Int,
    @SerializedName("class") val seats: String
) : Serializable
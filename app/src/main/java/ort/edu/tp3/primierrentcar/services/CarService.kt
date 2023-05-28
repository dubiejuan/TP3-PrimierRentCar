package ort.edu.tp3.primierrentcar.services

import ort.edu.tp3.primierrentcar.models.CarResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface CarService {

    @GET("cars")
    fun getCars(@Header("X-Api-Key") apiKey: String): Call<CarResponse>
}
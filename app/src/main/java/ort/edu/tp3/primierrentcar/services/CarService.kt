package ort.edu.tp3.primierrentcar.services

import ort.edu.tp3.primierrentcar.models.Car
//import ort.edu.tp3.primierrentcar.models.CarResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface CarService {

    @GET("v1/cars?drive=4wd&limit=20")
    fun getCars(@Header("X-Api-Key") apiKey: String): Call<List<Car>>

}
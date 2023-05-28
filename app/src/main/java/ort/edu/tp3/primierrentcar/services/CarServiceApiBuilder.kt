package ort.edu.tp3.primierrentcar.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CarServiceApiBuilder {

    private val BASE_URL = "https://api-ninjas.com/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    fun create(): CarService {
        return retrofit.create(CarService::class.java)
    }
}
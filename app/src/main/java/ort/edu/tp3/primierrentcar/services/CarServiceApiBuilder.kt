package ort.edu.tp3.primierrentcar.services

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CarServiceApiBuilder {

    private const val BASE_URL = "https://api.api-ninjas.com/"
    private val gson = GsonBuilder().setLenient().create()

    private val builder = OkHttpClient.Builder()
    private val client = builder.build()



    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(client)
        .build();


    fun create(): CarService {
        return retrofit.create(CarService::class.java)
    }
}
package ort.edu.tp3.primierrentcar.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ort.edu.tp3.primierrentcar.R
import ort.edu.tp3.primierrentcar.adapters.CarsAdapter
import ort.edu.tp3.primierrentcar.models.Car
import ort.edu.tp3.primierrentcar.services.CarServiceApiBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CarsFragment : Fragment() {

    var cars: MutableList<Car> = ArrayList<Car>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_cars, container, false)

        cars = getCarsFromAPI()

        val recyclerViewStudents = view.findViewById<RecyclerView>(R.id.recyclerViewCars)

        recyclerViewStudents.adapter = CarsAdapter(cars)

        val linearLayoutManager = LinearLayoutManager(context)
        recyclerViewStudents.layoutManager = linearLayoutManager

        // Inflate the layout for this fragment
        return view
    }

    private fun getCarsFromAPI(): MutableList<Car> {
        val service = CarServiceApiBuilder.create()
        var cars: MutableList<Car> = ArrayList<Car>()

        service.getCars("4f2iewpk4/dlwwMZhXLWUw==DNvPKb2zSFq4z11n").enqueue(object :
            Callback<List<Car>> {
            override fun onResponse(call: Call<List<Car>>, response: Response<List<Car>>) {
                if (response.isSuccessful) {
                    cars = response.body() as MutableList<Car>
                }
            }

            override fun onFailure(call: Call<List<Car>>, t: Throwable) {
                Log.e("Example", t.stackTraceToString())
            }
        })

        return cars
    }

}
package ort.edu.tp3.primierrentcar.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ort.edu.tp3.primierrentcar.R
import ort.edu.tp3.primierrentcar.holders.CarViewHolder
import ort.edu.tp3.primierrentcar.models.Car

class CarsAdapter(
    private val cars: MutableList<Car>,
    private val context:Context
) : RecyclerView.Adapter<CarViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
        return CarViewHolder(view,context)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = cars[position]
        holder.setTransmission(car.transmission)
        holder.setFuelType(car.fuelType)
        holder.setYear(car.year)
        holder.setBrand(car.brand)
        holder.setImage(car.brand)

    }

    override fun getItemCount(): Int {
        return cars.size
    }
}
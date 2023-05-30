package ort.edu.tp3.primierrentcar.holders

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ort.edu.tp3.primierrentcar.R

class CarViewHolder(v: View,private val context:Context) : RecyclerView.ViewHolder(v) {
    private var view: View

    init {
        this.view = v
    }

    fun setTransmission(transmission: String) {
        val txt = this.view.findViewById<TextView>(R.id.txtCardViewCarTransmission)
        txt.text = transmission
        if(transmission=="a") {
            txt.text = "automatic"
        } else {
            txt.text = "manual"
        }
    }

    fun setFuelType(fuelType: String) {
        val txt = this.view.findViewById<TextView>(R.id.txtCardViewCarFuelType)
        txt.text = fuelType
    }

    fun setYear(year: Int) {
        val txt = this.view.findViewById<TextView>(R.id.txtCardViewCarYear)
        txt.text = year.toString()
    }

    fun setBrand(brand: String) {
        val txt = this.view.findViewById<TextView>(R.id.txtCardViewCarClass)
        txt.text = brand
    }

    fun setSeats(seats: String) {
        val txt = this.view.findViewById<TextView>(R.id.txtCardViewCarClass)
        txt.text = seats
    }

    fun setImage(brand: String) {
        val image = this.view.findViewById<ImageView>(R.id.imgCardViewCarImage)
        var drawableId: Int
        if(brand=="land rover"){
            drawableId = context.resources.getIdentifier("land_rover", "drawable", context.packageName)
        } else {
            drawableId = context.resources.getIdentifier(brand, "drawable", context.packageName)
        }
        image.setImageResource(drawableId)
    }

    fun setName(brand: String, model: String) {
        val txt = this.view.findViewById<TextView>(R.id.txtCardViewCarName)
        val name = "$brand $model"
        txt.text = name.uppercase()
    }

    fun getContainer() : View {
        return this.view.findViewById<View>(R.id.cardViewItem)
    }
}

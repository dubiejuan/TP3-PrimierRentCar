package ort.edu.tp3.primierrentcar.holders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ort.edu.tp3.primierrentcar.R

class CarViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    private var view: View

    init {
        this.view = v
    }

    fun setTransmission(transmission: String) {
        val txt = this.view.findViewById<TextView>(R.id.txtCardViewCarTransmission)
        txt.text = transmission
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
        val txt = this.view.findViewById<TextView>(R.id.txtCardViewCarBrand)
        txt.text = brand
    }

    fun getContainer() : View {
        return this.view.findViewById<View>(R.id.cardViewItem)
    }
}

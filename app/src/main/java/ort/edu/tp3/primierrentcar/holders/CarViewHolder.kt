package ort.edu.tp3.primierrentcar.holders

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import ort.edu.tp3.primierrentcar.R

class CarViewHolder(v: View,private val context:Context) : RecyclerView.ViewHolder(v) {
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

    fun setImage(brand: String) {
        val image = this.view.findViewById<ImageView>(R.id.imgCardViewCarImage)
        val drawableId = context.resources.getIdentifier(brand, "drawable", context.packageName)
        image.setImageResource(drawableId)
    }

    fun getContainer() : View {
        return this.view.findViewById<View>(R.id.cardViewItem)
    }
}

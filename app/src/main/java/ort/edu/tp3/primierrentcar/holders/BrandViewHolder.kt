package ort.edu.tp3.primierrentcar.holders

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ort.edu.tp3.primierrentcar.R

class BrandViewHolder(v: View, private val context: Context) : RecyclerView.ViewHolder(v)  {

    private var view: View

    init {
        this.view = v
    }

    fun setName(name: String) {
        val txt = this.view.findViewById<TextView>(R.id.txtCardViewBrandName)
        txt.text = name
    }

    fun setImage(image: String) {
        val brandImage = this.view.findViewById<ImageView>(R.id.imgBrandCardItem)
        var drawableId: Int
        if(image=="land rover"){
            drawableId = context.resources.getIdentifier("land_rover", "drawable", context.packageName)
        } else {
            drawableId = context.resources.getIdentifier(image, "drawable", context.packageName)
        }
        brandImage.setImageResource(drawableId)
    }

    fun setAmount(amount: Int) {
        val txt = this.view.findViewById<TextView>(R.id.txtCardViewBrandNumber)
        txt.text = "+" + amount
    }
}

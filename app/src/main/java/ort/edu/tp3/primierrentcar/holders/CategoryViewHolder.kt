package ort.edu.tp3.primierrentcar.holders

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import ort.edu.tp3.primierrentcar.R

class CategoryViewHolder(v: View, private val context: Context) : RecyclerView.ViewHolder(v) {
    private var view: View
    init {
        this.view = v
    }

    fun setTitle(title: String) {

        val txt = this.view.findViewById<TextView>(R.id.txtCarViewCategoryTitle)
        txt.text =  title;
    }

    fun setColor(color: String) {
        val txt = this.view.findViewById<LinearLayoutCompat>(R.id.LLCardViewCateogoryColor)
        val colorNumber = Color.parseColor(color)
        txt.setBackgroundColor(colorNumber)
    }

    fun setImage(type: String) {
        val image = this.view.findViewById<ImageView>(R.id.imgCarViewCategoryName)
        var drawableId = context.resources.getIdentifier(type, "drawable", context.packageName)
        image.setImageResource(drawableId)
    }

    fun getContainer() : View {
        return this.view.findViewById<View>(R.id.cardViewItem)
    }
}




package ort.edu.tp3.primierrentcar.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ort.edu.tp3.primierrentcar.R
import ort.edu.tp3.primierrentcar.holders.BrandViewHolder
import ort.edu.tp3.primierrentcar.models.Brand

class BrandAdapter(
    private val brands: MutableList<Brand>,
    private val context: Context
) : RecyclerView.Adapter<BrandViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrandViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.brand_item, parent, false)
        return BrandViewHolder(view,context)
    }

    override fun getItemCount(): Int {
        return brands.size
    }

    override fun onBindViewHolder(holder: BrandViewHolder, position: Int) {
        val brand = brands[position]
        holder.setImage(brand.image)
        holder.setName(brand.name)
        holder.setAmount(brand.amount)
    }

}
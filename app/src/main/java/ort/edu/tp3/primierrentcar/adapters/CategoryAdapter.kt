package ort.edu.tp3.primierrentcar.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ort.edu.tp3.primierrentcar.R

import ort.edu.tp3.primierrentcar.holders.CategoryViewHolder
import ort.edu.tp3.primierrentcar.models.Category

class CategoryAdapter (
    private val categories: MutableList<Category>,
    private val context: Context
) : RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return CategoryViewHolder(view,context)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]

         holder.setColor(category.color)
         holder.setTitle(category.name)
         holder.setImage(category.type)
    }



    override fun getItemCount(): Int {
        return categories.size
    }
}




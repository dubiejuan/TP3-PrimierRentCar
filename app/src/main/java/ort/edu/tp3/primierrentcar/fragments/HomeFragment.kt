package ort.edu.tp3.primierrentcar.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ort.edu.tp3.primierrentcar.R
import ort.edu.tp3.primierrentcar.adapters.BrandAdapter
import ort.edu.tp3.primierrentcar.adapters.CarsAdapter
import ort.edu.tp3.primierrentcar.adapters.CategoryAdapter
import ort.edu.tp3.primierrentcar.models.Brand
import ort.edu.tp3.primierrentcar.models.Car
import ort.edu.tp3.primierrentcar.models.Category

class HomeFragment : Fragment() {

    private val ct1 = Category("deportivo","#FFCC00","Deportivos")
    private val ct2 = Category("suv","#FF3330E6","SUV")
    private val ct3 = Category("electrico","#04D9FF","Electricos")
    private val b1 = Brand("toyota", "toyota", 25)
    private val b2 = Brand("land rover", "land rover", 5)
    private val b3 = Brand("kia", "kia", 15)
    private val b4 = Brand("chevrolet", "chevrolet", 2)
    private val b5 = Brand("ford", "ford", 8)
    private val b6 = Brand("mazda", "mazda", 3)
    private val b7 = Brand("nissan", "nissan", 16)

    private val categories: MutableList<Category> = ArrayList()
    private val brands: MutableList<Brand> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        categories.add(ct1)
        categories.add(ct2)
        categories.add(ct3)
        brands.add(b1)
        brands.add(b2)
        brands.add(b3)
        brands.add(b4)
        brands.add(b5)
        brands.add(b6)
        brands.add(b7)

        val recyclerViewCategory = view.findViewById<RecyclerView>(R.id.recycleViewCategories)
        val recyclerViewBrands = view.findViewById<RecyclerView>(R.id.recycleViewBrands)

        val linearLayoutManager = LinearLayoutManager(context)
        val linearLayoutManagerBrands = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        recyclerViewCategory.adapter = CategoryAdapter(categories,requireContext())
        recyclerViewBrands.adapter = BrandAdapter(brands,requireContext())

        recyclerViewCategory.layoutManager = linearLayoutManager
        recyclerViewBrands.layoutManager = linearLayoutManagerBrands

        return view
    }

}
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
import ort.edu.tp3.primierrentcar.adapters.CarsAdapter
import ort.edu.tp3.primierrentcar.adapters.CategoryAdapter
import ort.edu.tp3.primierrentcar.models.Car
import ort.edu.tp3.primierrentcar.models.Category

class HomeFragment : Fragment() {

    private val ct1 = Category("deportivo","#FFCC00","Deportivos")
    private val ct2 = Category("suv","#FF3330E6","SUV")
    private val ct3 = Category("electrico","#04D9FF","Electricos")

    private val categories: MutableList<Category> = ArrayList()


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


        val recyclerViewCategory = view.findViewById<RecyclerView>(R.id.recycleViewCategories)

        val linearLayoutManager = LinearLayoutManager(context)

        recyclerViewCategory.adapter = CategoryAdapter(categories,requireContext())

        recyclerViewCategory.layoutManager = linearLayoutManager


        return view
    }

}
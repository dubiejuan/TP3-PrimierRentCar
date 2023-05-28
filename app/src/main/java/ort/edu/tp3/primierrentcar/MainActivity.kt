package ort.edu.tp3.primierrentcar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import ort.edu.tp3.primierrentcar.models.CarResponse
import ort.edu.tp3.primierrentcar.services.CarServiceApiBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavView : BottomNavigationView
    private lateinit var navHostFragment : NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment

        bottomNavView = findViewById(R.id.bottom_bar)

        NavigationUI.setupWithNavController(bottomNavView,navHostFragment.navController)
    }

    fun getCars() {
        val service = CarServiceApiBuilder.create()

        service.getCars("4f2iewpk4/dlwwMZhXLWUw==DNvPKb2zSFq4z11n").enqueue(object : Callback<CarResponse> {
            override fun onResponse(call: Call<CarResponse>, response: Response<CarResponse>) {
                if (response.isSuccessful) {
                    val cars = response.body()

                    /*
                    activityText.text = car?.name ?: "Activity no encontrada"
                    typeText.text = car?.type ?: "Type no encontrado"
                    */
                }
            }

            override fun onFailure(call: Call<CarResponse>, t: Throwable) {
                Log.e("Example", t.stackTraceToString())
            }
        })
    }

}


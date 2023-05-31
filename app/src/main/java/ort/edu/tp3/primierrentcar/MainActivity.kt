package ort.edu.tp3.primierrentcar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

import com.google.android.material.navigation.NavigationView
import ort.edu.tp3.primierrentcar.fragments.ProfileFragment
import ort.edu.tp3.primierrentcar.models.Car
import ort.edu.tp3.primierrentcar.services.CarServiceApiBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

 private lateinit var bottomNavView : BottomNavigationView
    private lateinit var navHostFragment : NavHostFragment
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        toolbar = findViewById(R.id.toolbar)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        bottomNavView = findViewById(R.id.bottom_bar)

        NavigationUI.setupWithNavController(bottomNavView,navHostFragment.navController)

        drawerLayout = findViewById(R.id.drawer_menu)
        navigationView = findViewById(R.id.nav_view)

//        setSupportActionBar(toolbar) // Configurar la ActionBar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.menu)

        // Ocultar el título del fragmento en la ActionBar
        supportActionBar?.setDisplayShowTitleEnabled(false)

        setupDrawerLayout()
    }

    private fun setupDrawerLayout() {
        val navController = navHostFragment.navController

        navigationView.setupWithNavController(navController) // Vinculo la navegación del drawer con la del graph

        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)  // Configuro la appbar para que muestre el icono del drawer y actualice el titulo

        // Listener para cuando se realiza la navegacion
       /* navController.addOnDestinationChangedListener { _, _, _ ->
            supportActionBar?.setHomeAsUpIndicator(R.drawable.menu) // Aca le digo que quiero que mi icono izquierdo de la appbar sea el del drawer
        } */
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = navHostFragment.navController

        return if (navController.currentDestination?.id == R.id.home_fragment) {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                drawerLayout.openDrawer(GravityCompat.START)
            }
            true
        } else {
            navController.navigateUp() || super.onSupportNavigateUp()
        }
    }


}


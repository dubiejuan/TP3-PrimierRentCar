package ort.edu.tp3.primierrentcar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
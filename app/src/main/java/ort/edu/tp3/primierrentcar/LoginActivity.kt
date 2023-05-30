package ort.edu.tp3.primierrentcar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnLogin = findViewById<Button>(R.id.btnLogin)

        val editTextValue = findViewById<EditText>(R.id.txtLoginUserInput)


        btnLogin.setOnClickListener{
            var username = editTextValue.text.toString()

            val intent = Intent(this, MainActivity::class.java)

            intent.putExtra("username", username)
            startActivity(intent)
            finish()
        }
    }
}
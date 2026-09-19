package com.example.ymail

import android.content.Intent
import android.os.Bundle
import android.webkit.ConsoleMessage
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.registration)

        val button: Button = findViewById(R.id.button4)
        val userName: EditText = findViewById(R.id.editTextText3)

        button.setOnClickListener {
            val userName = userName.text.toString().trim()
            if(userName != "") {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("userName", userName)
                startActivity(intent)
            } else Toast.makeText(this, "Впишите своё имя", Toast.LENGTH_LONG).show()

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
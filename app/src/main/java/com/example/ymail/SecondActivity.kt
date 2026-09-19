package com.example.ymail

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val listMail: ListView = findViewById(R.id.listmail)
        val emails = mutableListOf("microsoft", "yellowhat")
        val adapter = ArrayAdapter(this, R.layout.list_item, emails)
        listMail.adapter = adapter

        listMail.setOnItemClickListener { adapterView, view, i, l ->
            val emailpos = emails[i]
            val emailData = Intent(this, email_activity::class.java)
            emailData.putExtra("emails", emailpos)
            intent.putExtra("emails", emailData)
            startActivity(emailData)
        }

        val userName = intent.getStringExtra("userName")
        val name: TextView = findViewById(R.id.textView2)
        name.text = userName
    }
}

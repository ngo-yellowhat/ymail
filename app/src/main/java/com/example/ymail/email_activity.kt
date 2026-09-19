package com.example.ymail

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class email_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_detail)
        var contentText: TextView = findViewById(R.id.contentText)
        val mail_data = intent.getStringExtra("emails")

        if(mail_data != null) {
            contentText.text = mail_data
        }

        val backButton: Button = findViewById(R.id.backButton)
        backButton.setOnClickListener {
        finish()
        }
    }
}
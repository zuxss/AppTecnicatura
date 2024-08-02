package com.example.apptecnicatura

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val button: Button = findViewById(R.id.StartButton)
        val textView = findViewById<TextView>(R.id.CreateAccountText)


        button.setOnClickListener{
            val intent = Intent(this, HomeScreenActivity::class.java)
            startActivity(intent)
        }

        textView.setOnClickListener {

            val intent = Intent(this, CreateAccouuntActivity::class.java)
            startActivity(intent)
        }

        }
    }




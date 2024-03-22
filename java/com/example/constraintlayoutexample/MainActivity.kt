package com.example.constraintlayoutexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_signin = findViewById<Button>(R.id.btn_signin)
        val btn_register = findViewById<Button>(R.id.btn_register)

        btn_register.setOnClickListener {
            val intent_signin = Intent(this, RegisterActivity::class.java)
            startActivity(intent_signin)
        }

        btn_signin.setOnClickListener {
            Toast.makeText(this, "버튼 누르기", Toast.LENGTH_SHORT).show()
        }





    }
}
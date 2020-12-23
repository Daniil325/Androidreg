package com.example.myapplicationreg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var login = "123"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var inputLogin = findViewById<EditText>(R.id.editTextTextPersonName2)
        findViewById<Button>(R.id.button).setOnClickListener(){
            if(login == inputLogin.text.toString()){
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Неправильный логин", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
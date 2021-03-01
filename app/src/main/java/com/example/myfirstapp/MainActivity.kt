package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var etEmail : EditText
    lateinit var etPassword : EditText
    lateinit var btnLogin : Button
    lateinit var txtSignUp : TextView
    lateinit var txtForgotPassword : TextView
    val validEmail = "dsc@gmail.com"
    val validPassword = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "facebook"

        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtSignUp = findViewById(R.id.txtSignUp)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)



        btnLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if((email==validEmail)&&(password==validPassword)) {
                val intent = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this@MainActivity, "incorrect login details", Toast.LENGTH_LONG).show()
            }
        }
    }
}
package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

lateinit var etTextView: EditText
lateinit var etPass:EditText
    lateinit var btnlogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        castViews()
        onClick()

    }
    fun castViews(){
        etTextView=findViewById(R.id.textView)
        etPass=findViewById(R.id.etPass)
        btnlogin=findViewById(R.id.btnLogin)
    }
    fun onClick(){
        btnlogin.setOnClickListener{


        var email=etTextView.text.toString()
        if(email.isEmpty()){
            etTextView.setError("Email required")
        }
        var password=etPass.text.toString()
        if(password.isEmpty()){
            etPass.setError("Password required")
        }
       var intent=Intent(baseContext,MainActivity1::class.java)
        startActivity(intent)
    }}
}
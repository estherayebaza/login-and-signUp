package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.*

class MainActivity1 : AppCompatActivity() {

    lateinit var etName:EditText
    lateinit var etEmail:EditText
    lateinit var etpassword: EditText
    lateinit var etUserNumber: EditText
    lateinit var spgender: Spinner
    lateinit var btnButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        onClick()
    }
    fun castView(){
        etName=findViewById(R.id.etName)
        etEmail=findViewById(R.id.etEmail)
        etpassword=findViewById(R.id.etpassword)
        etUserNumber=findViewById(R.id.etUserNumber)
        spgender=findViewById(R.id.spgender)
        btnButton=findViewById(R.id.btnButton)
        var gender= arrayListOf("select gender","Male","Female")
        var genderadaptor= ArrayAdapter(baseContext,android.R.layout.simple_spinner_dropdown_item,gender)
        genderadaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spgender.adapter =genderadaptor

    }
    fun onClick(){
        btnButton.setOnClickListener {
            var name=etName.text.toString()
        if(name.isEmpty()){
            etName.setError("Name is required")
        }

        var email=etEmail.text.toString()
        if(email.isEmpty()){
            etEmail.setError("Email required")
        }
            var gender=""
        var phone=etUserNumber.text.toString()
        if (phone.isEmpty()){
            etUserNumber.setError("Phone required")
        }
        var password=etpassword.text.toString()
        if(password.isEmpty()){
            etpassword.setError("Password required")
        }
         var login=Login(name, email, gender, password, phone)
        var intent1=Intent(baseContext,MainActivity2::class.java)
        startActivity(intent1)}

}
    data class Login(var name:String,var email:String,var gender:String,var password:String,var phone:String)
}
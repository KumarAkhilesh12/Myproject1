package com.project.myproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var etFoodMobileNumber:EditText
    lateinit var etFoodPassword:EditText
    lateinit var btnFoodLogIn:Button
    lateinit var txtFoodForgotPassword:TextView
    lateinit var txtFoodRegisterYourself:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etFoodMobileNumber=findViewById(R.id.etFoodMobNumber)
        etFoodPassword=findViewById(R.id.etFoodPassword)
        btnFoodLogIn=findViewById(R.id.btnFoodLogIn)
        txtFoodForgotPassword=findViewById(R.id.txtFoodForgotPassword)
        txtFoodRegisterYourself=findViewById(R.id.txtFoodRegisterYourself)

        txtFoodForgotPassword.setOnClickListener {
            startActivity(
                Intent(this@LoginActivity, ForgotActivity::class.java)
            )
        }
        txtFoodRegisterYourself.setOnClickListener {
            startActivity(
                Intent(this@LoginActivity, RegistrationActivity::class.java)
            )
        }
        btnFoodLogIn.setOnClickListener {
               val intent=Intent(this@LoginActivity,DashboardActivity::class.java)
                   val bundle=Bundle()
           bundle.putString("data","login")
            bundle.putString("Mobile",etFoodMobileNumber.text.toString())
            bundle.putString("Password",etFoodPassword.text.toString())
            intent.putExtra("details",bundle)
            startActivity(intent)
        }
    }
}
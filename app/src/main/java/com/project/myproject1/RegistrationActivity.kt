package com.project.myproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import androidx.appcompat.widget.Toolbar

class RegistrationActivity : AppCompatActivity() {
    lateinit var myToolbar: Toolbar
    lateinit var etName:EditText
    lateinit var etEmail:EditText
    lateinit var etMob:EditText
    lateinit var etDelivery:EditText
    lateinit var etPassword:EditText
    lateinit var etConfirmPassword:EditText
    lateinit var btnRegister:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

//        setSupportActionBar(myToolbar)
//        supportActionBar?.title="Register Yourself"
//        supportActionBar?.setHomeButtonEnabled(true)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        myToolbar=findViewById(R.id.myToolbar)

        etName=findViewById(R.id.etName)
        etEmail=findViewById(R.id.etEmail)
        etMob=findViewById(R.id.etMob)
        etDelivery=findViewById(R.id.etDelivery)
        etPassword=findViewById(R.id.etPassword)
        etConfirmPassword=findViewById(R.id.etConfirmPassword)
        btnRegister=findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener{
            val intent= Intent(this@RegistrationActivity,DashboardActivity::class.java)
            val bundle=Bundle()
            bundle.putString("data","register")
            bundle.putString("Name",etName.text.toString())
            bundle.putString("Password",etPassword.text.toString())
            bundle.putString("Mob",etMob.text.toString())
            bundle.putString("Password",etPassword.text.toString())
            bundle.putString("Email",etEmail.text.toString())
            bundle.putString("Delivery",etDelivery.text.toString())
            intent.putExtra("details",bundle)
            startActivity(intent)
        }

    }

//    override fun onNavigateUp(): Boolean {
//        onBackPressed()
//        return true
//    }

}
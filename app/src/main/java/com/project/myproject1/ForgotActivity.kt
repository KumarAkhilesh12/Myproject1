package com.project.myproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.project.myproject1.R.id.btnNext

class ForgotActivity : AppCompatActivity() {
    lateinit var etForgotMob:EditText
    lateinit var etForgotEmail:EditText
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)
        etForgotMob=findViewById(R.id.etForgotMob)
        etForgotEmail=findViewById(R.id.etForgotEmail)
       btnNext=findViewById(R.id.btnNext)
       btnNext.setOnClickListener {
           val intent= Intent(this@ForgotActivity,DashboardActivity::class.java)
           val bundle=Bundle()
           bundle.putString("data","forgot")
           bundle.putString("Mobile",etForgotMob.text.toString())
           bundle.putString("Email",etForgotEmail.text.toString())
           intent.putExtra("details",bundle)
           startActivity(intent)
       }
    }
}
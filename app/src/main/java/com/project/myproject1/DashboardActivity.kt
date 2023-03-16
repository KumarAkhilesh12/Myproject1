package com.project.myproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {
    lateinit var txtBlank:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        txtBlank=findViewById(R.id.txtBlank)
        if (intent!=null){
            val details=intent.getBundleExtra("details")
            val data=details?.getString("data")
            if (data == "login") {
                /*Creating the text to be displayed*/
                var text="Mobile Number : ${details.getString("Mobile")} \n " +
                        "Password : ${details.getString("Password")}"
                txtBlank.text = text
                println(txtBlank.text)

            }

            if (data == "register") {
                val text = " Name : ${details.getString("Name")} \n " +
                        "Mobile Number : ${details.getString("Mob")} \n " +
                        "Password : ${details.getString("Password")} \n " +
                        "Address: ${details.getString("Delivery")}"
                txtBlank.text = text
                println(txtBlank.text)
            }

            if (data == "forgot") {
                val text = "Mobile Number : ${details.getString("mobile")} \n " +
                        "Email : ${details.getString("email")}"
                txtBlank.text = text
            }

        }
        else{
            txtBlank.text="No data received"
        }
    }

}
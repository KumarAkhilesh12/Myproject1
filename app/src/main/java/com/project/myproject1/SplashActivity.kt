package com.project.myproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val intent= Intent(this@SplashActivity,LoginActivity::class.java)
        Handler().postDelayed({
            startActivity(intent)
            finish()
        },2000)
    }

}
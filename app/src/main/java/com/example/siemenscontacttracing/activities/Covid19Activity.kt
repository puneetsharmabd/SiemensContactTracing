package com.example.siemenscontacttracing.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.siemenscontacttracing.R

class Covid19Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid19)
        val intent = Intent(this, NextGetStartedActivity::class.java)
        startActivity(intent)
    }
}

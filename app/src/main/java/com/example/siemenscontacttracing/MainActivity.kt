package com.example.siemenscontacttracing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.siemenscontacttracing.activities.Covid19Activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //this is what I am going to do after marriage
    }

    fun getStartedClicked(view: View) {
        val intent = Intent(this, Covid19Activity::class.java)
        startActivity(intent)
    }
}

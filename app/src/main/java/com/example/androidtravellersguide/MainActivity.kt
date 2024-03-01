package com.example.androidtravellersguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    var currentImage = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var next = findViewById<ImageButton>(R.id.btnNext)
        var prev = findViewById<ImageButton>(R.id.btnPrev)

        next.setOnClickListener{
            // Next Image is scrolled to view
            var idCurrentImageString = "duck$currentImage"

            // Get integer address associated with each view

        }

        prev.setOnClickListener{
            // Prev image is scrolled to view

        }

    }
}
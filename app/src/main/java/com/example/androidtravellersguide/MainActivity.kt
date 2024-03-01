package com.example.androidtravellersguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private var currentImage = 0
    lateinit var image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var next = findViewById<ImageButton>(R.id.btnNext)
        var prev = findViewById<ImageButton>(R.id.btnPrev)

        next.setOnClickListener{
            // Next Image is scrolled to view
            var idCurrentImageString = "silt$currentImage"

            // Get integer address associated with each view
            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)

            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (5+currentImage+1)%5
            var idImageToShowString = "silt"+currentImage
            var idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)

            image = findViewById(idImageToShowInt)
            image.alpha = 1f
        }

        prev.setOnClickListener{
            // Prev image is scrolled to view

            var idCurrentImageString = "silt$currentImage"

            // Get integer address associated with each view
            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)

            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (5+currentImage-1)%5
            var idImageToShowString = "silt"+currentImage
            var idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)

            image = findViewById(idImageToShowInt)
            image.alpha = 1f
        }
    }
}
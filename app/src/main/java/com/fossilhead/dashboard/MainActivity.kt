package com.fossilhead.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

   private lateinit var cardview: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardview = findViewById(R.id.cardClothing)

        cardview.setOnClickListener() {
            val intent = Intent(this, ClothingActivity::class.java)
            startActivity(intent)
        }
    }
}
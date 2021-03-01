package com.example.miwokiewoki

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers = findViewById(R.id.numbers) as TextView
        numbers.setOnClickListener { // Create a new intent to open the {@link NumbersActivity}
            val numbersIntent = Intent(this, NumbersActivity::class.java)
            startActivity(numbersIntent)
        }

        val family = findViewById(R.id.family) as TextView
        family.setOnClickListener { // Create a new intent to open the {@link FamilyActivity}
            val familyIntent = Intent(this@MainActivity, FamilyActivity::class.java)
            startActivity(familyIntent)
        }

        val colors = findViewById(R.id.colors) as TextView
        colors.setOnClickListener { // Create a new intent to open the {@link ColorsActivity}
            val colorsIntent = Intent(this@MainActivity, ColorsActivity::class.java)
            startActivity(colorsIntent)
        }

        val phrases = findViewById(R.id.phrases) as TextView
        phrases.setOnClickListener { // Create a new intent to open the {@link PhrasesActivity}
            val phrasesIntent = Intent(this@MainActivity, PhrasesActivity::class.java)
            startActivity(phrasesIntent)
        }
    }
}
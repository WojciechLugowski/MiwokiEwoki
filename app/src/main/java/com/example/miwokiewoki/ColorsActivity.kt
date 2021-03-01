package com.example.miwokiewoki

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ColorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        val words = ArrayList<Word>()
        words.add(Word("czerwony", "weṭeṭṭi", R.drawable.color_red))
        words.add(Word("zielony", "chokokki", R.drawable.color_green))
        words.add(Word("brązowy", "ṭakaakki", R.drawable.color_brown))
        words.add(Word("szary", "ṭopoppi", R.drawable.color_gray))
        words.add(Word("czarny", "kululli", R.drawable.color_black))
        words.add(Word("biały", "kelelli", R.drawable.color_white))
        words.add(Word("zakurzony żółty", "ṭopiisә", R.drawable.color_dusty_yellow))
        words.add(Word("musztardowy", "chiwiiṭә", R.drawable.color_mustard_yellow))

        val listView : ListView = findViewById(R.id.wordList)
        val itemsAdapter = WordAdapter(this, words, getColor(R.color.category_colors))
        listView.setAdapter(itemsAdapter)
    }
}
package com.example.miwokiewoki

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class NumbersActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        val words = ArrayList<Word>()
        words.add(Word("jeden", "tutti", R.drawable.number_one))
        words.add(Word("dwa", "otiiko",R.drawable.number_two))
        words.add(Word("trzy", "tolookosu", R.drawable.number_three))
        words.add(Word("cztery", "oyyisa", R.drawable.number_four))
        words.add(Word("pięć", "massokka", R.drawable.number_five))
        words.add(Word("sześć", "temmokka", R.drawable.number_six))
        words.add(Word("siedem", "kenkaku", R.drawable.number_seven))
        words.add(Word("osiem", "kawinta", R.drawable.number_eight))
        words.add(Word("dziewieć", "wo'e", R.drawable.number_nine))
        words.add(Word("dziesieć", "na'aacha", R.drawable.number_ten))

        val listView : ListView = findViewById(R.id.wordList)
        val itemsAdapter = WordAdapter(this, words, getColor(R.color.category_numbers))
        listView.setAdapter(itemsAdapter)
    }
}
package com.example.miwokiewoki

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class FamilyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        val words = ArrayList<Word>()
        words.add(Word("tata", "әpә", R.drawable.family_father))
        words.add(Word("mama", "әṭa", R.drawable.family_mother))
        words.add(Word("syn", "angsi", R.drawable.family_son))
        words.add(Word("córka", "tune", R.drawable.family_daughter))
        words.add(Word("starszy brat", "taachi", R.drawable.family_older_brother))
        words.add(Word("młodszy brat", "chalitti", R.drawable.family_younger_brother))
        words.add(Word("starsza siostra", "teṭe", R.drawable.family_older_sister))
        words.add(Word("młodsza siostra", "kolliti", R.drawable.family_younger_sister))
        words.add(Word("babcia", "ama", R.drawable.family_grandmother))
        words.add(Word("dziadek", "paapa", R.drawable.family_grandfather))

        val listView : ListView = findViewById(R.id.wordList)
        val itemsAdapter = WordAdapter(this, words, getColor(R.color.category_family))
        listView.setAdapter(itemsAdapter)
    }
}
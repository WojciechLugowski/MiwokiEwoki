package com.example.miwokiewoki

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class PhrasesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        val words = ArrayList<Word>()
        words.add(Word("gdzie idziesz?", "minto wuksus"))
        words.add(Word("jak się nazywasz?", "tinnә oyaase'nә"))
        words.add(Word("nazywam się...", "oyaaset..."))
        words.add(Word("jak się czujesz?", "michәksәs?"))
        words.add(Word("czuję się dobrze.", "kuchi achit"))
        words.add(Word("idziesz?", "әәnәs'aa?"))
        words.add(Word("tak, idę", "әәnәm"))
        words.add(Word("chodźmy!", "yoowutis"))
        words.add(Word("chodź tu", "әnni'nem"))

        val listView : ListView = findViewById(R.id.wordList)
        val itemsAdapter = WordAdapter(this, words, getColor(R.color.category_phrases))
        listView.setAdapter(itemsAdapter)
    }
}
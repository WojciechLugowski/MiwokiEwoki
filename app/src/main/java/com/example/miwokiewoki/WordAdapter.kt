package com.example.miwokiewoki

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class WordAdapter(context: Context, wordList : ArrayList<Word>, val backgroundColor: Int) : ArrayAdapter<Word> (context,0,wordList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listViewItem = convertView
        if(convertView==null){
            listViewItem = LayoutInflater.from(context).inflate(R.layout.list_item, parent,false)
        }
        val currentWord = getItem(position)

        val miwokTranslation : TextView = listViewItem!!.findViewById(R.id.list_item_view_1)
        miwokTranslation.setText(currentWord?.getMiwokWord())

        val defaultTranslation : TextView = listViewItem.findViewById(R.id.list_item_view_2)
        defaultTranslation.setText(currentWord?.getDefaultTranslation())

        val iconImageView : ImageView = listViewItem.findViewById(R.id.list_item_image)
        if(currentWord?.getImageResourceId()!=null) {
            iconImageView.setImageResource(currentWord.getImageResourceId()!!)
        } else{
            iconImageView.setVisibility(View.GONE)
        }

        val linearBackgroundViews : LinearLayout = listViewItem.findViewById(R.id.list_layout_textviews)
        linearBackgroundViews.setBackgroundColor(backgroundColor)
        return listViewItem
    }
}
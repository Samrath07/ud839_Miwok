package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBackground_color;


    private static final String LOG_TAG = WordAdapter.class.getSimpleName();


    WordAdapter(Activity context, ArrayList<Word> words,int background_color_id) {


        super(context,0,words);

        mBackground_color = background_color_id;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listViewItem = convertView;

        if (listViewItem == null) {

            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = listViewItem.findViewById(R.id.miwokWord);

        assert currentWord != null;
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = listViewItem.findViewById(R.id.englishWord);

        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = listViewItem.findViewById(R.id.image);

        if(currentWord.hasImage()){

            imageView.setImageResource(currentWord.getImageResourceId());

            imageView.setVisibility(View.VISIBLE);
        }
        else{

            imageView.setVisibility(View.GONE);
        }


        View textcontainer = listViewItem.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(),mBackground_color);


        textcontainer.setBackgroundColor(color);

        return listViewItem;


    }
}



package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    private static final String LOG_TAG = WordAdapter.class.getSimpleName();


    WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listViewItem = convertView;

        if (listViewItem == null) {

            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWordFlavor = getItem(position);

        TextView miwokTextView = listViewItem.findViewById(R.id.miwokWord);

        assert currentWordFlavor != null;
        miwokTextView.setText(currentWordFlavor.getMiwokTranslation());

        TextView defaultTextView = listViewItem.findViewById(R.id.englishWord);

        defaultTextView.setText(currentWordFlavor.getDefaultTranslation());

        return listViewItem;


    }
}



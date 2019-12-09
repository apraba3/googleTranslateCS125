package com.example.googletranslatecs125;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TranslateAdapter extends ArrayAdapter<Translations> {

    public TranslateAdapter(Activity context, ArrayList<Translations> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.text_item,
                    parent, false);
        }

        Translations currentWord = getItem(position);

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.englishView);
        TextView translationTextView = (TextView) listItemView.findViewById(R.id.translateView);

        englishTextView.setText(currentWord.getEnglish());
        translationTextView.setText(currentWord.getTranslation());

        return listItemView;
    }
}

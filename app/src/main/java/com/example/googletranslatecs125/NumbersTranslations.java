package com.example.googletranslatecs125;


import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersTranslations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_text);

        //ArrayList containing the phrases that will be displayed to the user
        ArrayList<Translations> numbers = new ArrayList<Translations>();
        numbers.add(new Translations("Zero", "Cero", R.mipmap.ic_launcher));
        numbers.add(new Translations("One", "Uno", R.mipmap.ic_launcher));
        numbers.add(new Translations("Two", "Dos", R.mipmap.ic_launcher));
        numbers.add(new Translations("Thre", "Tres", R.mipmap.ic_launcher));
        numbers.add(new Translations("Four", "Cuatro", R.mipmap.ic_launcher));
        numbers.add(new Translations("Five", "Cinco", R.mipmap.ic_launcher));
        numbers.add(new Translations("Six", "Seis", R.mipmap.ic_launcher));
        numbers.add(new Translations("Seven", "Siete", R.mipmap.ic_launcher));
        numbers.add(new Translations("Eight", "Ocho", R.mipmap.ic_launcher));
        numbers.add(new Translations("Nine", "Nueve", R.mipmap.ic_launcher));
        numbers.add(new Translations("Ten", "Diez", R.mipmap.ic_launcher));
        numbers.add(new Translations("Eleven", "Once", R.mipmap.ic_launcher));
        numbers.add(new Translations("Twelve", "Doce", R.mipmap.ic_launcher));
        numbers.add(new Translations("Thirteen", "Trece", R.mipmap.ic_launcher));
        numbers.add(new Translations("Fourteen", "Catorce", R.mipmap.ic_launcher));
        numbers.add(new Translations("Fifteen", "Quince", R.mipmap.ic_launcher));
        numbers.add(new Translations("Sixteen", "Dieciséis", R.mipmap.ic_launcher));
        numbers.add(new Translations("Seventeen", "Diecisiete", R.mipmap.ic_launcher));
        numbers.add(new Translations("Eighteen", "Dieciocho", R.mipmap.ic_launcher));
        numbers.add(new Translations("Nineteen", "Diecinueve", R.mipmap.ic_launcher));
        numbers.add(new Translations("Twenty", "Veinte", R.mipmap.ic_launcher));

        //Custom Array Adapter to hold Word ArrayList
        TranslateAdapter itemsAdapter = new TranslateAdapter(this, numbers);

        ListView listView = (ListView) findViewById(R.id.wordText);

        listView.setAdapter(itemsAdapter);

        //Back button to take you back one screen
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}


package com.example.googletranslatecs125;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorsTranslations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_text);

        //ArrayList containing the phrases that will be displayed to the user
        ArrayList<Translations> colors = new ArrayList<Translations>();
        colors.add(new Translations("Red", "Rojo", R.mipmap.ic_launcher));
        colors.add(new Translations("Orange", "Anaranjado", R.mipmap.ic_launcher));
        colors.add(new Translations("Yellow", "Amrillo", R.mipmap.ic_launcher));
        colors.add(new Translations("Green", "Verde", R.mipmap.ic_launcher));
        colors.add(new Translations("Blue", "Azul", R.mipmap.ic_launcher));
        colors.add(new Translations("Purple", "Morado", R.mipmap.ic_launcher));
        colors.add(new Translations("Pink", "Rosado", R.mipmap.ic_launcher));
        colors.add(new Translations("Brown", "Marrón", R.mipmap.ic_launcher));
        colors.add(new Translations("Black", "Negro", R.mipmap.ic_launcher));
        colors.add(new Translations("White", "Blanco", R.mipmap.ic_launcher));

        //Custom Array Adapter to hold Word ArrayList
        TranslateAdapter itemsAdapter = new TranslateAdapter(this, colors);

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

package com.example.googletranslatecs125;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FoodTranslations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_text);

        //ArrayList containing the phrases that will be displayed to the user
        ArrayList<Translations> foods = new ArrayList<Translations>();
        foods.add(new Translations("Bell Pepper", "Chile pimiento", R.mipmap.ic_launcher));
        foods.add(new Translations("Onion", "Cebolla", R.mipmap.ic_launcher));
        foods.add(new Translations("Spinach", "Espinaca", R.mipmap.ic_launcher));
        foods.add(new Translations("Beef", "Carne de res", R.mipmap.ic_launcher));
        foods.add(new Translations("Lamb", "Cordero", R.mipmap.ic_launcher));
        foods.add(new Translations("Chicken", "Pollo", R.mipmap.ic_launcher));
        foods.add(new Translations("Lettuce", "Lechuga", R.mipmap.ic_launcher));
        foods.add(new Translations("Tomato", "Tomate", R.mipmap.ic_launcher));
        foods.add(new Translations("Pickles", "Pepinillos", R.mipmap.ic_launcher));
        foods.add(new Translations("Beans", "Frijoles", R.mipmap.ic_launcher));

        //Custom Array Adapter to hold Word ArrayList
        TranslateAdapter itemsList = new TranslateAdapter(this, foods);

        ListView listView = (ListView) findViewById(R.id.wordText);

        listView.setAdapter(itemsList);

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

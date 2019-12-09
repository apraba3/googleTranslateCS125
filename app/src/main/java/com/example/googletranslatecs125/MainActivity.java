package com.example.googletranslatecs125;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //

        TextView numbersTextView = (TextView) findViewById(R.id.number);

        numbersTextView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersTranslations.class);
                startActivity(numbersIntent);

                Toast.makeText(MainActivity.this, getString(R.string.numbersToast),
                        Toast.LENGTH_SHORT).show();
            }
        });
        //
        TextView colorsTextView = (TextView) findViewById(R.id.color);

        colorsTextView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsTranslations.class);
                startActivity(colorsIntent);

                //Toast.makeText(MainActivity.this, getString(colorsToast),
                  //      Toast.LENGTH_SHORT).show();
            }
        });
        //
        TextView foodTextView = (TextView) findViewById(R.id.food);

        foodTextView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, FoodTranslations.class);
                startActivity(foodIntent);

                Toast.makeText(MainActivity.this, getString(R.string.foodToast),
                        Toast.LENGTH_SHORT).show();
            }
        });
        //
        TextView googleTextView = (TextView) findViewById(R.id.googleTranslate);

        googleTextView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent googleIntent = new Intent(MainActivity.this, GoogleTranslate.class);
                startActivity(googleIntent);

                Toast.makeText(MainActivity.this, getString(R.string.googleToast),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}


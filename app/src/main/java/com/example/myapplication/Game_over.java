package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Game_over extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        Intent i = getIntent();

        double skor = i.getDoubleExtra("Skor",0.0);


        TextView tv = (TextView) findViewById(R.id.skorlar);

        tv.setText("Skorunuz: "+ (int)skor);
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Game_overmulti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_overmulti);

        Intent i = getIntent();

        int skor = i.getIntExtra("Skor",0);
        double skor2 = i.getDoubleExtra("Skor2",0.0);


        TextView tv = (TextView) findViewById(R.id.Kazanan);

        tv.setText("Kazanan: Oyuncu"+ skor+"\n"+"Skor:"+(int)skor2);




    }
}
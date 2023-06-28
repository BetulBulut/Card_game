package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class girisyap_kaydol extends AppCompatActivity {

    private Button kaydol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girisyap_kaydol);
        kaydol=(Button)findViewById(R.id.kaydol);
        kaydol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kayıtol=new Intent(girisyap_kaydol.this, Kayit_Ol.class);
                startActivity(kayıtol);
            }
        });
    }

    public void  girisYap(View v)
    {
        Intent girisyap=new Intent(girisyap_kaydol.this,Giris_Yap.class);
        startActivity(girisyap);

    }
    //public void kayitOl(View v)
    //{
      //  Intent kayıtol=new Intent(girisyap_kaydol.this, Kayit_Ol.class);
        //startActivity(kayıtol);
    //}
}
package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

import androidx.appcompat.widget.AppCompatDrawableManager;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;






public class Kart extends androidx.appcompat.widget.AppCompatImageButton {

    boolean kilitle = false;
    boolean acikmi = false;
    Bitmap decodedimage;
    int ev_katsayisi;
    String ev;


    Bitmap arkaplanID;
    int onplanID;
    String isim;
    int puan;


    public Kart(Context context,int id) {
        super(context);


        setId(id);

        setImageResource(R.drawable.hp);


    }

    public void cevir(){

        if(!kilitle) {
            if (!acikmi) {



               setImageBitmap(decodedimage);


                acikmi = true;
            } else {
                setImageResource(R.drawable.hp);
                acikmi = false;
            }
        }

    }







}

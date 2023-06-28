package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;


import java.util.HashMap;

public class SifreGuncelle extends AppCompatActivity {
    private EditText editSifre;
    private String txtsifre;
    private FirebaseAuth mAuth;
    private FirebaseFirestore mFirestore;
    private HashMap<String,Object> mData;
    private FirebaseUser mUser;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifre_guncelle);
        editSifre=(EditText) findViewById(R.id.edit_guncelle_sifre);
        mAuth= FirebaseAuth.getInstance();
        mFirestore=FirebaseFirestore.getInstance();
    }

    public void guncelle(View v)
    {

        txtsifre=editSifre.getText().toString();
        if(!TextUtils.isEmpty(txtsifre))
        {
            //System.out.println(mUser=mAuth.getCurrentUser());
            mUser=mAuth.getCurrentUser();
            mData=new HashMap<>();
            mData.put("kullaniciSifre",txtsifre);

            mUser.updatePassword(txtsifre);

            //mAuth.updateCurrentUser(mData);
            mFirestore.collection("Kullanicilar").document(mUser.getUid()).update(mData).addOnCompleteListener(this, new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {

                    if(task.isSuccessful())
                    {
                        Toast.makeText(SifreGuncelle.this, "Veri başarıyla güncellendi!", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(SifreGuncelle.this,Single_MultiPlayer.class);
                        startActivity(intent);
                    }
                }
            });

        }
        else
            Toast.makeText(this,"Güncellenecek değer boş olamaz",Toast.LENGTH_SHORT).show();

    }
   /* public void sifreguncelle(HashMap<String,Object> hashMap,final String uid)
    {
        mFirestore.collection("Kullanicilar").document(uid).update(hashMap).addOnCompleteListener(this, new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {

                if(task.isSuccessful())
                {
                    Toast.makeText(SifreGuncelle.this, "Veri başarıyla güncellendi!", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(SifreGuncelle.this,Single_MultiPlayer.class);
                    startActivity(intent);
                }
            }
        });

    }*/
}
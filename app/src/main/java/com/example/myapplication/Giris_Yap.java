package com.example.myapplication;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class Giris_Yap extends AppCompatActivity {

    private EditText editKullaniciAdi, editSifre;
    private String txtSifre,txtUsername;
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    private FirebaseFirestore mFirestore;
    private Task<QuerySnapshot> query;
    private QueryDocumentSnapshot document;
    private String Email;
    private MediaPlayerService mPlayerService;
    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            mPlayerService = ((MediaPlayerService.LocalBinder)service).getService();

        }

        public void onServiceDisconnected(ComponentName className) {

            mPlayerService = null;

        }
    };



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_yap);
        editKullaniciAdi = (EditText) findViewById(R.id.giris_yap_kullaniciadi);
        editSifre = (EditText) findViewById(R.id.giris_yap_sifre);
        mAuth = FirebaseAuth.getInstance();
        mFirestore=FirebaseFirestore.getInstance();
        Intent music = new Intent();
        music.setClass(Giris_Yap.this,MediaPlayerService.class);
        bindService(music, mConnection, Context.BIND_AUTO_CREATE);

    }

    public void girisYap(View v) {


        txtUsername = editKullaniciAdi.getText().toString();

        query = mFirestore.collection("Kullanicilar").whereEqualTo("kullaniciAdi", txtUsername).get();
        query.addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {

            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()) {
                    for (QueryDocumentSnapshot document : task.getResult()) {
                        Email = document.getData().get("kullaniciEmail").toString();
                        System.out.println(document.getData().get("kullaniciEmail").toString());


                    }
                } else {
                    Log.d(TAG, "Error getting documents: ", task.getException());
                }
            }
        });
        new Handler().postDelayed(new Runnable() {
            public void run() {
                login();
            }
        }, 5000);
        //deneme();
    }


    public void login()
    {
        txtSifre = editSifre.getText().toString();
        System.out.println(txtSifre);
        if (!TextUtils.isEmpty(Email) && !TextUtils.isEmpty(txtSifre)) {
            mAuth.signInWithEmailAndPassword(Email, txtSifre)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(Giris_Yap.this, "Giriş işlemi başarılı!", Toast.LENGTH_SHORT).show();
                                Intent girisYap = new Intent(Giris_Yap.this, Single_MultiPlayer.class);
                                startActivity(girisYap);
                                mPlayerService.onStart();

                            } else {
                                Toast.makeText(Giris_Yap.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                            }
                        }
                    });

        }
        else
        {
            Toast.makeText(this,"Kullanıcı veya Şifre Boş vaya hatalı!",Toast.LENGTH_SHORT).show();
        }

    }

}




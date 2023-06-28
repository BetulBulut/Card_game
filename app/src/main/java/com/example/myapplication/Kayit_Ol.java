package com.example.myapplication;

import static android.content.ContentValues.TAG;
import static com.example.myapplication.R.id.kayit_ol_isim;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;

public class Kayit_Ol extends AppCompatActivity {

    private EditText editMail,editSifre,editIsim;
    private String txtEmail,txtSifre,txtIsim;
    private FirebaseAuth mAuth;
    private HashMap<String,Object> mData;
    private FirebaseFirestore mFirestore;
    private FirebaseUser mUser;
    private String Email;
    private Task<QuerySnapshot> query;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editMail=(EditText) findViewById(R.id.kayit_ol_email);
        editSifre=(EditText) findViewById(R.id.kayit_ol_sifre);
        editIsim=(EditText) findViewById(R.id.kayit_ol_isim);
        mAuth= FirebaseAuth.getInstance();
        mFirestore=FirebaseFirestore.getInstance();
    }
    public void kayitOl(View v) {
        txtEmail = editMail.getText().toString();
        txtSifre = editSifre.getText().toString();
        txtIsim = editIsim.getText().toString();
        query = mFirestore.collection("Kullanicilar").whereEqualTo("kullaniciAdi", txtIsim).get();
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
                if(Email.length()==0)
                {
                    createUser();
                }
                else
                {
                    Toast.makeText(Kayit_Ol.this,"Bu kullanıcı adı alınmiş!",Toast.LENGTH_SHORT).show();
                    Email="";
                }

            }
        }, 5000);
        //deneme();

    }

    public void createUser()
    {
        if(!TextUtils.isEmpty(txtEmail) && !TextUtils.isEmpty(txtSifre))
        {
            mAuth.createUserWithEmailAndPassword(txtEmail,txtSifre)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                            {
                                mUser=mAuth.getCurrentUser();

                                mData=new HashMap<>();
                                mData.put("kullaniciAdi",txtIsim);
                                mData.put("kullaniciEmail",txtEmail);
                                mData.put("kullaniciSifre",txtSifre);

                                mFirestore.collection("Kullanicilar").document(mUser.getUid()).set(mData);
                                Toast.makeText(Kayit_Ol.this,"Kayıt işlemi başarılı!",Toast.LENGTH_SHORT).show();
                                Intent girisYap=new Intent(Kayit_Ol.this,Giris_Yap.class);
                                startActivity(girisYap);

                            }
                            else
                            {
                                Toast.makeText(Kayit_Ol.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();

                            }
                        }
                    });
        }
        else
        {
            Toast.makeText(this,"Email ve Şifre Boş Olamaz!",Toast.LENGTH_SHORT).show();
        }
    }


}

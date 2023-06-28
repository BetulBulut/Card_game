package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;

public class data_load extends AppCompatActivity {

    private FirebaseFirestore mFirestore;
    private HashMap<String,Object> mData;
    private DocumentReference documentReference;
    private ImageView image;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //image =(ImageView)findViewById(R.id.image);

        mFirestore=FirebaseFirestore.getInstance();


    }

    public void GryffindoreYukle(View v){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.g1);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] imageBytes = byteArrayOutputStream.toByteArray();
        String imageString = Base64.encodeToString(imageBytes, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Albus Dumbledore");
        mData.put("kart_puani",20);
        mData.put("kart_resim_base64",imageString);
        mFirestore.collection("Gryffindore").document("1").set(mData);



        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.g2);
        bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
        byte[] imageBytes2 = byteArrayOutputStream2.toByteArray();
        String imageString2 = Base64.encodeToString(imageBytes2, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Arthur Weasley");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString2);
        mFirestore.collection("Gryffindore").document("2").set(mData);




        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.g3);
        bitmap3.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream3);
        byte[] imageBytes3 = byteArrayOutputStream3.toByteArray();
        String imageString3 = Base64.encodeToString(imageBytes3, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Harry Potter");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString3);
        mFirestore.collection("Gryffindore").document("3").set(mData);




        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(), R.drawable.g4);
        bitmap4.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream4);
        byte[] imageBytes4 = byteArrayOutputStream4.toByteArray();
        String imageString4 = Base64.encodeToString(imageBytes4, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Hermione Granger");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString4);
        mFirestore.collection("Gryffindore").document("4").set(mData);





        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
        Bitmap bitmap5 = BitmapFactory.decodeResource(getResources(), R.drawable.g5);
        bitmap5.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream5);
        byte[] imageBytes5 = byteArrayOutputStream5.toByteArray();
        String imageString5 = Base64.encodeToString(imageBytes5, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Lily Potter");
        mData.put("kart_puani",12);
        mData.put("kart_resim_base64",imageString5);
        mFirestore.collection("Gryffindore").document("5").set(mData);





        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
        Bitmap bitmap6 = BitmapFactory.decodeResource(getResources(), R.drawable.g6);
        bitmap6.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream6);
        byte[] imageBytes6 = byteArrayOutputStream6.toByteArray();
        String imageString6 = Base64.encodeToString(imageBytes6, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Minevra McGonagall");
        mData.put("kart_puani",13);
        mData.put("kart_resim_base64",imageString6);
        mFirestore.collection("Gryffindore").document("6").set(mData);




        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
        Bitmap bitmap7 = BitmapFactory.decodeResource(getResources(), R.drawable.g7);
        bitmap7.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream7);
        byte[] imageBytes7 = byteArrayOutputStream7.toByteArray();
        String imageString7 = Base64.encodeToString(imageBytes7, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Peter Pettigrew");
        mData.put("kart_puani",5);
        mData.put("kart_resim_base64",imageString7);
        mFirestore.collection("Gryffindore").document("7").set(mData);




        ByteArrayOutputStream byteArrayOutputStream8 = new ByteArrayOutputStream();
        Bitmap bitmap8 = BitmapFactory.decodeResource(getResources(), R.drawable.g8);
        bitmap8.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream8);
        byte[] imageBytes8 = byteArrayOutputStream8.toByteArray();
        String imageString8 = Base64.encodeToString(imageBytes8, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Remus Lupin");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString8);
        mFirestore.collection("Gryffindore").document("8").set(mData);




        ByteArrayOutputStream byteArrayOutputStream9 = new ByteArrayOutputStream();
        Bitmap bitmap9 = BitmapFactory.decodeResource(getResources(), R.drawable.g9);
        bitmap9.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream9);
        byte[] imageBytes9 = byteArrayOutputStream9.toByteArray();
        String imageString9 = Base64.encodeToString(imageBytes9, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Ron Weasley");
        mData.put("kart_puani",8);
        mData.put("kart_resim_base64",imageString9);
        mFirestore.collection("Gryffindore").document("9").set(mData);




        ByteArrayOutputStream byteArrayOutputStream10 = new ByteArrayOutputStream();
        Bitmap bitmap10 = BitmapFactory.decodeResource(getResources(), R.drawable.g10);
        bitmap10.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream10);
        byte[] imageBytes10 = byteArrayOutputStream10.toByteArray();
        String imageString10 = Base64.encodeToString(imageBytes10, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Rubeus Hagrid");
        mData.put("kart_puani",12);
        mData.put("kart_resim_base64",imageString10);
        mFirestore.collection("Gryffindore").document("10").set(mData);




        ByteArrayOutputStream byteArrayOutputStream11 = new ByteArrayOutputStream();
        Bitmap bitmap11 = BitmapFactory.decodeResource(getResources(), R.drawable.g11);
        bitmap11.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream11);
        byte[] imageBytes11 = byteArrayOutputStream11.toByteArray();
        String imageString11 = Base64.encodeToString(imageBytes11, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Sirius Black");
        mData.put("kart_puani",18);
        mData.put("kart_resim_base64",imageString11);
        mFirestore.collection("Gryffindore").document("11").set(mData)
                .addOnCompleteListener(data_load.this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(data_load.this,"başarılı",Toast.LENGTH_SHORT).show();
                        }
                        else
                            Toast.makeText(data_load.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();


                    }
                });


    }
    public void SlytherinYukle(View v)
    {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.s1);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] imageBytes = byteArrayOutputStream.toByteArray();
        String imageString = Base64.encodeToString(imageBytes, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Andromeda Tonks");
        mData.put("kart_puani",16);
        mData.put("kart_resim_base64",imageString);
        mFirestore.collection("Slytherin").document("1").set(mData);



        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.s2);
        bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
        byte[] imageBytes2 = byteArrayOutputStream2.toByteArray();
        String imageString2 = Base64.encodeToString(imageBytes2, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Bellatrix Lestrange");
        mData.put("kart_puani",13);
        mData.put("kart_resim_base64",imageString2);
        mFirestore.collection("Slytherin").document("2").set(mData);




        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.s3);
        bitmap3.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream3);
        byte[] imageBytes3 = byteArrayOutputStream3.toByteArray();
        String imageString3 = Base64.encodeToString(imageBytes3, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Dolores Umbridge");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString3);
        mFirestore.collection("Slytherin").document("3").set(mData);




        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(), R.drawable.s4);
        bitmap4.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream4);
        byte[] imageBytes4 = byteArrayOutputStream4.toByteArray();
        String imageString4 = Base64.encodeToString(imageBytes4, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Draco Malfoy");
        mData.put("kart_puani",5);
        mData.put("kart_resim_base64",imageString4);
        mFirestore.collection("Slytherin").document("4").set(mData);





        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
        Bitmap bitmap5 = BitmapFactory.decodeResource(getResources(), R.drawable.s5);
        bitmap5.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream5);
        byte[] imageBytes5 = byteArrayOutputStream5.toByteArray();
        String imageString5 = Base64.encodeToString(imageBytes5, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Evan Rosier");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString5);
        mFirestore.collection("Slytherin").document("5").set(mData);





        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
        Bitmap bitmap6 = BitmapFactory.decodeResource(getResources(), R.drawable.s6);
        bitmap6.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream6);
        byte[] imageBytes6 = byteArrayOutputStream6.toByteArray();
        String imageString6 = Base64.encodeToString(imageBytes6, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Horace Slughorn");
        mData.put("kart_puani",12);
        mData.put("kart_resim_base64",imageString6);
        mFirestore.collection("Slytherin").document("6").set(mData);




        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
        Bitmap bitmap7 = BitmapFactory.decodeResource(getResources(), R.drawable.s7);
        bitmap7.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream7);
        byte[] imageBytes7 = byteArrayOutputStream7.toByteArray();
        String imageString7 = Base64.encodeToString(imageBytes7, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Leta Lestrange");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString7);
        mFirestore.collection("Slytherin").document("7").set(mData);




        ByteArrayOutputStream byteArrayOutputStream8 = new ByteArrayOutputStream();
        Bitmap bitmap8 = BitmapFactory.decodeResource(getResources(), R.drawable.s8);
        bitmap8.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream8);
        byte[] imageBytes8 = byteArrayOutputStream8.toByteArray();
        String imageString8 = Base64.encodeToString(imageBytes8, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Lucius Malfoy");
        mData.put("kart_puani",12);
        mData.put("kart_resim_base64",imageString8);
        mFirestore.collection("Slytherin").document("8").set(mData);




        ByteArrayOutputStream byteArrayOutputStream9 = new ByteArrayOutputStream();
        Bitmap bitmap9 = BitmapFactory.decodeResource(getResources(), R.drawable.s9);
        bitmap9.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream9);
        byte[] imageBytes9 = byteArrayOutputStream9.toByteArray();
        String imageString9 = Base64.encodeToString(imageBytes9, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Narcissa Malfoy");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString9);
        mFirestore.collection("Slytherin").document("9").set(mData);




        ByteArrayOutputStream byteArrayOutputStream10 = new ByteArrayOutputStream();
        Bitmap bitmap10 = BitmapFactory.decodeResource(getResources(), R.drawable.s10);
        bitmap10.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream10);
        byte[] imageBytes10 = byteArrayOutputStream10.toByteArray();
        String imageString10 = Base64.encodeToString(imageBytes10, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Severus Snape");
        mData.put("kart_puani",18);
        mData.put("kart_resim_base64",imageString10);
        mFirestore.collection("Slytherin").document("10").set(mData);




        ByteArrayOutputStream byteArrayOutputStream11 = new ByteArrayOutputStream();
        Bitmap bitmap11 = BitmapFactory.decodeResource(getResources(), R.drawable.s11);
        bitmap11.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream11);
        byte[] imageBytes11 = byteArrayOutputStream11.toByteArray();
        String imageString11 = Base64.encodeToString(imageBytes11, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Tom Riddle");
        mData.put("kart_puani",20);
        mData.put("kart_resim_base64",imageString11);
        mFirestore.collection("Slytherin").document("11").set(mData)
                .addOnCompleteListener(data_load.this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(data_load.this,"başarılı",Toast.LENGTH_SHORT).show();
                        }
                        else
                            Toast.makeText(data_load.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();


                    }
                });


    }
    public void HufflePuffYukle(View v)
    {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.h1);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] imageBytes = byteArrayOutputStream.toByteArray();
        String imageString = Base64.encodeToString(imageBytes, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Cedric Diggory");
        mData.put("kart_puani",18);
        mData.put("kart_resim_base64",imageString);
        mFirestore.collection("Hufflepuff").document("1").set(mData);



        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.h2);
        bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
        byte[] imageBytes2 = byteArrayOutputStream2.toByteArray();
        String imageString2 = Base64.encodeToString(imageBytes2, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Ernest Macmillan");
        mData.put("kart_puani",5);
        mData.put("kart_resim_base64",imageString2);
        mFirestore.collection("Hufflepuff").document("2").set(mData);




        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.h3);
        bitmap3.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream3);
        byte[] imageBytes3 = byteArrayOutputStream3.toByteArray();
        String imageString3 = Base64.encodeToString(imageBytes3, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Fat Friar");
        mData.put("kart_puani",12);
        mData.put("kart_resim_base64",imageString3);
        mFirestore.collection("Hufflepuff").document("3").set(mData);




        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(), R.drawable.h4);
        bitmap4.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream4);
        byte[] imageBytes4 = byteArrayOutputStream4.toByteArray();
        String imageString4 = Base64.encodeToString(imageBytes4, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Hannah Abbott");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString4);
        mFirestore.collection("Hufflepuff").document("4").set(mData);





        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
        Bitmap bitmap5 = BitmapFactory.decodeResource(getResources(), R.drawable.h5);
        bitmap5.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream5);
        byte[] imageBytes5 = byteArrayOutputStream5.toByteArray();
        String imageString5 = Base64.encodeToString(imageBytes5, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Helga Hufflepuff");
        mData.put("kart_puani",20);
        mData.put("kart_resim_base64",imageString5);
        mFirestore.collection("Hufflepuff").document("5").set(mData);





        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
        Bitmap bitmap6 = BitmapFactory.decodeResource(getResources(), R.drawable.h6);
        bitmap6.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream6);
        byte[] imageBytes6 = byteArrayOutputStream6.toByteArray();
        String imageString6 = Base64.encodeToString(imageBytes6, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Leanne");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString6);
        mFirestore.collection("Hufflepuff").document("6").set(mData);




        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
        Bitmap bitmap7 = BitmapFactory.decodeResource(getResources(), R.drawable.h7);
        bitmap7.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream7);
        byte[] imageBytes7 = byteArrayOutputStream7.toByteArray();
        String imageString7 = Base64.encodeToString(imageBytes7, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Newt Scamander");
        mData.put("kart_puani",18);
        mData.put("kart_resim_base64",imageString7);
        mFirestore.collection("Hufflepuff").document("7").set(mData);




        ByteArrayOutputStream byteArrayOutputStream8 = new ByteArrayOutputStream();
        Bitmap bitmap8 = BitmapFactory.decodeResource(getResources(), R.drawable.h8);
        bitmap8.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream8);
        byte[] imageBytes8 = byteArrayOutputStream8.toByteArray();
        String imageString8 = Base64.encodeToString(imageBytes8, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Nymphadora Tonks");
        mData.put("kart_puani",14);
        mData.put("kart_resim_base64",imageString8);
        mFirestore.collection("Hufflepuff").document("8").set(mData);




        ByteArrayOutputStream byteArrayOutputStream9 = new ByteArrayOutputStream();
        Bitmap bitmap9 = BitmapFactory.decodeResource(getResources(), R.drawable.h9);
        bitmap9.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream9);
        byte[] imageBytes9 = byteArrayOutputStream9.toByteArray();
        String imageString9 = Base64.encodeToString(imageBytes9, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Pomona Sprout");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString9);
        mFirestore.collection("Hufflepuff").document("9").set(mData);




        ByteArrayOutputStream byteArrayOutputStream10 = new ByteArrayOutputStream();
        Bitmap bitmap10 = BitmapFactory.decodeResource(getResources(), R.drawable.h10);
        bitmap10.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream10);
        byte[] imageBytes10 = byteArrayOutputStream10.toByteArray();
        String imageString10 = Base64.encodeToString(imageBytes10, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Silvanus Kettleburn");
        mData.put("kart_puani",12);
        mData.put("kart_resim_base64",imageString10);
        mFirestore.collection("Hufflepuff").document("10").set(mData);




        ByteArrayOutputStream byteArrayOutputStream11 = new ByteArrayOutputStream();
        Bitmap bitmap11 = BitmapFactory.decodeResource(getResources(), R.drawable.h11);
        bitmap11.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream11);
        byte[] imageBytes11 = byteArrayOutputStream11.toByteArray();
        String imageString11 = Base64.encodeToString(imageBytes11, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Ted Lupin");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString11);
        mFirestore.collection("Hufflepuff").document("11").set(mData)
                .addOnCompleteListener(data_load.this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(data_load.this,"başarılı",Toast.LENGTH_SHORT).show();
                        }
                        else
                            Toast.makeText(data_load.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();


                    }
                });



    }
    public void RavenClawYukle(View v)
    {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.r1);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] imageBytes = byteArrayOutputStream.toByteArray();
        String imageString = Base64.encodeToString(imageBytes, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Cho Chang");
        mData.put("kart_puani",11);
        mData.put("kart_resim_base64",imageString);
        mFirestore.collection("Ravenclaw").document("1").set(mData);



        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.r2);
        bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
        byte[] imageBytes2 = byteArrayOutputStream2.toByteArray();
        String imageString2 = Base64.encodeToString(imageBytes2, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Filius Flitwick");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString2);
        mFirestore.collection("Ravenclaw").document("2").set(mData);




        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.r3);
        bitmap3.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream3);
        byte[] imageBytes3 = byteArrayOutputStream3.toByteArray();
        String imageString3 = Base64.encodeToString(imageBytes3, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Garrick Ollivander");
        mData.put("kart_puani",15);
        mData.put("kart_resim_base64",imageString3);
        mFirestore.collection("Ravenclaw").document("3").set(mData);




        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(), R.drawable.r4);
        bitmap4.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream4);
        byte[] imageBytes4 = byteArrayOutputStream4.toByteArray();
        String imageString4 = Base64.encodeToString(imageBytes4, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Gilderoy Lockhart");
        mData.put("kart_puani",13);
        mData.put("kart_resim_base64",imageString4);
        mFirestore.collection("Ravenclaw").document("4").set(mData);





        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
        Bitmap bitmap5 = BitmapFactory.decodeResource(getResources(), R.drawable.r5);
        bitmap5.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream5);
        byte[] imageBytes5 = byteArrayOutputStream5.toByteArray();
        String imageString5 = Base64.encodeToString(imageBytes5, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Luna Lovegood");
        mData.put("kart_puani",9);
        mData.put("kart_resim_base64",imageString5);
        mFirestore.collection("Ravenclaw").document("5").set(mData);





        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
        Bitmap bitmap6 = BitmapFactory.decodeResource(getResources(), R.drawable.r6);
        bitmap6.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream6);
        byte[] imageBytes6 = byteArrayOutputStream6.toByteArray();
        String imageString6 = Base64.encodeToString(imageBytes6, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Marcus Belby");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString6);
        mFirestore.collection("Ravenclaw").document("6").set(mData);




        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
        Bitmap bitmap7 = BitmapFactory.decodeResource(getResources(), R.drawable.r7);
        bitmap7.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream7);
        byte[] imageBytes7 = byteArrayOutputStream7.toByteArray();
        String imageString7 = Base64.encodeToString(imageBytes7, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Myrtle Warren");
        mData.put("kart_puani",5);
        mData.put("kart_resim_base64",imageString7);
        mFirestore.collection("Ravenclaw").document("7").set(mData);




        ByteArrayOutputStream byteArrayOutputStream8 = new ByteArrayOutputStream();
        Bitmap bitmap8 = BitmapFactory.decodeResource(getResources(), R.drawable.r8);
        bitmap8.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream8);
        byte[] imageBytes8 = byteArrayOutputStream8.toByteArray();
        String imageString8 = Base64.encodeToString(imageBytes8, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Padma Patil");
        mData.put("kart_puani",10);
        mData.put("kart_resim_base64",imageString8);
        mFirestore.collection("Ravenclaw").document("8").set(mData);




        ByteArrayOutputStream byteArrayOutputStream9 = new ByteArrayOutputStream();
        Bitmap bitmap9 = BitmapFactory.decodeResource(getResources(), R.drawable.r9);
        bitmap9.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream9);
        byte[] imageBytes9 = byteArrayOutputStream9.toByteArray();
        String imageString9 = Base64.encodeToString(imageBytes9, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Quirinus Quirrell");
        mData.put("kart_puani",15);
        mData.put("kart_resim_base64",imageString9);
        mFirestore.collection("Ravenclaw").document("9").set(mData);




        ByteArrayOutputStream byteArrayOutputStream10 = new ByteArrayOutputStream();
        Bitmap bitmap10 = BitmapFactory.decodeResource(getResources(), R.drawable.r10);
        bitmap10.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream10);
        byte[] imageBytes10 = byteArrayOutputStream10.toByteArray();
        String imageString10 = Base64.encodeToString(imageBytes10, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Rowena Ravenclaw");
        mData.put("kart_puani",20);
        mData.put("kart_resim_base64",imageString10);
        mFirestore.collection("Ravenclaw").document("10").set(mData);




        ByteArrayOutputStream byteArrayOutputStream11 = new ByteArrayOutputStream();
        Bitmap bitmap11 = BitmapFactory.decodeResource(getResources(), R.drawable.r11);
        bitmap11.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream11);
        byte[] imageBytes11 = byteArrayOutputStream11.toByteArray();
        String imageString11 = Base64.encodeToString(imageBytes11, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","Sybill Trelawney");
        mData.put("kart_puani",14);
        mData.put("kart_resim_base64",imageString11);
        mFirestore.collection("Ravenclaw").document("11").set(mData)
                .addOnCompleteListener(data_load.this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(data_load.this,"başarılı",Toast.LENGTH_SHORT).show();
                        }
                        else
                            Toast.makeText(data_load.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();


                    }
                });



    }
    public void backYukle(View v)
    {
        ByteArrayOutputStream byteArrayOutputStream11 = new ByteArrayOutputStream();
        Bitmap bitmap11 = BitmapFactory.decodeResource(getResources(), R.drawable.back);
        bitmap11.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream11);
        byte[] imageBytes11 = byteArrayOutputStream11.toByteArray();
        String imageString11 = Base64.encodeToString(imageBytes11, Base64.DEFAULT);

        mData=new HashMap<>();
        mData.put("kart_ismi","back");
        mData.put("kart_resim_base64",imageString11);
        mFirestore.collection("Ortak").document("1").set(mData)
                .addOnCompleteListener(data_load.this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(data_load.this,"başarılı",Toast.LENGTH_SHORT).show();
                        }
                        else
                            Toast.makeText(data_load.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();


                    }
                });



    }
    public void ResimYukle(View v)
    {
        documentReference=mFirestore.collection("Ravenclaw").document("11");
        documentReference.get()
                .addOnSuccessListener(this, new OnSuccessListener<DocumentSnapshot>()
                {
                    public void onSuccess(DocumentSnapshot documentSnapshot)
                    {
                        if(documentSnapshot.exists())
                        {

                            String imageString= (String) documentSnapshot.getData().get("kart_resim_base64");


                            byte[] imageBytes2 ;

                            imageBytes2 = Base64.decode(imageString, Base64.DEFAULT);
                            Bitmap decodedImage = BitmapFactory.decodeByteArray(imageBytes2, 0, imageBytes2.length);
                            image.setImageBitmap(decodedImage);
                        }
                    }
                });

    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.IBinder;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;


import android.os.Bundle;

public class MultiPlayer_Mode extends AppCompatActivity {

    private CardMusicService cardMusicService;
    private ServiceConnection mConnection2 = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            cardMusicService = ((CardMusicService.LocalBinder)service).getService();

        }

        public void onServiceDisconnected(ComponentName className) {

            cardMusicService = null;

        }
    };
    private MediaPlayerService mPlayerService;

    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            mPlayerService = ((MediaPlayerService.LocalBinder)service).getService();

        }

        public void onServiceDisconnected(ComponentName className) {

            mPlayerService = null;

        }
    };

    private LostMusicService lostMusicService;

    private ServiceConnection mConnection3 = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            lostMusicService = ((LostMusicService.LocalBinder)service).getService();

        }

        public void onServiceDisconnected(ComponentName className) {

            lostMusicService = null;

        }
    };

    private winMusicService WinMusicService;

    private ServiceConnection mConnection4 = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            WinMusicService = ((winMusicService.LocalBinder)service).getService();

        }

        public void onServiceDisconnected(ComponentName className) {

            WinMusicService = null;

        }
    };


    int multi=1;
    int sonkart=0;
    int match=0;
    double skor1=0;
    double skor2=0;
    CountDownTimer say;
    private  Button muzıkac;
    private FirebaseFirestore mFirestore;
    private DocumentReference documentReference;
    private boolean clicked=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_player_mode);
        final TextView sure = (TextView) findViewById(R.id.sure6m);
        mFirestore = FirebaseFirestore.getInstance();
        muzıkac=(Button)findViewById(R.id.muzıkAc);





        Intent congratsMusic = new Intent();
        congratsMusic.setClass(this,CardMusicService.class);
        bindService(congratsMusic, mConnection2, Context.BIND_AUTO_CREATE);

        Intent music = new Intent();
        music.setClass(this,MediaPlayerService.class);
        bindService(music, mConnection, Context.BIND_AUTO_CREATE);

        Intent lostmusic = new Intent();
        lostmusic.setClass(this,LostMusicService.class);
        bindService(lostmusic, mConnection3, Context.BIND_AUTO_CREATE);

        Intent winmusic = new Intent();
        winmusic.setClass(this,winMusicService.class);
        bindService(winmusic, mConnection4, Context.BIND_AUTO_CREATE);

        muzıkac.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                //mediaPlayer.start();
                // mPlayerService.onStart();
                if(mPlayerService.onComplete())
                {
                    clicked=false;
                }
                else
                {
                    clicked=true;
                }
                if(clicked)
                {
                    //sesi kapat
                    mPlayerService.onPause();
                    WinMusicService.onPause();
                    cardMusicService.onPause();
                    lostMusicService.onPause();

                    clicked=false;
                }
                else
                {
                    //sesi ac
                    mPlayerService.onStart();

                    clicked=true;
                }


            }
        });




        int[] sayilar = {1,2,3,4,5,6,7,8,9,10,11};
        for(int j=0;j<11;j++){
            int rg = (int)(Math.random()*11);
            int k = sayilar[rg];
            sayilar[rg]=sayilar[j];
            sayilar[j]=k;
        }
        Kart kartlar[]= new Kart[36];

        GridLayout gl = (GridLayout) findViewById(R.id.gridLayout6m);
        for(int j=1;j<=36;j++) {
            kartlar[j-1]=new Kart(this,j);
            int a=0;


            if(j>=12 && j<=18){
                a = j-12;
            }else if(j>=30 && j<=36){
                a = j-30;
            }else if(j<=11){
                a = j-1;
            }else if(j>=19 && j<=29){
                a = j-19;
            }




            if (j % 18 == 1) {
                kartlar[j - 1].ev_katsayisi = 2;
                kartlar[j - 1].ev = "Gryffindore";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            } else if (j % 18 == 2) {
                kartlar[j - 1].ev_katsayisi = 2;
                kartlar[j - 1].ev = "Gryffindore";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            } else if (j % 18 == 3)  {
                kartlar[j - 1].ev_katsayisi = 2;
                kartlar[j - 1].ev = "Gryffindore";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            } else if (j % 18 == 4) {
                kartlar[j - 1].ev_katsayisi = 2;
                kartlar[j - 1].ev = "Gryffindore";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            } else if (j % 18 == 5) {
                kartlar[j - 1].ev_katsayisi = 2;
                kartlar[j - 1].ev = "Gryffindore";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            }else if (j % 18 == 6) {
                kartlar[j - 1].ev_katsayisi = 1;
                kartlar[j - 1].ev = "Hufflepuff";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            } else if (j % 18 == 7) {
                kartlar[j - 1].ev_katsayisi = 1;
                kartlar[j - 1].ev = "Hufflepuff";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            } else if (j % 18 == 8) {
                kartlar[j - 1].ev_katsayisi = 1;
                kartlar[j - 1].ev = "Hufflepuff";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            } else if (j % 18 == 9) {
                kartlar[j - 1].ev_katsayisi = 1;
                kartlar[j - 1].ev = "Hufflepuff";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            }else if (j % 18 == 10) {
                kartlar[j - 1].ev_katsayisi = 1;
                kartlar[j - 1].ev = "Ravenclaw";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            } else if (j % 18 == 11) {
                kartlar[j - 1].ev_katsayisi = 1;
                kartlar[j - 1].ev = "Ravenclaw";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            }else if (j % 18 == 12) {
                kartlar[j - 1].ev_katsayisi = 1;
                kartlar[j - 1].ev = "Ravenclaw";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            } else if (j % 18 == 13) {
                kartlar[j - 1].ev_katsayisi = 1;
                kartlar[j - 1].ev = "Ravenclaw";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            }else if (j % 18 == 14) {
                kartlar[j - 1].ev_katsayisi = 2;
                kartlar[j - 1].ev = "Slytherin";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            }else if (j % 18 == 15) {
                kartlar[j - 1].ev_katsayisi = 2;
                kartlar[j - 1].ev = "Slytherin";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            }else if (j % 18 == 16) {
                kartlar[j - 1].ev_katsayisi = 2;
                kartlar[j - 1].ev = "Slytherin";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            }else if (j % 18 == 17) {
                kartlar[j - 1].ev_katsayisi = 2;
                kartlar[j - 1].ev = "Slytherin";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            }else if (j % 18 == 0) {
                kartlar[j - 1].ev_katsayisi = 2;
                kartlar[j - 1].ev = "Slytherin";
                kartlar[j-1].onplanID=sayilar[a];
                Bilgiler(kartlar[j-1]);

            }





        }
        for(int j=0;j<36;j++){
            int rg = (int)(Math.random()*36);
            Kart k = kartlar[rg];
            kartlar[rg]=kartlar[j];
            kartlar[j]=k;
        }

        for(int j=0;j<36;j++) {
            gl.addView(kartlar[j]);
            System.out.println(kartlar[j].onplanID);
            kartlar[j].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tikla(view);
                }
            });
        }

        say = new CountDownTimer(61000,1000) {
            @Override
            public void onTick(long l) {
                sure.setText(""+(l/1000));

            }

            @Override
            public void onFinish() {
                sure.setText("0");
                if(!(mPlayerService.onComplete())) {
                    WinMusicService.onPause();
                    cardMusicService.onPause();
                    lostMusicService.onStart();
                }
                else
                {


                }


                //sure bittiginde muzik olabilir
                Intent Game_over=new Intent(MultiPlayer_Mode.this,Game_overmulti.class);
                if(skor1 > skor2){
                    Game_over.putExtra("Skor",1);
                    Game_over.putExtra("Skor2",skor1);
                }else{
                    Game_over.putExtra("Skor",2);
                    Game_over.putExtra("Skor2",skor2);
                }
                //burada son sayfaya skorlar da gönderilebilir şimdilik yalnızca kazananı gönderiyorum

                startActivity(Game_over);
            }
        };
        say.start();


    }

    public void Bilgiler(Kart v)
    {
        String ev = ""+v.ev;
        String id = ""+v.onplanID;

        documentReference=mFirestore.collection(ev).document(id);
        documentReference.get()
                .addOnSuccessListener(this, new OnSuccessListener<DocumentSnapshot>()
                {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot)
                    {
                        if(documentSnapshot.exists())
                        {



                            String imageString= (String) documentSnapshot.getData().get("kart_resim_base64");
                            Number puan1= (Number)documentSnapshot.getData().get("kart_puani");
                            v.isim=(String)documentSnapshot.getData().get("kart_ismi");
                            byte[] imageBytes2 ;

                            imageBytes2 = Base64.decode(imageString, Base64.DEFAULT);
                            Bitmap DecodedImage = BitmapFactory.decodeByteArray(imageBytes2, 0, imageBytes2.length);

                            v.puan= puan1.intValue();

                            v.decodedimage=DecodedImage;



                        }
                    }
                });



    }




    public void  tikla(View v){
        Kart k = (Kart)v;
        k.cevir();
        TextView pl1 = (TextView) findViewById(R.id.player1);
        TextView pl2 = (TextView) findViewById(R.id.player2);
        TextView sira = (TextView) findViewById(R.id.sira);
        TextView sure = (TextView) findViewById(R.id.sure6m);

        if(k.isim=="Cedric Diggory"){
            //muzik
        }
        if(multi == 1){
            sira.setText("Sıra :Oyuncu 1");
        }else{
            sira.setText("Sıra :Oyuncu 2");
        }


        if(sonkart!=0){

            Kart k2 = (Kart) findViewById(sonkart);
            if(k2.isim == k.isim && (k.getId()!=k2.getId())){
                match++;
                k2.kilitle=true;
                k.kilitle=true;

                if(multi == 1){
                    double a=2.0*k.puan* k.ev_katsayisi;
                    double kalan=Integer.parseInt(sure.getText().toString());
                    double b=kalan/10.0;
                    skor1= skor1 + (a*b);
                    if(!(mPlayerService.onComplete()))
                    {
                        mPlayerService.onPause();

                        cardMusicService.onStart();

                    }

                    if(cardMusicService.onComplete())
                    {
                        mPlayerService.onStart();
                    }

                    //buraya muzik konacak

                    pl1.setText("Oyuncu 1: "+(int)skor1);


                }else{
                    double a=2.0*k.puan* k.ev_katsayisi;
                    double kalan=Integer.parseInt(sure.getText().toString());
                    double b=kalan/10.0;
                    skor2= skor2 + (a*b);
                    if(!(mPlayerService.onComplete()))
                    {
                        mPlayerService.onPause();

                        cardMusicService.onStart();

                    }

                    if(cardMusicService.onComplete())
                    {
                        mPlayerService.onStart();
                    }
                    //buraya muzik konacak

                    pl2.setText("Oyuncu 2: "+(int)skor2);
                }



                if(match==18){
                    //oyunu bitir
                    if(!(mPlayerService.onComplete()))
                    {
                        cardMusicService.onDestroy();
                        mPlayerService.onPause();
                        WinMusicService.onStart();
                    }
                    else
                    {

                    }


                    Intent Game_over=new Intent(MultiPlayer_Mode.this,Game_overmulti.class);
                    if(skor1 > skor2){
                        Game_over.putExtra("Skor",1);
                        Game_over.putExtra("Skor2",skor1);
                    }else{
                        Game_over.putExtra("Skor",2);
                        Game_over.putExtra("Skor2",skor2);
                    }
                    //burada son sayfaya skorlar da gönderilebilir şimdilik yalnızca kazananı gönderiyorum
                    startActivity(Game_over);

                }
                sonkart=0;
            }else{

                //no match

                Handler h = new Handler();
                h.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        k.cevir();
                        k2.cevir();
                    }
                },500);

                if(multi == 1){
                    double a =(k.puan+k2.puan)/k.ev_katsayisi;

                    double d = (k.puan+k2.puan)/2;
                    double e=k.ev_katsayisi*k2.ev_katsayisi;
                    if(k.ev==k2.ev){
                        skor1=skor1-(a*((60.0-(Double.parseDouble(sure.getText().toString())))/10.0));
                    }else{
                        skor1=skor1-(d*e*((60.0-(Integer.parseInt(sure.getText().toString())))/10.0));
                    }
                    //buraya muzik konacak
                    pl1.setText("Oyuncu 1: "+(int)skor1);

                    multi=2;

                }else{
                    double a =(k.puan+k2.puan)/k.ev_katsayisi;

                    double d = (k.puan+k2.puan)/2;
                    double e=k.ev_katsayisi*k2.ev_katsayisi;
                    if(k.ev==k2.ev){
                        skor2=skor2-(a*((60.0-(Double.parseDouble(sure.getText().toString())))/10.0));
                    }else{
                        skor2=skor2-(d*e*((60.0-(Integer.parseInt(sure.getText().toString())))/10.0));
                    }
                    //buraya muzik konacak
                    pl2.setText("Oyuncu 2: "+(int)skor2);

                    multi=1;
                }

                if(multi == 1){
                    sira.setText("Sıra :Oyuncu 1");
                }else{
                    sira.setText("Sıra :Oyuncu 2");
                }

                sonkart=0;



            }
        }else{

            sonkart=k.getId();
        }
    }

}
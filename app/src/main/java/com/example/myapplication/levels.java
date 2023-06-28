package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class levels extends AppCompatActivity {

    int mod;
    private Button muzıkac;
    private MediaPlayerService mPlayerService;
    private boolean clicked=true;

    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            mPlayerService = ((MediaPlayerService.LocalBinder)service).getService();

        }

        public void onServiceDisconnected(ComponentName className) {

            mPlayerService = null;

        }
    };
    private CardMusicService cardMusicService;
    private ServiceConnection mConnection2 = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            cardMusicService = ((CardMusicService.LocalBinder)service).getService();

        }

        public void onServiceDisconnected(ComponentName className) {

            cardMusicService = null;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        Intent i = getIntent();

        Intent music = new Intent();
        music.setClass(levels.this,MediaPlayerService.class);
        bindService(music, mConnection, Context.BIND_AUTO_CREATE);

        Intent congratsMusic = new Intent();
        congratsMusic.setClass(this,CardMusicService.class);
        bindService(congratsMusic, mConnection2, Context.BIND_AUTO_CREATE);

        Intent lostmusic = new Intent();
        lostmusic.setClass(this,LostMusicService.class);
        bindService(lostmusic, mConnection3, Context.BIND_AUTO_CREATE);

        Intent winmusic = new Intent();
        winmusic.setClass(this,winMusicService.class);
        bindService(winmusic, mConnection4, Context.BIND_AUTO_CREATE);

        muzıkac=(Button)findViewById(R.id.muzıkAc);



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

                    mPlayerService.onPause();
                    clicked=false;
                }
                else
                {
                    mPlayerService.onStart();
                    clicked=true;
                }


            }
        });
        //sarkı=MediaPlayer.create(this,R.raw.a);
        //sarkı.start();
        mod=i.getIntExtra("mod",0);

    }

    public void toGame2(View v){
        if (mod==1) {
            Intent togame =new Intent(levels.this,SinglePlayer_Mode2.class);
            startActivity(togame);
        }else if(mod==2){
            Intent togame =new Intent(levels.this,MultiPlayer_Mode2.class);
            startActivity(togame);
        }


    }
    public void toGame4(View v){

        if (mod==1) {
            Intent togame =new Intent(levels.this,SinglePlayer_Mode4.class);
            startActivity(togame);
        }else if(mod==2){
            Intent togame =new Intent(levels.this,MultiPlayer_Mode4.class);
            startActivity(togame);
        }

    }
    public void toGame6(View v){

        if (mod==1) {
            Intent togame =new Intent(levels.this,SinglePlayer_Mode.class);
            startActivity(togame);
        }else if(mod==2){
            Intent togame =new Intent(levels.this,MultiPlayer_Mode.class);
            startActivity(togame);
        }

    }

}
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

import java.io.Serializable;

public class Single_MultiPlayer extends AppCompatActivity {

    private Button muzıkac,muzıkkapat;
    private Button b2;
    private MediaPlayer mediaPlayer;
    private boolean mIsBound = false;
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
        setContentView(R.layout.activity_single_multi_player);
        Intent music = new Intent();
        music.setClass(Single_MultiPlayer.this,MediaPlayerService.class);
        bindService(music, mConnection, Context.BIND_AUTO_CREATE);
        muzıkac=(Button)findViewById(R.id.muzıkAc);

        Intent congratsMusic = new Intent();
        congratsMusic.setClass(this,CardMusicService.class);
        bindService(congratsMusic, mConnection2, Context.BIND_AUTO_CREATE);

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

    }
    public void singlePlayer(View v)
    {
        Intent levels=new Intent(Single_MultiPlayer.this,levels.class);
        levels.putExtra("mod",1);

        startActivity(levels);

    }
    public void multiPlayer(View v)
    {
        Intent levels=new Intent(Single_MultiPlayer.this,levels.class);
        levels.putExtra("mod",2);

        startActivity(levels);

    }
    public void sıfreGuncelle(View v)
    {
        Intent sifeguncelle=new Intent(Single_MultiPlayer.this,SifreGuncelle.class);
        startActivity(sifeguncelle);
    }

}
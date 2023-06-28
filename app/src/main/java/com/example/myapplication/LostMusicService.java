package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;


public class LostMusicService extends Service {
    private MediaPlayer mediaPlayer;
    public class LocalBinder extends Binder {
        LostMusicService getService() {
            return LostMusicService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    private final IBinder mBinder = new LostMusicService.LocalBinder();
    @Nullable
    @Override

    public void onCreate()
    {
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.surebitti);
        mediaPlayer.setLooping(false);
    }
    public void onStart()
    {

        mediaPlayer.start();
    }
    public boolean onComplete()
    {
        if(mediaPlayer.isPlaying())
        {
            return false;
        }
        else
        {
            return true;
        }

    }
    public boolean stopService(Intent name)
    {
        return super.stopService(name);
    }
    public void onPause()
    {
        mediaPlayer.pause();
    }
    public void onDestroy()
    {
        mediaPlayer.stop();
    }
}


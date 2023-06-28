package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class CardMusicService extends Service {
    private MediaPlayer mediaPlayer2;
    public class LocalBinder extends Binder {
        CardMusicService getService() {
            return CardMusicService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    private final IBinder mBinder = new CardMusicService.LocalBinder();
    @Nullable
    @Override

    public void onCreate()
    {
        mediaPlayer2=MediaPlayer.create(getApplicationContext(),R.raw.kisa);
        mediaPlayer2.setLooping(false);
    }
    public void onStart()
    {

        mediaPlayer2.start();
    }
    public boolean onComplete()
    {

      return mediaPlayer2.isPlaying();
    }
    public boolean stopService(Intent name)
    {
        return super.stopService(name);
    }
    public void onPause()
    {
        mediaPlayer2.pause();
    }
    public void onDestroy()
    {
        mediaPlayer2.stop();
    }
}



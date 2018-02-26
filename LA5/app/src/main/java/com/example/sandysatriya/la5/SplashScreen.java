package com.example.sandysatriya.la5;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

/**
 * Created by SandySatriya on 4/27/2017.
 */
public class SplashScreen extends MainActivity{

    //Set waktu lama splashscreen
    private static int splashInterval = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent
                //jeda selesai Splashscreen
                this.finish(); }
            private void finish() {
            }
        }, splashInterval );
    };
}
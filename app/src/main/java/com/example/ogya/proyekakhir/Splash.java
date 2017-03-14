package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    private long ms = 0;
    private long splashTime = 2500;
    private boolean splashActive = true;
    private boolean splashPause = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread th = new Thread() {
            public void run() {
                try {
                    while (splashActive && ms < splashTime) {
                        if (!splashPause) {
                            ms = ms + 100;
                        }
                        sleep(100);
                    }
                } catch (Exception e) {

                } finally {
                    Intent i = new Intent(Splash.this, Layar_Awal.class);
                    startActivity(i);
                }
            }
        };
        th.start();
    }
}

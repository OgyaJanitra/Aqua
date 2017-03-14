package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class rumus_Bangun_datar1 extends AppCompatActivity {
    Button btnPrevDatar, btnFwdDatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus__bangun_datar1);

        btnPrevDatar = (Button) findViewById(R.id.btnPrev1Datar);
        btnFwdDatar = (Button) findViewById(R.id.btnFwd1Datar);

        btnPrevDatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_Bangun_datar1.this, rumus_bangun_datar4.class));
            }
        });

        btnFwdDatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_Bangun_datar1.this, rumus_bangun_datar2.class));
            }
        });
    }
}

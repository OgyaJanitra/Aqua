package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Rumus_Bangun_Ruang extends AppCompatActivity {
    Button btnPrev1Ruang, btnFwd1Ruang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus__bangun__ruang);

        btnPrev1Ruang = (Button) findViewById(R.id.btnPrev1Ruang);
        btnFwd1Ruang = (Button) findViewById(R.id.btnFwd1Ruang);

        btnPrev1Ruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Bangun_Ruang.this, Rumus_Bangun_Ruang4.class));
            }
        });

        btnFwd1Ruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Bangun_Ruang.this, Rumus_Bangun_Ruang2.class));
            }
        });
    }
}

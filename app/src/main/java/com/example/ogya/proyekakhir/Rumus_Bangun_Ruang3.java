package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Rumus_Bangun_Ruang3 extends AppCompatActivity {
    Button btnPrev3Ruang, btnFwd3Ruang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus__bangun__ruang3);

        btnPrev3Ruang = (Button) findViewById(R.id.btnPrev3Ruang);
        btnFwd3Ruang = (Button) findViewById(R.id.btnFwd3Ruang);

        btnPrev3Ruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Bangun_Ruang3.this, Rumus_Bangun_Ruang2.class));
            }
        });

        btnFwd3Ruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Bangun_Ruang3.this, Rumus_Bangun_Ruang4.class));
            }
        });
    }
}

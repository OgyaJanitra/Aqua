package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Rumus_Bangun_Ruang4 extends AppCompatActivity {
    Button btnPrev4Ruang, btnFwd4Ruang, btnHomeRuang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus__bangun__ruang4);

        btnPrev4Ruang = (Button) findViewById(R.id.btnPrev4Ruang);
        btnFwd4Ruang = (Button) findViewById(R.id.btnFwd4Ruang);
        btnHomeRuang = (Button) findViewById(R.id.btnHomeRuang);

        btnPrev4Ruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Bangun_Ruang4.this, Rumus_Bangun_Ruang3.class));
            }
        });

        btnHomeRuang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Bangun_Ruang4.this, Rumus_Matematika.class));
            }
        });

        btnFwd4Ruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Bangun_Ruang4.this, Rumus_Bangun_Ruang.class));
            }
        });
    }
}

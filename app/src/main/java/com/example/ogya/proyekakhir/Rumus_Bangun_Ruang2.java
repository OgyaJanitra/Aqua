package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Rumus_Bangun_Ruang2 extends AppCompatActivity {
    Button btnPrev2Ruang, btnFwd2Ruang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus__bangun__ruang2);

        btnPrev2Ruang = (Button) findViewById(R.id.btnPrev2Ruang);
        btnFwd2Ruang = (Button) findViewById(R.id.btnFwd2Ruang);

        btnPrev2Ruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Bangun_Ruang2.this, Rumus_Bangun_Ruang.class));
            }
        });

        btnFwd2Ruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Bangun_Ruang2.this, Rumus_Bangun_Ruang3.class));
            }
        });
    }
}

package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class rumus_Matriks2 extends AppCompatActivity {
    Button btnFwd2Matriks, btnPrev2Matriks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus__matriks2);

        btnFwd2Matriks = (Button) findViewById(R.id.btnFwd2Matriks);
        btnPrev2Matriks = (Button) findViewById(R.id.btnPrev2Matriks);

        btnFwd2Matriks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_Matriks2.this, rumus_Matriks3.class));
            }
        });

        btnPrev2Matriks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_Matriks2.this, rumus_Matriks.class));
            }
        });

    }
}

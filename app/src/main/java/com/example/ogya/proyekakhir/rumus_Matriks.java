package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class rumus_Matriks extends AppCompatActivity {
    Button btnPrev1Matriks, btnFwd1Matriks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus__matriks);

        btnFwd1Matriks = (Button) findViewById(R.id.btnFwd1Matriks);
        btnPrev1Matriks = (Button) findViewById(R.id.btnPrev1Matriks);

        btnFwd1Matriks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_Matriks.this, rumus_Matriks2.class));
            }
        });

        btnPrev1Matriks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_Matriks.this, rumus_Matriks3.class));
            }
        });
    }
}

package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class rumus_Matriks3 extends AppCompatActivity {
    Button btnPrev3Matriks, btnFwd3Matriks, btnHomeMatriks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus__matriks3);

        btnFwd3Matriks = (Button) findViewById(R.id.btnFwd3Matriks);
        btnPrev3Matriks = (Button) findViewById(R.id.btnPrev3Matriks);
        btnHomeMatriks = (Button) findViewById(R.id.btnHomeMatriks);

        btnFwd3Matriks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_Matriks3.this, rumus_Matriks.class));
            }
        });

        btnPrev3Matriks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_Matriks3.this, rumus_Matriks2.class));
            }
        });

        btnHomeMatriks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_Matriks3.this, Rumus_Matematika.class));
            }
        });
    }
}

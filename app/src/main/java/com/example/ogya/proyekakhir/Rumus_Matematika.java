package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Rumus_Matematika extends AppCompatActivity {
    Button btnBgnDtr, btnBgnRng, btnGradien, btnMatriks, btnHomeMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus__matematika);

        btnBgnDtr = (Button) findViewById(R.id.btnBgnDtr);
        btnBgnRng = (Button) findViewById(R.id.btnBgnRng);
        btnGradien = (Button) findViewById(R.id.btnGradien);
        btnMatriks = (Button) findViewById(R.id.btnMatriks);
        btnHomeMath = (Button) findViewById(R.id.btnHomeMath);

        btnBgnDtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Matematika.this, rumus_Bangun_datar1.class));
            }
        });

        btnBgnRng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Matematika.this, Rumus_Bangun_Ruang.class));
            }
        });

        btnGradien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Matematika.this, rumus_Gradien.class));
            }
        });

        btnMatriks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Matematika.this, rumus_Matriks.class));
            }
        });

        btnHomeMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rumus_Matematika.this, Layar_Awal.class));
            }
        });
    }
}

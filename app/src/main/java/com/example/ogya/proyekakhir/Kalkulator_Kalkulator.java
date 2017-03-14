package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Kalkulator_Kalkulator extends AppCompatActivity {
    Button btnKalNorm, btnKal2, btnKal3, btnHomeKal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator__kalkulator);

        btnKalNorm = (Button) findViewById(R.id.btnKalNorm);
        btnKal2 = (Button) findViewById(R.id.btnKal2);
        btnKal3 = (Button) findViewById(R.id.btnKal3);
        btnHomeKal = (Button) findViewById(R.id.btnHomeKal);

        btnKalNorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kalkulator_Kalkulator.this, Kalkulator.class));
            }
        });

        btnKal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kalkulator_Kalkulator.this, Kalkulator_2.class));
            }
        });

        btnKal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kalkulator_Kalkulator.this, Kalkulator_3.class));
            }
        });

        btnHomeKal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kalkulator_Kalkulator.this, Layar_Awal.class));
            }
        });
    }
}

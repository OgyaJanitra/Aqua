package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Konversi extends AppCompatActivity {
    Button btnKonPjg, btnKonBrt, btnUang, btnHomeKonv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi);

        btnKonPjg = (Button) findViewById(R.id.btnKonPjg);
        btnKonBrt = (Button) findViewById(R.id.btnKonBrt);
        btnUang = (Button) findViewById(R.id.btnUang);
        btnHomeKonv = (Button) findViewById(R.id.btnHomeKonv);

        btnKonPjg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Konversi.this, Konversi_Panjang.class));
            }
        });

        btnKonBrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Konversi.this, Konversi_Berat.class));
            }
        });

        btnUang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Konversi.this, Konversi_Mata_Uang.class));
            }
        });

        btnHomeKonv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Konversi.this, Layar_Awal.class));
            }
        });
    }
}

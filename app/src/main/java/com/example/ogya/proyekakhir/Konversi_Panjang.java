package com.example.ogya.proyekakhir;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Konversi_Panjang extends AppCompatActivity {
    EditText editMeter, editHasil;
    Button btnKm, btnInch, btnCm, btnMm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi__panjang);

        editMeter = (EditText) findViewById(R.id.editMeter);
        editHasil = (EditText) findViewById(R.id.editHasilpjg);
        btnKm = (Button) findViewById(R.id.btnKm);
        btnInch = (Button) findViewById(R.id.btnInch);
        btnCm = (Button) findViewById(R.id.btnCm);
        btnMm = (Button) findViewById(R.id.btnMm);

        btnKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Meter = editMeter.getText().toString();
                double konversi = Double.parseDouble(Meter) / 1000;
                String hasil = Double.toString(konversi);
                editHasil.setText(hasil);
            }
        });

        btnInch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Meter = editMeter.getText().toString();
                double konversi = Double.parseDouble(Meter) * 39.37;
                String hasil = Double.toString(konversi);
                editHasil.setText(hasil);
            }
        });

        btnCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Meter = editMeter.getText().toString();
                double konversi = Double.parseDouble(Meter) * 100;
                String hasil = Double.toString(konversi);
                editHasil.setText(hasil);
            }
        });

        btnMm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Meter = editMeter.getText().toString();
                double konversi = Double.parseDouble(Meter) * 1000;
                String hasil = Double.toString(konversi);
                editHasil.setText(hasil);
            }
        });

        btnMm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Meter = editMeter.getText().toString();
                double konversi = Double.parseDouble(Meter) * 1000;
                String hasil = Double.toString(konversi);
                editHasil.setText(hasil);
            }
        });
    }
}

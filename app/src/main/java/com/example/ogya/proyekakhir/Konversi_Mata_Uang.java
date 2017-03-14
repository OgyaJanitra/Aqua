package com.example.ogya.proyekakhir;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Konversi_Mata_Uang extends AppCompatActivity {
    Button btnPounds, btnDollar, btnEuro, btnYen;
    EditText editRupiah, editKonUang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi__mata__uang);

        editRupiah = (EditText) findViewById(R.id.editRupiah);
        editKonUang = (EditText) findViewById(R.id.editKonUang);
        btnPounds = (Button) findViewById(R.id.btnPounds);
        btnDollar = (Button) findViewById(R.id.btnDollar);
        btnEuro = (Button) findViewById(R.id.btnEuro);
        btnYen = (Button) findViewById(R.id.btnYen);

        btnPounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Uang = editRupiah.getText().toString();
                double Konversi = Double.parseDouble(Uang) / 16000;
                String Hasil = Double.toString(Konversi);
                editKonUang.setText(Hasil);
            }
        });

        btnDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Uang = editRupiah.getText().toString();
                double Konversi = Double.parseDouble(Uang) / 13500;
                String Hasil = Double.toString(Konversi);
                editKonUang.setText(Hasil);
            }
        });

        btnEuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Uang = editRupiah.getText().toString();
                double Konversi = Double.parseDouble(Uang) / 14500;
                String Hasil = Double.toString(Konversi);
                editKonUang.setText(Hasil);
            }
        });

        btnYen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Uang = editRupiah.getText().toString();
                double Konversi = Double.parseDouble(Uang) / 100;
                String Hasil = Double.toString(Konversi);
                editKonUang.setText(Hasil);
            }
        });
    }
}

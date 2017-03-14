package com.example.ogya.proyekakhir;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Kalkulator extends AppCompatActivity {
    Button btnTmbh, btnKrg, btnKali, btnBagi, btnReset;
    EditText editMsk, editKlr, editHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        btnTmbh = (Button) findViewById(R.id.btnTmbh);
        btnKrg = (Button) findViewById(R.id.btnKrg);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        editMsk = (EditText) findViewById(R.id.editMsk);
        editKlr = (EditText) findViewById(R.id.editKlr);
        editHasil = (EditText) findViewById(R.id.editHasilpjg);

        btnTmbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpenjumlahan();
            }
        });

        btnKrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpengurangan();
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorperkalian();
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpembagian();
            }
        });
    }

    private void operatorpenjumlahan() {
        Double angka1 = Double.parseDouble(editMsk.getText().toString());
        Double angka2 = Double.parseDouble(editKlr.getText().toString());
        Double penjumlahan = angka1 + angka2;
        editHasil.setText(penjumlahan.toString());
    }

    private void operatorpengurangan() {
        Double angka1 = Double.parseDouble(editMsk.getText().toString());
        Double angka2 = Double.parseDouble(editKlr.getText().toString());
        Double pengurangan = angka1 - angka2;
        editHasil.setText(pengurangan.toString());
    }

    private void operatorperkalian() {
        Double angka1 = Double.parseDouble(editMsk.getText().toString());
        Double angka2 = Double.parseDouble(editKlr.getText().toString());
        Double perkalian = angka1 * angka2;
        editHasil.setText(perkalian.toString());
    }

    private void operatorpembagian() {
        Double angka1 = Double.parseDouble(editMsk.getText().toString());
        Double angka2 = Double.parseDouble(editKlr.getText().toString());
        Double pembagian = angka1 / angka2;
        editHasil.setText(pembagian.toString());
    }
}
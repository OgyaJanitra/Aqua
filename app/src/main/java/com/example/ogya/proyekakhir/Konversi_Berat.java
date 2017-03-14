package com.example.ogya.proyekakhir;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Konversi_Berat extends AppCompatActivity {
    Button btnTon, btnKg;
    EditText editGram, editHslBerat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi__berat);

        btnTon = (Button) findViewById(R.id.btnTon);
        btnKg = (Button) findViewById(R.id.btnKg);
        editGram = (EditText) findViewById(R.id.editGram);
        editHslBerat = (EditText) findViewById(R.id.editHasilBrt);

        btnTon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Berat = editGram.getText().toString();
                double Konversi = Double.parseDouble(Berat) / 1000;
                String Hasil = Double.toString(Konversi);
                editHslBerat.setText(Hasil);
            }
        });

        btnKg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Berat = editGram.getText().toString();
                double Konversi = Double.parseDouble(Berat) * 1000;
                String Hasil = Double.toString(Konversi);
                editHslBerat.setText(Hasil);
            }
        });
    }
}

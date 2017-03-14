package com.example.ogya.proyekakhir;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Kalkulator_2 extends AppCompatActivity {
    EditText editKal2, editHasilKal2;
    Button btnPangkat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_2);

        editKal2 = (EditText) findViewById(R.id.editKal2);
        editHasilKal2 = (EditText) findViewById(R.id.editHasilKal2);
        btnPangkat2 = (Button) findViewById(R.id.btnPangkat2);

        btnPangkat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pangkat2();
            }
        });
    }

    private void Pangkat2() {
        Double angka1 = Double.parseDouble(editKal2.getText().toString());
        Double Hasil = angka1 * angka1;
        editHasilKal2.setText(Hasil.toString());
    }
}

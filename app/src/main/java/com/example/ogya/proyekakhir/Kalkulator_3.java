package com.example.ogya.proyekakhir;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Kalkulator_3 extends AppCompatActivity {
    EditText editKal3, editHasilKal3;
    Button btnPangkat3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_3);

        editKal3 = (EditText) findViewById(R.id.editKal3);
        editHasilKal3 = (EditText) findViewById(R.id.editHasilKal3);
        btnPangkat3 = (Button) findViewById(R.id.btnPangkat3);

        btnPangkat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pangkat3();
            }
        });
    }

    private void Pangkat3() {
        Double angka1 = Double.parseDouble(editKal3.getText().toString());
        Double Hasil = angka1 * angka1 * angka1;
        editHasilKal3.setText(Hasil.toString());
    }
}

package com.example.ogya.proyekakhir;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Layar_Awal extends AppCompatActivity {
    Button btnRumus, btnKalkulator, btnKon, btnCredit, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layar__awal);

        btnRumus = (Button) findViewById(R.id.btnRumus);
        btnKalkulator = (Button) findViewById(R.id.btnKalkulator);
        btnKon = (Button) findViewById(R.id.btnKon);
        btnCredit = (Button) findViewById(R.id.btnCredit);
        btnExit = (Button) findViewById(R.id.btnExit);

        btnRumus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Layar_Awal.this, Rumus_Matematika.class));
            }
        });

        btnKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Layar_Awal.this, Kalkulator_Kalkulator.class));
            }
        });

        btnKon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Layar_Awal.this, Konversi.class));
            }
        });

        btnCredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Layar_Awal.this, Credit.class));
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit();
            }
        });
    }

    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Anda Benar Ingin Keluar?").setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).show();
    }
}

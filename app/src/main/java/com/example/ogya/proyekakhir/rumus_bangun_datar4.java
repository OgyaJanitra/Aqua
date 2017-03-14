package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class rumus_bangun_datar4 extends AppCompatActivity {
    Button btnPrev4Datar, btnFwd4Datar, btnHomeDatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus_bangun_datar4);

        btnPrev4Datar = (Button) findViewById(R.id.btnPrev4Datar);
        btnFwd4Datar = (Button) findViewById(R.id.btnFwd4Datar);
        btnHomeDatar = (Button) findViewById(R.id.btnHomeDatar);

        btnPrev4Datar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_bangun_datar4.this, rumus_bangun_datar3.class));
            }
        });

        btnHomeDatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_bangun_datar4.this, Rumus_Matematika.class));
            }
        });

        btnFwd4Datar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_bangun_datar4.this, rumus_Bangun_datar1.class));
            }
        });
    }
}

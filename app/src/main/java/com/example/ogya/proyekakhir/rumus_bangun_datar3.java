package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class rumus_bangun_datar3 extends AppCompatActivity {

    Button btnPrev3Datar, btnFwd3Datar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus_bangun_datar3);

        btnPrev3Datar = (Button) findViewById(R.id.btnPrev3Datar);
        btnFwd3Datar = (Button) findViewById(R.id.btnFwd3Datar);

        btnPrev3Datar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_bangun_datar3.this, rumus_bangun_datar2.class));
            }
        });

        btnFwd3Datar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_bangun_datar3.this, rumus_bangun_datar4.class));
            }
        });
    }
}

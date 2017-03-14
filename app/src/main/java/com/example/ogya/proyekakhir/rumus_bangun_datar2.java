package com.example.ogya.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class rumus_bangun_datar2 extends AppCompatActivity {
    Button btnPrev2Datar, btnFwd2Datar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus_bangun_datar2);

        btnPrev2Datar = (Button) findViewById(R.id.btnPrev2Datar);
        btnFwd2Datar = (Button) findViewById(R.id.btnFwd2Datar);

        btnFwd2Datar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_bangun_datar2.this, rumus_bangun_datar3.class));
            }
        });

        btnPrev2Datar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rumus_bangun_datar2.this, rumus_Bangun_datar1.class));
            }
        });
    }
}

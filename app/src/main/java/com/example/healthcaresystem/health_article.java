package com.example.healthcaresystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.healthcaresystem.R;
import com.example.healthcaresystem.Home;

public class health_article extends AppCompatActivity {

    Button btnhealth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_article);

        btnhealth = findViewById(R.id.buttonMedBack1);

        btnhealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(health_article.this, Home.class));

            }
        });
    }
}


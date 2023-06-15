package com.example.healthcaresystem;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.healthcaresystem.R;
import com.example.healthcaresystem.health_article;
import com.example.healthcaresystem.find_doctor;
import com.example.healthcaresystem.buy_medicine;
import com.example.healthcaresystem.login_page;

public class Home extends AppCompatActivity {

    Button btnHealthArticle, btnFindDoctor, btnBuyMedicine, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnHealthArticle = findViewById(R.id.btnHealthArticle);
        btnFindDoctor = findViewById(R.id.btnFindDoctor);
        btnBuyMedicine = findViewById(R.id.btnBuyMedicine);
        btnLogout = findViewById(R.id.btnLogout);

        btnHealthArticle.setOnClickListener(v ->
                startActivity(new Intent(Home.this, health_article.class)));

        btnFindDoctor.setOnClickListener(v ->
                startActivity(new Intent(Home.this, find_doctor.class)));

        btnBuyMedicine.setOnClickListener(v ->
                startActivity(new Intent(Home.this, buy_medicine.class)));

        btnLogout.setOnClickListener(v ->
                startActivity(new Intent(Home.this, login_page.class)));
    }
}

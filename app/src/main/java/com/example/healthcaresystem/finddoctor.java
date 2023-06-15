package com.example.healthcaresystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.healthcaresystem.R;

public class finddoctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finddoctor);

        CardView exit=findViewById(R.id.cardFDBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(finddoctor.this, Home.class));
            }
        });

        CardView familyPhysician=findViewById(R.id.cardFDFamilyPhysician);
        familyPhysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(finddoctor.this, doctordetails.class);
                it.putExtra("title", "familyPhysician");
                startActivity(it);
            }
        });
        CardView dietician=findViewById(R.id.cardFDDietician);
        dietician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(finddoctor.this, doctordetails.class);
                it.putExtra("title", "dietician");
                startActivity(it);
            }
        });

        CardView dentist=findViewById(R.id.cardFDDentist);
        dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(finddoctor.this, doctordetails.class);
                it.putExtra("title", "Dentist");
                startActivity(it);
            }
        });

    }
}

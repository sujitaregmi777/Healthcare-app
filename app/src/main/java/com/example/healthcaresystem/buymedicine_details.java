package com.example.healthcaresystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.healthcaresystem.R;

public class buymedicine_details extends AppCompatActivity {


    TextView tvmed2, tvmed1;
    EditText tv22;
    Button btnMedBack1, BtnMedCart2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buymedicine_details);

        tvmed2 = findViewById(R.id.TextViewmed2);
        tv22 = findViewById(R.id.editTextMedName);
        tvmed1 = findViewById(R.id.tvmed3);
        tv22.setKeyListener(null);
        btnMedBack1 = findViewById(R.id.backmed);
        BtnMedCart2 = findViewById(R.id.buymed);

        Intent intent = getIntent();
        tvmed2.setText(intent.getStringExtra("text1"));
        tv22.setText(intent.getStringExtra("text2"));
        tvmed1.setText("Fees:" + intent.getStringExtra("text3") + "/-");

        btnMedBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(buymedicine_details.this, buy_medicine.class));
            }
        });

    }
}

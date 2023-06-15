package com.example.healthcaresystem;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.healthcaresystem.R;

import java.util.ArrayList;
import java.util.HashMap;

public class buy_medicine extends AppCompatActivity {

    private String [][] packages={
            {"Uprise-03 1000iu capsule","","","","50"},
            {"Healthvit chromium picolinet 200mcg capsule","","","","305"},
            {"Vitamin C complex capsule","","","","440"},
            {"Vitamin B complex capsule","","","","500"},
            {"Dolo 650 tablet ","","","","30"},


    };

    private String [] packages_details={
            "building and keeping the bones and teeth strong\n"+
                    "Reduces fatigue/ stress and muscular pain\n",
            "Chromium is an essential trace mineral that plays an improtant role in helping insulin regulation\n",
            "Helps in formation of red blood cell\n"+
                    "Maintains healthy nervous system\n",
            "It promotes health as well as skin benefit\n"+
                    "It helps reduce skin blemish and pigmentation\n",
            "Dolo 650 tablet helps relieve pain and fever by blocking the release of chemicals"



    };
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    ListView lst;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_medicine);

        lst=findViewById(R.id.ListViewmed);
        btnback=findViewById(R.id.buttonMedBack);


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(buy_medicine.this, Home.class));
            }
        });

        list=new ArrayList();
        for(int i=0; i<packages.length; i++){
            item=new HashMap<String, String>();
            item.put("line1",  packages[i][0]);
            item.put("line2", packages[i][1]);
            item.put("line3", packages[i][2]);
            item.put("line4", packages[i][3]);
            item.put("line5", "Fees:"+packages[i][4]+"/-");
            list.add(item);

        }
        sa=new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1", "line2", "line3","line4","line5"},
                new int[]{R.id.line_a, R.id.line_b,R.id.line_c, R.id.line_d,R.id.line_e}
        );
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent it = new Intent(buy_medicine.this, buymedicine_details.class);
                it.putExtra("text1", packages[i][0]);
                it.putExtra("text2", packages_details[i]);
                it.putExtra("text3", packages[i][4]);
                startActivity(it);
            }
        });
    }}

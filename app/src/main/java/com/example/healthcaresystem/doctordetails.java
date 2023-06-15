package com.example.healthcaresystem;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.healthcaresystem.R;

import java.util.ArrayList;
import java.util.HashMap;

public class doctordetails extends AppCompatActivity {
    private String[][] doctor_details1 =
            {
                    {"Doctor Name: Bibek Poudel", "Hospital Address:lekhnath","Exp:5yrs","mobile no:9844227859","500"},
                    {"Doctor Name: Anisha Poudel", "Hospital Address:pokhara","Exp:5yrs","mobile no:9844267585","600"},
                    {"Doctor Name: kamala Adhikari", "Hospital Address:lamachaur","Exp:5yrs","mobile no:9844347859","700"},
                    {"Doctor Name: sirek pokhrel", "Hospital Address:sisuwa","Exp:5yrs","mobile no:9844227836","800"}

            };

    private String[][] doctor_details2 =
            {
                    {"Doctor Name: Arati Regmi", "Hospital Address:lekhnath","Exp:5yrs","mobile no:9844337859","500"},
                    {"Doctor Name: Susan Gurung", "Hospital Address:pokhara","Exp:5yrs","mobile no:9844267585","600"},
                    {"Doctor Name: Rekha Wagle", "Hospital Address:lamachaur","Exp:5yrs","mobile no:9844347569","700"},
                    {"Doctor Name: sheala Koirala", "Hospital Address:sisuwa","Exp:5yrs","mobile no:9844227643","800"}

            };
    private String[][] doctor_details3 =
            {
                    {"Doctor Name: Vidhya Shrestha", "Hospital Address:lekhnath","Exp:5yrs","mobile no:9844227835","500"},
                    {"Doctor Name: Laxmi KC", "Hospital Address:pokhara","Exp:5yrs","mobile no:9844267512","600"},
                    {"Doctor Name: Suman Dhungana", "Hospital Address:lamachaur","Exp:5yrs","mobile no:9844347832","700"},
                    {"Doctor Name: Renuka Lamsal", "Hospital Address:sisuwa","Exp:5yrs","mobile no:9844227847","800"}

            };



    TextView tv;
    Button btn;
    String[][] doctor_details ={};
    HashMap<String, String> item;
    ArrayList list;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctordetails);
        tv=findViewById(R.id.textViewODTitle);
        btn=findViewById(R.id.buttonODBack);

        Intent it=getIntent();
        String title=it.getStringExtra("title");
        tv.setText(title);

        if(title.compareTo("familyPhysician")==0)
            doctor_details =doctor_details1;
        else
        if(title.compareTo("dietician")==0)
            doctor_details =doctor_details2;
        else
            doctor_details =doctor_details3;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(doctordetails.this, finddoctor.class));

            }
        });
        list=new ArrayList();
        for(int i=0; i<doctor_details.length; i++){
            item=new HashMap<String, String>();
            item.put("line1", doctor_details[i][0]);
            item.put("line2", doctor_details[i][1]);
            item.put("line3", doctor_details[i][2]);
            item.put("line4", doctor_details[i][3]);
            item.put("line5", "Fees:"+doctor_details[i][4]+"/-");
            list.add(item);
        }
        sa=new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1", "line2", "line3","line4","line5"},
                new int[]{R.id.line_a, R.id.line_b,R.id.line_c, R.id.line_d,R.id.line_e}
        );
        ListView lst=findViewById(R.id.ListViewOD);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent it = new Intent(doctordetails.this, book_appointment.class);
                it.putExtra("text1", title);
                it.putExtra("text2", doctor_details[i][0]);
                it.putExtra("text3", doctor_details[i][1]);
                it.putExtra("text4", doctor_details[i][3]);
                it.putExtra("text5", doctor_details[i][4]);
                startActivity(it);

            }
        });
    }
}

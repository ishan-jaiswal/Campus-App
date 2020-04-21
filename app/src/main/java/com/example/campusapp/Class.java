package com.example.campusapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Class extends AppCompatActivity {
    private String day[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    private Spinner spinner;
    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);
        spinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Class.this,
                android.R.layout.simple_spinner_item,day);
        t1=(TextView)findViewById(R.id.textView12);
        t2=(TextView)findViewById(R.id.textView10);
        t3=(TextView)findViewById(R.id.textView11);
        t4=(TextView)findViewById(R.id.textView9);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, final int i, long l)
            {
                t4.setText("");
               if (i==0)
               {
                   t1.setText("Automata Theory and Finite Languages");
                   t2.setText("Operating System");
                   t4.setText("");
                   t1.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           t4.setText("The class is at H352. Time : 09:10 - 12:00");
                       }
                   });
                   t3.setText("");
                   t2.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           t4.setText("The class is at W102. Time : 13:10 - 16:00");
                       }
                   });
               }
               else if (i==1)
               {
                   t1.setText("Cyber Security");
                   t2.setText("");
                   t1.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           t4.setText("The class is at C212. Time : 09:10 - 12:00");
                       }
                   });
                   t3.setText("");
               }
               else if (i==2)
               {
                   t1.setText("Network Technology");
                   t2.setText("");
                   t1.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           t4.setText("The class is at C107. Time : 13:10 - 16:00");
                       }
                   });
                   t3.setText("");
               }
               else if (i==3)
               {
                   t1.setText("High Performance Computer Architecture");
                   t1.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           t4.setText("The class is at C211. Time : 09:10 - 12:00");
                       }
                   });
                   t3.setText("");
               }
               else if (i==4)
               {
                   t1.setText("Microcontroller");
                   t2.setText("Software Engineering");
                   t3.setText("");
                   t1.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           t4.setText("The class is at W100. Time : 09:10 - 12:00");
                       }
                   });
                   t2.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           t4.setText("The class is at W100. Time : 13:10 - 16:00");
                       }
                   });
               }
               else if (i==5)
               {
                   t1.setText("Tools and Technique Lab");
                   t2.setText("Professional Ethics & Code of Conduct");
                   t3.setText("Digital Signal Processing Speech");
                   t1.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           t4.setText("The class is at W100. Time : 09:10 - 10:00");
                       }
                   });
                   t2.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           t4.setText("The class is at W100. Time : 11:10 - 12:00");
                       }
                   });
                    t3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            t4.setText("The class is at C219. Time : 13:10 - 16:00");
                        }
                    });
               }


            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t3.setText("");
            }
        });
    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}

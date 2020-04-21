package com.example.campusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Bus extends AppCompatActivity
{
    private final int free_red[][]={{420,455,500,550,730,860,910,985,1030,1100,1200,1275},
            {422,455,507,552,732,862,912,987,1037,1102,1202,1277},
            {425,460,512,555,735,865,915,996,1042,1105,0,1280},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {433,468,523,563,743,873,923,1000,1048,1113,1213,1294},
            {440,475,528,568,748,878,928,1005,1055,1118,1228,1299},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {450,488,538,578,758,888,938,1115,1063,1128,1238,1311},
            {453,491,541,581,761,891,941,1018,1068,1131,1241,1314},
            {455,493,543,583,763,893,943,1020,1068,1133,1243,1316}};
    private final int paid[][]={{565,685,805},
            {567,687,807},
            {570,690,810},
            {0,0,0},
            {575,695,815},
            {600,720,840},
            {0,0,0},
            {0,0,0},
            {615,735,855},
            {618,738,858},
            {620,740,860}};
    private final int free_shuttle[][]={{440,495,630,740,860,930,1040,1150,1200,1275,1320},
            {442,497,632,742,862,932,1042,1152,1202,1277,1322},
            {0,502,635,0,865,0,0,1155,1205,1280,1328},
            {454,516,0,751,0,944,1051,0,1224,0,1341},
            {466,528,643,763,873,955,1063,1167,1230,1294,1353},
            {471,533,648,768,878,960,1068,1172,1244,1294,1365},
            {0,0,653,773,0,967,1073,0,1201,0,0},
            {0,0,655,775,0,972,1078,0,1250,0,0},
            {481,543,670,790,888,984,1090,1182,1265,1311,1372},
            {484,546,673,790,891,987,1093,1185,1273,1314,1372},
            {486,548,675,795,893,989,1095,1187,1273,1316,1377}};
    private String stops[]={"NHU Bus Stop","NHU Yuan Chi/Jui Tsun Dormitory","Ji Xian Lou","CCU University","Nanhua Hall","Dalin Train Station","PXMart","Coach Station","Ji Xian Lou","NHU Yuan Chi/Jui Tsun Dormitory","NHU Bus Stop"};
    private Spinner from,to;
    private Button freered,freeshuttle,paid1;
    private TextView t1,t2,t3,t4;
    private int fromn,ton;
    private Long curtime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
        from=(Spinner)findViewById(R.id.from);
        to=(Spinner)findViewById(R.id.to);
        freered=(Button)findViewById(R.id.freered);
        freeshuttle=(Button)findViewById(R.id.freeshuttle);
        paid1=(Button)findViewById(R.id.paid);
        t1=(TextView)findViewById(R.id.textView3);
        t2=(TextView)findViewById(R.id.textView4);
        t3=(TextView)findViewById(R.id.textView6);
        t4=(TextView)findViewById(R.id.textView5);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Bus.this,
                android.R.layout.simple_spinner_item,stops);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        from.setAdapter(adapter);
        from.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                fromn=i;
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {
                fromn=-1;
            }
        });
        to.setAdapter(adapter);
        to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ton=i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                ton=-1;
            }
        });
        freered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                if (fromn>ton)
                {
                    Toast.makeText(getApplicationContext(),"Error.To location should be after From location.",Toast.LENGTH_LONG).show();
                }
                else if (fromn==ton)
                {
                    Toast.makeText(getApplicationContext(),"Same places selected",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    t4.setText("Note: These buses do not run on weekends.");
                    curtime=(System.currentTimeMillis())/60000;
                    int j=0;
                    for (int i=0;i<=11;i++)
                    {
                        if(free_red[fromn][i]>=curtime)
                        {
                            for (int r=i;r<=11;r++)
                            {
                                if (free_red[ton][r]>=curtime)
                                {
                                    t1.setText("Next bus from "+stops[fromn]+" is at "+ free_red[fromn][i]/60+":"+free_red[fromn][i]%60);
                                    t2.setText("It will reach "+stops[ton]+" at "+free_red[ton][r]/60+":"+free_red[ton][r]%60);
                                    j=1;
                                    break;
                                }
                            }
                        }
                        if (j==1)
                            break;
                    }
                    if (j==0)
                    {
                        t3.setText("There is no bus.");
                    }
                }
            }
        });
        freeshuttle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                if (fromn>ton)
                {
                    Toast.makeText(getApplicationContext(),"Error.To location should be after From location.",Toast.LENGTH_LONG).show();
                }
                else if (fromn==ton)
                {
                    Toast.makeText(getApplicationContext(),"Same places selected",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    t4.setText("Note: These buses do not run on Sunday(21:15 -21:56) and on Friday(19:10-19:47).");
                    curtime=(System.currentTimeMillis())/600;
                    int j=0;
                    for (int i=0;i<=10;i++)
                    {
                        if(free_shuttle[fromn][i]>=curtime)
                        {
                            for (int r=i;r<=10;r++)
                            {
                                if (free_shuttle[ton][r]>=curtime)
                                {
                                    t1.setText("Next bus from "+stops[fromn]+" is at "+free_shuttle[fromn][i]/60+":"+free_shuttle[fromn][i]%60);
                                    t2.setText("It will reach "+stops[ton]+" at "+free_shuttle[ton][r]/60+":"+free_shuttle[ton][r]%60);
                                    j=1;
                                    break;
                                }
                            }
                        }
                        if (j==1)
                            break;
                    }
                    if (j==0)
                    {
                        t3.setText("There is no bus.");
                    }
                }
            }
        });
        paid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                if (fromn>ton)
                {
                    Toast.makeText(getApplicationContext(),"Error.To location should be after From location.",Toast.LENGTH_LONG).show();
                }
                else if (fromn==ton)
                {
                    Toast.makeText(getApplicationContext(),"Same places selected",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    curtime=(System.currentTimeMillis())/600;
                    int j=0;
                    for (int i=0;i<=2;i++)
                    {
                        if(paid[fromn][i]>=curtime)
                        {
                            for (int r=i;r<=2;r++)
                            {
                                if (paid[ton][r]>=curtime)
                                {
                                    t1.setText("Next bus from "+stops[fromn]+" is at "+paid[fromn][i]/60+":"+paid[fromn][i]%60);
                                    t2.setText("It will reach "+stops[ton]+" at "+paid[ton][r]/60+":"+paid[ton][r]%60);
                                    j=1;
                                    break;
                                }
                            }
                        }
                        if (j==1)
                            break;
                    }
                    if (j==0)
                    {
                        t3.setText("There is no bus.");
                    }
                }
            }
        });
    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}

package com.example.campusapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Attendance extends AppCompatActivity {
    DatabaseHelperAttendance myDb;
    private Button b,b1,b2,b3,b11,b12,b13,b21,b22,b23,b31,b32,b33,b0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        myDb = new DatabaseHelperAttendance(this);
        b=(Button)findViewById(R.id.button14);
        b1=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById(R.id.button4);
        b11=(Button)findViewById(R.id.button5);
        b12=(Button)findViewById(R.id.button6);
        b13=(Button)findViewById(R.id.button7);
        b21=(Button)findViewById(R.id.button8);
        b22=(Button)findViewById(R.id.button10);
        b23=(Button)findViewById(R.id.button9);
        b31=(Button)findViewById(R.id.button11);
        b32=(Button)findViewById(R.id.button12);
        b33=(Button)findViewById(R.id.button13);
        b0=(Button)findViewById(R.id.button15);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDb.insertData("1","1","1","1");
                myDb.insertData("2","1","1","1");
                myDb.insertData("3","1","1","1");
                myDb.insertData("4","1","1","1");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                String id=res.getString(0);
                int pr=Integer.parseInt(res.getString(1))+1;
                int ab=Integer.parseInt(res.getString(2));
                int tot=Integer.parseInt(res.getString(3))+1;
                myDb.updateData(id,Integer.toString(pr),Integer.toString(ab),Integer.toString(tot));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                String id=res.getString(0);
                int pr=Integer.parseInt(res.getString(1));
                int ab=Integer.parseInt(res.getString(2))+1;
                int tot=Integer.parseInt(res.getString(3))+1;
                myDb.updateData(id,Integer.toString(pr),Integer.toString(ab),Integer.toString(tot));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                String id=res.getString(0);
                myDb.updateData(id,Integer.toString(1),Integer.toString(1),Integer.toString(1));
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                res.moveToNext();
                String id=res.getString(0);
                int pr=Integer.parseInt(res.getString(1))+1;
                int ab=Integer.parseInt(res.getString(2));
                int tot=Integer.parseInt(res.getString(3))+1;
                myDb.updateData(id,Integer.toString(pr),Integer.toString(ab),Integer.toString(tot));
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                res.moveToNext();
                String id=res.getString(0);
                int pr=Integer.parseInt(res.getString(1));
                int ab=Integer.parseInt(res.getString(2))+1;
                int tot=Integer.parseInt(res.getString(3))+1;
                myDb.updateData(id,Integer.toString(pr),Integer.toString(ab),Integer.toString(tot));
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                res.moveToNext();
                String id=res.getString(0);
                myDb.updateData(id,Integer.toString(1),Integer.toString(1),Integer.toString(1));
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                res.moveToNext();
                res.moveToNext();
                String id=res.getString(0);
                int pr=Integer.parseInt(res.getString(1))+1;
                int ab=Integer.parseInt(res.getString(2));
                int tot=Integer.parseInt(res.getString(3))+1;
                myDb.updateData(id,Integer.toString(pr),Integer.toString(ab),Integer.toString(tot));
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                res.moveToNext();
                res.moveToNext();
                String id=res.getString(0);
                int pr=Integer.parseInt(res.getString(1));
                int ab=Integer.parseInt(res.getString(2))+1;
                int tot=Integer.parseInt(res.getString(3))+1;
                myDb.updateData(id,Integer.toString(pr),Integer.toString(ab),Integer.toString(tot));
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                res.moveToNext();
                res.moveToNext();
                String id=res.getString(0);
                myDb.updateData(id,Integer.toString(1),Integer.toString(1),Integer.toString(1));
            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                res.moveToNext();
                res.moveToNext();
                res.moveToNext();
                String id=res.getString(0);
                int pr=Integer.parseInt(res.getString(1))+1;
                int ab=Integer.parseInt(res.getString(2));
                int tot=Integer.parseInt(res.getString(3))+1;
                myDb.updateData(id,Integer.toString(pr),Integer.toString(ab),Integer.toString(tot));
            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                res.moveToNext();
                res.moveToNext();
                res.moveToNext();
                String id=res.getString(0);
                int pr=Integer.parseInt(res.getString(1));
                int ab=Integer.parseInt(res.getString(2))+1;
                int tot=Integer.parseInt(res.getString(3))+1;
                myDb.updateData(id,Integer.toString(pr),Integer.toString(ab),Integer.toString(tot));
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                res.moveToNext();
                res.moveToNext();
                res.moveToNext();
                String id=res.getString(0);
                myDb.updateData(id,Integer.toString(1),Integer.toString(1),Integer.toString(1));
            }
        });
        viewAll();
    }

    public void viewAll() {
        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getAllData();
                        if(res.getCount() == 0) {
                            showMessage("Error","Nothing found");
                            return;
                        }
                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("Id :"+ res.getString(0)+"\n");
                            buffer.append("Present :"+ res.getString(1)+"\n");
                            buffer.append("Absent :"+ res.getString(2)+"\n");
                            buffer.append("Total :"+ res.getString(3)+"\n\n");
                        }
                        showMessage("Data",buffer.toString());
                    }
                }
        );
    }
    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}


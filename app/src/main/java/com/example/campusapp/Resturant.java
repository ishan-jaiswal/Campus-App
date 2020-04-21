package com.example.campusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Resturant extends AppCompatActivity {
    private String choice[]={"Foods","Beverages"};
    private Spinner spinner;
    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t13,t12,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant);
        spinner=(Spinner)findViewById(R.id.spinner);
        t1=(TextView)findViewById(R.id.textView1);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        t4=(TextView)findViewById(R.id.textView4);
        t5=(TextView)findViewById(R.id.textView5);
        t6=(TextView)findViewById(R.id.textView6);
        t7=(TextView)findViewById(R.id.textView7);
        t8=(TextView)findViewById(R.id.textView8);
        t9=(TextView)findViewById(R.id.textView9);
        t10=(TextView)findViewById(R.id.textView10);
        t11=(TextView)findViewById(R.id.textView11);
        t12=(TextView)findViewById(R.id.textView12);
        t13=(TextView)findViewById(R.id.textView13);
        t14=(TextView)findViewById(R.id.textView14);
        t15=(TextView)findViewById(R.id.textView15);
        t16=(TextView)findViewById(R.id.textView16);
        t17=(TextView)findViewById(R.id.textView17);
        t18=(TextView)findViewById(R.id.textView19);
        t19=(TextView)findViewById(R.id.textView20);
        t20=(TextView)findViewById(R.id.textView21);
        t21=(TextView)findViewById(R.id.textView22);
        t22=(TextView)findViewById(R.id.textView23);
        t23=(TextView)findViewById(R.id.textView24);
        t24=(TextView)findViewById(R.id.textView25);
        t25=(TextView)findViewById(R.id.textView26);
        t26=(TextView)findViewById(R.id.textView27);
        t27=(TextView)findViewById(R.id.textView28);
        t28=(TextView)findViewById(R.id.textView29);
        t29=(TextView)findViewById(R.id.textView30);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Resturant.this,
                android.R.layout.simple_spinner_item,choice);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    t1.setText("Name            Price");
                    t2.setText("CABBAGES\t\t\t10");
                    t3.setText("TEA EGGS\t\t\t10");
                    t4.setText("TOFU\t\t\t\t10");
                    t5.setText("TOFU GRAVY\t\t\t10");
                    t6.setText("VEGGIES\t\t\t\t10");
                    t7.setText("VEG GRAVY\t\t\t10");
                    t8.setText("PLAIN NOODLES\t\t\t10");
                    t9.setText("FRIED NOODLES\t\t\t10");
                    t10.setText("FRIED CHICKEN BREAST\t\t10");
                    t11.setText("FRIED PORK\t\t\t10");
                    t12.setText("POACHED EGG\t\t\t10");
                    t13.setText("FRENCH FRIES\t\t\t10");
                    t14.setText("FISH\t\t\t\t10");
                    t15.setText("RICE\t\t\t\t10");
                    t16.setText("CARROTS\t\t\t\t10");
                    t17.setText("FRIED MILK\t\t\t10");
                    t18.setText("CHOCOLATE TOAST\t\t\t25");
                    t19.setText("BUTTER TOAST\t\t\t25");
                    t20.setText("BUTTER BISCUIT TOAST\t\t25");
                    t21.setText("STRAWBERRY TOAST\t\t25");
                    t22.setText("PEANUT TOAST\t\t\t25");
                    t23.setText("BUTTER PEPPER TOAST\t\t25");
                    t24.setText("CAULIFLOWER\t\t\t10");
                    t25.setText("BOTTLECORD\t\t\t10");
                    t26.setText("SOYABEANS\t\t\t10");
                    t27.setText("FRIED TOFU\t\t\t10");
                    t28.setText("RAMEN\t\t\t\t10");
                    t29.setText("SMALL HOT DOGS\t\t\t10");


                }
                else {
                    t1.setText("Name                Price");
                    t2.setText("PLUM/COKE SPRITE\t\t30");
                    t3.setText("HONEY ALOE \t\t \t30");
                    t4.setText("BLACK/GREEN TEA\t\t\t30");
                    t5.setText("MICRO-PLUM JUICE\t\t35");
                    t6.setText("PLUM VINEGAR\t\t\t35");
                    t7.setText("CRANBERRY VINEGAR\t\t35");
                    t8.setText("GREEN APPLE SPRITE\t\t35");
                    t9.setText("PINEAPPLE SPRITE\t\t35");
                    t10.setText("YAKULT SPRITE\t\t\t35");
                    t11.setText("TARO MILK\t\t\t35");
                    t12.setText("PEANUT MILK\t\t\t35");
                    t13.setText("EGG MILK\t\t\t35");
                    t14.setText("GREEN MILK\t\t\t35");
                    t15.setText("HONEYDEW MELON MILK\t\t35");
                    t16.setText("OVALTINE\t\t\t35");
                    t17.setText("ICE COFFEE\t\t\t35");
                    t18.setText("HEINEKEN GREEN TEA \t\t40");
                    t19.setText("FRUIT JUICE\t\t\t40");
                    t20.setText("FINLAND JUICE\t\t\t40");
                    t21.setText("PLUM LEMON\t\t\t40");
                    t22.setText("HONEY LEMON\t\t\t40");
                    t23.setText("KUMQUAT LEMON \t\t\t45");
                    t24.setText("PASSION FRUIT JUICE\t\t25");
                    t25.setText("EBONY JUICE\t\t\t25");
                    t26.setText("STRAWBERRY JUICE\t\t25");
                    t27.setText("ORANGE JUICE\t\t\t25");
                    t28.setText("SOUR PLUM JUICE\t\t\t25");
                    t29.setText("GRAPE JUICE\t\t\t25");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setText("");
                t10.setText("");
                t11.setText("");
                t12.setText("");
                t13.setText("");
                t14.setText("");
                t15.setText("");
                t16.setText("");
                t17.setText("");
                t18.setText("");
                t19.setText("");
                t20.setText("");
                t21.setText("");
                t22.setText("");
                t23.setText("");
                t24.setText("");
                t25.setText("");
                t26.setText("");
                t27.setText("");
                t28.setText("");
                t29.setText("");
            }
        });
    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}

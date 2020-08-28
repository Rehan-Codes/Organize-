package com.example.heha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Button A1=(Button)findViewById(R.id.A1);
        Button A2=(Button)findViewById(R.id.A2);
        Button A3=(Button)findViewById(R.id.A3);
        Button A4=(Button)findViewById(R.id.A4);
        Button A5=(Button)findViewById(R.id.A5);
        Button A6=(Button)findViewById(R.id.A6);
        Button A7=(Button)findViewById(R.id.A7);
        Button A8=(Button)findViewById(R.id.A8);
        Button A9=(Button)findViewById(R.id.A9);
        Button A10=(Button)findViewById(R.id.A10);

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(Activity3.this,Activity7.class);
                startActivity(int1);
            }
        });

        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(Activity3.this,Activity8.class);
                startActivity(int2);
            }
        });

        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(Activity3.this,Activity9.class);
                startActivity(int3);
            }
        });

        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(Activity3.this,Activity10.class);
                startActivity(int4);
            }
        });
        A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5=new Intent(Activity3.this,Activity11.class);
                startActivity(int5);
            }
        });
        A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(Activity3.this,Activity12.class);
                startActivity(int6);
            }
        });
        A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7=new Intent(Activity3.this,Activity13.class);
                startActivity(int7);
            }
        });
        A8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int8=new Intent(Activity3.this,Activity14.class);
                startActivity(int8);
            }
        });
        A9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int9=new Intent(Activity3.this,Activity15.class);
                startActivity(int9);
            }
        });
        A10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int10=new Intent(Activity3.this,Activity16.class);
                startActivity(int10);
            }
        });
    }
}
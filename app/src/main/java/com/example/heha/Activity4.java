package com.example.heha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        Button B1=(Button)findViewById(R.id.B1);
        Button B2=(Button)findViewById(R.id.B2);
        Button B3=(Button)findViewById(R.id.B3);
        Button B4=(Button)findViewById(R.id.B4);
        Button B5=(Button)findViewById(R.id.B5);
        Button B6=(Button)findViewById(R.id.B6);
        Button B7=(Button)findViewById(R.id.B7);
        Button B8=(Button)findViewById(R.id.B8);
        Button B9=(Button)findViewById(R.id.B9);
        Button B10=(Button)findViewById(R.id.B10);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(Activity4.this,Activity17.class);
                startActivity(int1);
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(Activity4.this,Activity18.class);
                startActivity(int2);
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(Activity4.this,Activity19.class);
                startActivity(int3);
            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(Activity4.this,Activity20.class);
                startActivity(int4);
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5=new Intent(Activity4.this,Activity21.class);
                startActivity(int5);
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(Activity4.this,Activity22.class);
                startActivity(int6);
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7=new Intent(Activity4.this,Activity23.class);
                startActivity(int7);
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int8=new Intent(Activity4.this,Activity24.class);
                startActivity(int8);
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int9=new Intent(Activity4.this,Activity25.class);
                startActivity(int9);
            }
        });
        B10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int10=new Intent(Activity4.this,Activity26.class);
                startActivity(int10);
            }
        });
    }
}
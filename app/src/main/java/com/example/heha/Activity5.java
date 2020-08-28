package com.example.heha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        Button C1=(Button)findViewById(R.id.C1);
        Button C2=(Button)findViewById(R.id.C2);
        Button C3=(Button)findViewById(R.id.C3);
        Button C4=(Button)findViewById(R.id.C4);
        Button C5=(Button)findViewById(R.id.C5);
        Button C6=(Button)findViewById(R.id.C6);
        Button C7=(Button)findViewById(R.id.C7);
        Button C8=(Button)findViewById(R.id.C8);
        Button C9=(Button)findViewById(R.id.C9);
        Button C10=(Button)findViewById(R.id.C10);

        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(Activity5.this,Activity27.class);
                startActivity(int1);
            }
        });

        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(Activity5.this,Activity28.class);
                startActivity(int2);
            }
        });
        C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(Activity5.this,Activity29.class);
                startActivity(int3);
            }
        });

        C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(Activity5.this,Activity30.class);
                startActivity(int4);
            }
        });
        C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5=new Intent(Activity5.this,Activity31.class);
                startActivity(int5);
            }
        });
        C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(Activity5.this,Activity32.class);
                startActivity(int6);
            }
        });
        C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7=new Intent(Activity5.this,Activity33.class);
                startActivity(int7);
            }
        });
        C8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int8=new Intent(Activity5.this,Activity34.class);
                startActivity(int8);
            }
        });
        C9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int9=new Intent(Activity5.this,Activity35.class);
                startActivity(int9);
            }
        });
        C10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int10=new Intent(Activity5.this,Activity36.class);
                startActivity(int10);
            }
        });
    }
}
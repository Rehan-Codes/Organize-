package com.example.heha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        Button D1=(Button)findViewById(R.id.D1);
        Button D2=(Button)findViewById(R.id.D2);
        Button D3=(Button)findViewById(R.id.D3);
        Button D4=(Button)findViewById(R.id.D4);
        Button D5=(Button)findViewById(R.id.D5);
        Button D6=(Button)findViewById(R.id.D6);
        Button D7=(Button)findViewById(R.id.D7);
        Button D8=(Button)findViewById(R.id.D8);
        Button D9=(Button)findViewById(R.id.D9);
        Button D10=(Button)findViewById(R.id.D10);

        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(Activity6.this,Activity37.class);
                startActivity(int1);
            }
        });

        D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(Activity6.this,Activity38.class);
                startActivity(int2);
            }
        });
        D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(Activity6.this,Activity39.class);
                startActivity(int3);
            }
        });

        D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(Activity6.this,Activity40.class);
                startActivity(int4);
            }
        });
        D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5=new Intent(Activity6.this,Activity41.class);
                startActivity(int5);
            }
        });
        D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(Activity6.this,Activity42.class);
                startActivity(int6);
            }
        });
        D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7=new Intent(Activity6.this,Activity43.class);
                startActivity(int7);
            }
        });
        D8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int8=new Intent(Activity6.this,Activity44.class);
                startActivity(int8);
            }
        });
        D9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int9=new Intent(Activity6.this,Activity45.class);
                startActivity(int9);
            }
        });
        D10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int10=new Intent(Activity6.this,Activity46.class);
                startActivity(int10);
            }
        });
    }
}
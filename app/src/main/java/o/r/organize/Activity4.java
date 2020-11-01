package o.r.organize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.Organize.R;

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
                Intent int11=new Intent(Activity4.this,Activity17.class);
                startActivity(int11);
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int12=new Intent(Activity4.this,Activity18.class);
                startActivity(int12);
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int13=new Intent(Activity4.this,Activity19.class);
                startActivity(int13);
            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int14=new Intent(Activity4.this,Activity20.class);
                startActivity(int14);
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int15=new Intent(Activity4.this,Activity21.class);
                startActivity(int15);
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int16=new Intent(Activity4.this,Activity22.class);
                startActivity(int16);
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int17=new Intent(Activity4.this,Activity23.class);
                startActivity(int17);
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int18=new Intent(Activity4.this,Activity24.class);
                startActivity(int18);
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int19=new Intent(Activity4.this,Activity25.class);
                startActivity(int19);
            }
        });
        B10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int20=new Intent(Activity4.this,Activity26.class);
                startActivity(int20);
            }
        });
    }
}
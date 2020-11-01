package o.r.organize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.Organize.R;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button Cost=(Button)findViewById(R.id.Cost);
        Button Weight=(Button)findViewById(R.id.Weight);
        Button Size=(Button)findViewById(R.id.Size);

        Cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(Activity2.this,Activity3.class);
                startActivity(int1);
            }
        });

        Weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(Activity2.this,Activity4.class);
                startActivity(int2);
            }
        });

        Size.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(Activity2.this,Activity5.class);
                startActivity(int3);
            }
        });

    }
}
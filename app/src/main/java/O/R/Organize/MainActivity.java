package O.R.Organize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.Organize.R;

public class MainActivity extends AppCompatActivity {

    private Button button, btn2, buttonHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivityHelp();
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent (this, Activity2.class);
        startActivity(intent);
    }

    public void openActivityHelp(){
        Intent intent = new Intent (this, help.class);
        startActivity(intent);
    }
}
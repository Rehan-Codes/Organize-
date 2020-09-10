package com.example.heha;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.heha.Activity2;
import com.example.heha.R;

public class MainActivity extends AppCompatActivity {

    private Button button, btn2;

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
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Guide");
                alertDialog.setMessage("- Select one of the five categories\n- Select one of the levels\n- Sort the pictures according to the given requirements!");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent (this, Activity2.class);
        startActivity(intent);
    }
}
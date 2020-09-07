package com.example.heha;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.view.DragEvent;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.content.ClipData;
import android.os.Bundle;
import android.view.View;

public class Activity7 extends AppCompatActivity {

    LinearLayout target1, target2, target3, target4;
    Button test1, test2, test3, test4, btn1, btn2, btn3, btn4, submit, backToMenu, resetChange;;
    ImageView mImgCheck;
    int i = 0;
    int num1 = 0, num2 = 0, num3 = 0, num4=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_7);

        target1 = (LinearLayout) findViewById(R.id.target1);
        target2 = (LinearLayout) findViewById(R.id.target2);
        target3 = (LinearLayout) findViewById(R.id.target3);
        target4 = (LinearLayout) findViewById(R.id.target4);

        test1 = (Button) findViewById(R.id.test1);
        test2 = (Button) findViewById(R.id.test2);
        test3 = (Button) findViewById(R.id.test3);
        test4 = (Button) findViewById(R.id.test4);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        submit = (Button) findViewById(R.id.submit);

        target1.setOnDragListener(dragListenre);
        target2.setOnDragListener(dragListenre);
        target3.setOnDragListener(dragListenre);
        target4.setOnDragListener(dragListenre);

        btn1.setOnLongClickListener(longclickListener);
        btn2.setOnLongClickListener(longclickListener);
        btn3.setOnLongClickListener(longclickListener);
        btn4.setOnLongClickListener(longclickListener);

        backToMenu = (Button) findViewById(R.id.menu);
        resetChange = (Button) findViewById(R.id.Reset);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(num1 == 1 && num2 == 1 && num3 == 1 && num4 == 1)
                {
                    AlertDialog alertDialog = new AlertDialog.Builder(Activity7.this).create();
                    alertDialog.setTitle("Alert");
                    alertDialog.setMessage("Alert message to be shown");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();

                    mImgCheck = (ImageView) findViewById(R.id.imageView);
                    ((Animatable) mImgCheck.getDrawable()).start();
                }
                else {
                    AlertDialog alertDialog = new AlertDialog.Builder(Activity7.this).create();
                    alertDialog.setTitle("Alert");
                    alertDialog.setMessage("Oops Try Again!");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();

                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }

            }
        });

        backToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(Activity7.this,Activity2.class);
                startActivity(int2);
            }
        });

        resetChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });
        //test

    }

    View.OnLongClickListener longclickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data, myShadowBuilder, v, 0);
            return true;
        }
    };

    View.OnDragListener dragListenre;

    {
        dragListenre = new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                int dragEvent = event.getAction();

                final View view = (View) event.getLocalState();

                switch (dragEvent) {
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;
                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:

                        if (v.getId() == R.id.target1) {
                            if(view.getId() == R.id.btn1)
                            {
                                num1 = 1;
                            }
                            LinearLayout oldparent = (LinearLayout) view.getParent();
                            oldparent.removeView(view);
                            LinearLayout newParent = (LinearLayout) v;
                            test1.setVisibility(View.GONE);
                            newParent.addView(view);
                            i++;
                        } else if (v.getId() == R.id.target2) {
                            if(view.getId() == R.id.btn2)
                            {
                                num2 = 1;
                            }
                            LinearLayout oldparent = (LinearLayout) view.getParent();
                            oldparent.removeView(view);
                            LinearLayout newParent = (LinearLayout) v;
                            test2.setVisibility(View.GONE);
                            newParent.addView(view);
                            i++;
                        } else if (v.getId() == R.id.target3) {
                            if(view.getId() == R.id.btn3)
                            {
                                num3 = 1;
                            }
                            LinearLayout oldparent = (LinearLayout) view.getParent();
                            oldparent.removeView(view);
                            LinearLayout newParent = (LinearLayout) v;
                            test3.setVisibility(View.GONE);
                            newParent.addView(view);
                            i++;
                        } else if (v.getId() == R.id.target4) {
                            if(view.getId() == R.id.btn4)
                            {
                                num4 = 1;
                            }
                            LinearLayout oldparent = (LinearLayout) view.getParent();
                            oldparent.removeView(view);
                            LinearLayout newParent = (LinearLayout) v;
                            test4.setVisibility(View.GONE);
                            newParent.addView(view);
                            i++;
                        } else {
                            return false;
                        }
                        break;
                }
                return true;
            }
        };
    }
}
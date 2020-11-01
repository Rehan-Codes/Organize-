package O.R.Organize;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.LightingColorFilter;
import android.view.DragEvent;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.content.ClipData;
import android.os.Bundle;
import android.view.View;

import com.example.Organize.R;


public class Activity10 extends AppCompatActivity {
    //Random comment
    LinearLayout target1, target2, target3, target4;
    Button test1, test2, test3, test4, backToMenu, resetChange;
    ImageView btn1, btn2, btn3, btn4;
    int i = 0;
    int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_10);

        target1 = findViewById(R.id.target1);
        target2 = findViewById(R.id.target2);
        target3 = findViewById(R.id.target3);
        target4 = findViewById(R.id.target4);

        test1 = findViewById(R.id.test1);
        test2 = findViewById(R.id.test2);
        test3 = findViewById(R.id.test3);
        test4 = findViewById(R.id.test4);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        target1.setOnDragListener(dragListenre);
        target2.setOnDragListener(dragListenre);
        target3.setOnDragListener(dragListenre);
        target4.setOnDragListener(dragListenre);

        btn1.setOnLongClickListener(longclickListener);
        btn2.setOnLongClickListener(longclickListener);
        btn3.setOnLongClickListener(longclickListener);
        btn4.setOnLongClickListener(longclickListener);

        backToMenu = findViewById(R.id.menu);
        resetChange = findViewById(R.id.Reset);


        backToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(Activity10.this,Activity2.class);
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

                View view = (View) event.getLocalState();

                switch (dragEvent) {
                    case DragEvent.ACTION_DROP:

                        if (v.getId() == R.id.target1) {
                            if(view.getId() == R.id.btn1)
                            {
                                num1 = 1;
                            }
                            view.setOnLongClickListener(null);
                            v.setOnDragListener(null);
                            LinearLayout oldparent = (LinearLayout) view.getParent();
                            oldparent.removeView(view);
                            LinearLayout newParent = (LinearLayout) v;
                            test1.setVisibility(View.GONE);
                            newParent.addView(view);
                            i++;
                            checki(i);
                        } else if (v.getId() == R.id.target2) {
                            if(view.getId() == R.id.btn2)
                            {
                                num2 = 1;
                            }
                            view.setOnLongClickListener(null);
                            target2.setOnDragListener(null);
                            LinearLayout oldparent = (LinearLayout) view.getParent();
                            oldparent.removeView(view);
                            LinearLayout newParent = (LinearLayout) v;
                            test2.setVisibility(View.GONE);
                            newParent.addView(view);
                            i++;
                            checki(i);
                        } else if (v.getId() == R.id.target3) {
                            if(view.getId() == R.id.btn3)
                            {
                                num3 = 1;
                            }
                            view.setOnLongClickListener(null);
                            target3.setOnDragListener(null);
                            LinearLayout oldparent = (LinearLayout) view.getParent();
                            oldparent.removeView(view);
                            LinearLayout newParent = (LinearLayout) v;
                            test3.setVisibility(View.GONE);
                            newParent.addView(view);
                            i++;
                            checki(i);
                        } else if (v.getId() == R.id.target4) {
                            if(view.getId() == R.id.btn4)
                            {
                                num4 = 1;
                            }
                            view.setOnLongClickListener(null);
                            target4.setOnDragListener(null);
                            LinearLayout oldparent = (LinearLayout) view.getParent();
                            oldparent.removeView(view);
                            LinearLayout newParent = (LinearLayout) v;
                            btn4.refreshDrawableState();
                            test4.setVisibility(View.GONE);
                            newParent.addView(view);
                            i++;
                            checki(i);
                        } else {
                            return false;
                        }
                        break;
                }
                return true;
            }
        };
    }
    protected void checki(int i)
    {
        if(i==4) {
            if (num1 == 1 && num2 == 1 && num3 == 1 && num4 == 1) {
                AlertDialog alertDialog = new AlertDialog.Builder(Activity10.this).create();
                alertDialog.setTitle("Level Passed \u2713");
                alertDialog.setMessage("Apple MacBook Air (13-inch, 8GB RAM, 512GB SSD Storage) - $1-1.5k CAD\nXbox One S 1TB Console NEW - $450-500 CAD\nLG 260 L - $430-460 CAD\nPlayStation 4 Pro 1TB Console NEW - $360-400 CAD");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Next Level",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                Intent intent2 = new Intent(Activity10.this, Activity11.class);
                                startActivity(intent2);
                            }
                        });
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Back to Menu",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                Intent int3 = new Intent(Activity10.this, Activity2.class);
                                startActivity(int3);
                            }
                        });
                alertDialog.getWindow().getDecorView().getBackground().setColorFilter(new LightingColorFilter(0xFF4CAF50, 000000));
                alertDialog.show();
                Button btnPositive = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                Button btnNegative = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);

                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) btnPositive.getLayoutParams();
                layoutParams.weight = 10;
                btnPositive.setLayoutParams(layoutParams);
                btnNegative.setLayoutParams(layoutParams);
            } else {
                AlertDialog alertDialog = new AlertDialog.Builder(Activity10.this).create();
                alertDialog.setTitle("Incorrect!");
                alertDialog.setMessage("Try Again!");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "RESET",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = getIntent();
                                finish();
                                startActivity(intent);
                            }
                        });
                alertDialog.show();
                alertDialog.getWindow().getDecorView().getBackground().setColorFilter(new LightingColorFilter(0xFF44336, 00000));
                Button btnPositive = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                Button btnNegative = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);

                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) btnPositive.getLayoutParams();
                layoutParams.weight = 10;
                btnPositive.setLayoutParams(layoutParams);
                btnNegative.setLayoutParams(layoutParams);
            }


        }
    }
}
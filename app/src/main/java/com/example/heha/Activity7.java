package com.example.heha;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.graphics.Color;
import android.view.DragEvent;
import android.widget.Toast;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity7 extends AppCompatActivity {

    ImageView img, img_2;
    public View.OnDragListener nDragListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);



        img = findViewById(R.id.imageView);
        img_2 = findViewById(R.id.imageView2);

        MyDragEventListener nDragListener = new MyDragEventListener();
        img.setOnDragListener(nDragListener);
        img_2.setOnDragListener(nDragListener);
        img.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {

                ClipData.Item item = new ClipData.Item("Skull Dropped!!");

                ClipData dragData = new ClipData(
                        (CharSequence) v.getTag(),
                        new String[] {ClipDescription.MIMETYPE_TEXT_PLAIN},
                        item);

                View.DragShadowBuilder myShadow = new MyDragShadowBuilder(img);

                v.startDrag(dragData,myShadow, null, 0);

                return true;

            }
        });
}

protected class MyDragEventListener implements View.OnDragListener{
        public boolean onDrag(View v, DragEvent event) {

            final int action = event.getAction();

            switch(action) {

                case DragEvent.ACTION_DRAG_STARTED:

                if(event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {

                    v.setBackgroundColor(Color.BLUE);
                    v.invalidate();
                    return true;
                }
                return false;

                case DragEvent.ACTION_DRAG_ENTERED:

                v.setBackgroundColor(Color.GREEN);
                v.invalidate();

                return true;

                case DragEvent.ACTION_DRAG_LOCATION:

                    return true;

                case DragEvent.ACTION_DRAG_EXITED:

                    v.setBackgroundColor(Color.BLUE);
                    v.invalidate();

                    return true;

                    case DragEvent.ACTION_DROP:

                        ClipData.Item item = event.getClipData().getItemAt(0);

                        CharSequence dragData = item.getText();

                        Toast.makeText( Activity7.this, dragData, Toast.LENGTH_LONG).show();

                        v.setBackgroundColor(Color.WHITE);

                        v.invalidate();

                        return true;

                        case DragEvent.ACTION_DRAG_ENDED:

                            v.setBackgroundColor(Color.WHITE);

                        v.invalidate();

                            event.getResult();

                            return true;

                default:

                        Log.e( "DragDrop Example", "Unknown action type recieved by OnDraglistener");
                        break;
            }

            return false;
            }

        }
    }

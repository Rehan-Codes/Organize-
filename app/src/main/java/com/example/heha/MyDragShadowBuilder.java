package com.example.heha;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.graphics.Color;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MyDragShadowBuilder extends View.DragShadowBuilder {

    private static Drawable shadow;

    public MyDragShadowBuilder(View v) {

        super (v);
        shadow = new ColorDrawable(Color.LTGRAY);
    }

    @Override
    public void onProvideShadowMetrics (Point size, Point touch) {

        int width, height;

        width = getView().getWidth() / 2;
        height = getView().getHeight() / 2;

        shadow.setBounds(0, 0, width, height);

        size.set(width,height);
        touch.set(width / 2, height / 2);
    }

    @Override
    public void onDrawShadow(Canvas canvas) {
        shadow.draw(canvas);
    }

}

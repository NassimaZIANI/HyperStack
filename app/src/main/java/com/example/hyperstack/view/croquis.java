package com.example.hyperstack.view;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

import androidx.annotation.Nullable;

public class croquis extends View {

    public LayoutParams params;
    private Path path = new Path();
    private Paint pinceau = new Paint();

    public croquis(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        pinceau.setAntiAlias(true);
        pinceau.setColor(Color.BLACK);
        pinceau.setStyle(Paint.Style.STROKE);
        pinceau.setStrokeJoin(Paint.Join.ROUND);
        pinceau.setStrokeWidth(8f);


        params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
    }

}

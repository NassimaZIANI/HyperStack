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
    private Path dessin = new Path();
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
    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(dessin ,pinceau);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                dessin.moveTo(x,y);
                return true;
            case MotionEvent.ACTION_MOVE:
                dessin.lineTo(x,y);
                break;
            default:
                return false;
        }
        postInvalidate();
        return false;
    }
}

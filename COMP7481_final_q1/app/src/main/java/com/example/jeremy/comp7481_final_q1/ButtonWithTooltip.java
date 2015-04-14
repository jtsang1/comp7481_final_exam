package com.example.jeremy.comp7481_final_q1;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.Toast;


/**
 * TODO: document your custom view class.
 */
public class ButtonWithTooltip extends Button implements GestureDetector.OnGestureListener {
    private Context mContext;
    private GestureDetector gestureScanner;

    public ButtonWithTooltip(Context context) {

        super(context);

        mContext = context;
        gestureScanner = new GestureDetector(getContext(), this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        gestureScanner.onTouchEvent(event);
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(mContext, this.getText(), duration);
        toast.show();
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }


}

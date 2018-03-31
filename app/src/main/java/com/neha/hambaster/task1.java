package com.neha.hambaster;

import android.graphics.Color;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.support.v4.view.GestureDetectorCompat;
import android.view.View;


public class task1 extends AppCompatActivity implements  GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private TextView nehasmessage;
    private GestureDetectorCompat gestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        nehasmessage=(TextView) findViewById(R.id.nehasmessage);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);

        Button nehasbutton=(Button) findViewById(R.id.nehasbutton);
        nehasbutton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView nehasmessage=(TextView)findViewById(R.id.nehasmessage);
                        nehasmessage.setText("Click Me");
                    }
                }
        );

        nehasbutton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView nehasmessage=(TextView)findViewById(R.id.nehasmessage);
                        nehasmessage.setText("Changed on Long Click");
                        return true;
                    }
                }
        );

    }


    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        nehasmessage.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        nehasmessage.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        nehasmessage.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        nehasmessage.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        nehasmessage.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        nehasmessage.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        nehasmessage.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        nehasmessage.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        nehasmessage.setText("onFling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
package com.neha.hambaster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.transition.TransitionManager;

import static android.R.attr.tag;

public class Main6Activity extends AppCompatActivity {

    ViewGroup nehasLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        nehasLayout = (ViewGroup) findViewById(R.id.nehasLayout);

        nehasLayout.setOnTouchListener(
                new RelativeLayout.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent event) {
                        moveButton();
                        return true;
                    }

                }
        );
    }

    public void moveButton() {

        View nehasButton = findViewById(R.id.nehasButton);
        String tag = "nehaButton";
        Log.i(tag, nehasButton + "");

        TransitionManager.beginDelayedTransition(nehasLayout);

        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        nehasButton.setLayoutParams(positionRules);

        ViewGroup.LayoutParams sizeRules = nehasButton.getLayoutParams();
        sizeRules.width = 450;
        sizeRules.height = 300;
        nehasButton.setLayoutParams(sizeRules);

    }
}
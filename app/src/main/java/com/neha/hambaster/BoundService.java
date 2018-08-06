package com.neha.hambaster;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.os.Binder;
import android.content.ComponentName;
import android.content.ServiceConnection;
import com.neha.hambaster.MyService1.MyLocalBinder;

public class BoundService extends AppCompatActivity {

    MyService1 nehaservice;
    boolean iBound=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bound_service);

    }

}

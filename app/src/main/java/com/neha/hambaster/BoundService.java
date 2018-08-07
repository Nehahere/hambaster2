package com.neha.hambaster;

import android.os.Bundle;
import android.os.IBinder;
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
    boolean isBound=false;

    public void showTime(View view){
        String currentTime=nehaservice.getCurrentTime();
        TextView text=(TextView) findViewById(R.id.text);
        text.setText(currentTime);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bound_service);
        Intent i=new Intent(this,MyService1.class);
        bindService(i,nehasConnection,Context.BIND_AUTO_CREATE);
    }

    private ServiceConnection nehasConnection=new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder service) {
            MyLocalBinder Binder=(MyLocalBinder)service;
            nehaservice=Binder.getService();
            isBound=true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            isBound=false;
        }
    };

}

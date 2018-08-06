package com.neha.hambaster;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG="com.neha.hambaster";

    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"onStartCommand method is called");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    long futureTime =System.currentTimeMillis()+5000;
                    while (System.currentTimeMillis()<futureTime){
                        synchronized (this){
                        try{
                            wait(System.currentTimeMillis()-futureTime);
                            Log.i(TAG,"service is doing something");
                        }catch (Exception e){}
                        }
                    }
                }

            }
        };

        Thread t=new Thread(r);
        t.start();
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.i(TAG,"onDestroy method is called");
    }

    @Override
    public IBinder onBind(Intent intent) {
         return null;
    }
}

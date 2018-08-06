package com.neha.hambaster;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Binder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyService1 extends Service {

    private final IBinder nehasBinder=new MyLocalBinder();

    public MyService1() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return nehasBinder;
    }

    public String getCurrentTime(){
        SimpleDateFormat df=new SimpleDateFormat("HH:mm:ss",Locale.US);
        return df.format(new Date());
    }

    public class MyLocalBinder extends Binder{
        MyService1 getService(){
            return MyService1.this;
        }

    }
}

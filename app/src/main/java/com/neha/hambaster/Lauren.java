package com.neha.hambaster;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.os.Handler;
import android.os.Message;
import android.widget.Button;

public class Lauren extends AppCompatActivity {

    Handler handle= new Handler(){
        @Override
        public void handleMessage(Message msg) {
            TextView nehasText=(TextView)findViewById(R.id.nehasText);
            nehasText.setText("Nice Job Hoss");
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lauren);
    }

    public void clickNehasButton(View view){

        Runnable r=new Runnable() {
            @Override
            public void run() {
                long futureTime=System.currentTimeMillis()+100000;
                while(System.currentTimeMillis() < futureTime){
                    synchronized (this){
                        try{
                            wait(futureTime-System.currentTimeMillis());
                        }catch (Exception e){}
                    }
                }
            }
        };

        Thread thread=new Thread(r);
        thread.start();

        TextView nehasText = (TextView) findViewById(R.id.nehasText);
        nehasText.setText("Nice Job Hoss!");

    }
}

package com.neha.hambaster;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Lauren extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lauren);
    }

    public void clickNehasButton(View view){
        long futureTime=System.currentTimeMillis()+10000;
        while(System.currentTimeMillis() < futureTime){
            synchronized (this){
                try{
                    wait(futureTime- System.currentTimeMillis());
                }catch (Exception e){}
            }
        }
        TextView nehasText=(TextView)findViewById(R.id.nehasText);
        nehasText.setText("Good Job Hoss");
    }
}

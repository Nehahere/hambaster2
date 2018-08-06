package com.neha.hambaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Apples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
        Intent intent=new Intent(this,MyService.class);
        startService(intent);
    }

    public void onClick(View view){
        Intent i = new Intent(this, Bacon.class);
        startActivity(i);
    }
}

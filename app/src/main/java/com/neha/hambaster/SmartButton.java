package com.neha.hambaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SmartButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_button);


        Button nehasbutton = (Button)findViewById(R.id.nehasbutton);

        nehasbutton.setOnClickListener(
                new Button.OnClickListener(){

                    public  void onClick(View v){
                        TextView nehastext =(TextView)findViewById(R.id.nehastext);
                        nehastext.setText("Good Job Hoss");
                    }
                }
        );


    nehasbutton.setOnLongClickListener(
            new Button.OnLongClickListener(){
                public boolean onLongClick(View v){
                    TextView nehastext =(TextView)findViewById(R.id.nehastext);
                    nehastext.setText("Holy Carp,that was a long one");
                    return true;
                }
            }
    );

        nehasbutton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView nehastext =(TextView)findViewById(R.id.nehastext);
                        nehastext.setText("Holy Carp,that was a long one!");
                        return false;
                    }
                }
        );
    }
}




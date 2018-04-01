package com.neha.hambaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MemeCreator extends AppCompatActivity implements TopSectionFragment.TopSectionListener{

    @Override
    public void createMeme(String top, String bottom) {
        BottomPictureFragment bottomFragment=(BottomPictureFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMemeText(top, bottom);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme_creator);



    }
}

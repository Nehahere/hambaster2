package com.neha.hambaster;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment {

    private static TextView topMeme;
    private static TextView bottomMeme;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.bottom_picture_fragment,container,false);
        topMeme=(TextView)view.findViewById(R.id.topMeme);
        bottomMeme=(TextView)view.findViewById(R.id.bottomMeme);
        return view;
    }

    public void setMemeText(String top, String bottom){
        topMeme.setText(top);
        bottomMeme.setText(bottom);
    }
}

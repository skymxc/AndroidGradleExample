package com.skymxc.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int share = getMipmapRes("share");
        Log.i(MainActivity.class.getSimpleName(), "onCreate: "+share);

    }
    public int getMipmapRes(String prefix){
        String name = String.format("%s_2", prefix);
       return getResources().getIdentifier(name,"mipmap",getPackageName());
    }
}

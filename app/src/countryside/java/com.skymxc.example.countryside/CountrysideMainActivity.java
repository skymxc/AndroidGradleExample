package com.skymxc.example.countryside;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.skymxc.example.library.Apple;

/**
 * <p>
 *
 * </p>
 *
 * @author 孟祥超
 * <p>
 * date: 2020/9/15  10:09 PM
 */
public class CountrysideMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //只给变种了 apple 依赖，访问不到 banana
        Apple apple  =new Apple();

    }
}

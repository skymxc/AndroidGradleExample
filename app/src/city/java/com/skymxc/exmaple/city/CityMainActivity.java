package com.skymxc.exmaple.city;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.skymxc.example.library.Banana;


/**
 * <p>
 *
 * </p>
 *
 * @author 孟祥超
 * <p>
 * date: 2020/9/15  10:06 PM
 */
public class CityMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //只给了 banana 依赖，访问不到 apple
        Banana banana = new Banana();

    }
}

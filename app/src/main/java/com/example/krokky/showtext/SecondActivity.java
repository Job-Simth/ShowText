package com.example.krokky.showtext;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

import com.marquee.dingrui.marqueeviewlib.MarqueeView;


/**
 * Created by Krokky on 2018/3/16.
 */

public class SecondActivity extends AppCompatActivity {

    MarqueeView marqueeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().hide();//去掉标题栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);// 设置全屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        marqueeView = findViewById(R.id.marquee);
        String date = getIntent().getStringExtra("sendMes");
        if (date != null) {
            marqueeView.setContent(date);
        }
        for (int i= 0;i%2==0;i++){
            marqueeView.setTextColor(R.color.colorAccent);
        }
    }
}


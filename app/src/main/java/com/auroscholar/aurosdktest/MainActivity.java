package com.auroscholar.aurosdktest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.auro.application.home.presentation.view.activity.SplashScreenAnimationActivity;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, SplashScreenAnimationActivity.class);
        startActivity(intent);
    }
}
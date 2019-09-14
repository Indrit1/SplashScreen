package com.example.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

     public static final int SPLASH_SCREEN_TIME = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    @Override
    protected void onStart() {
        super.onStart();
        new Handler().postDelayed(this::goToMainActivityMethod,SPLASH_SCREEN_TIME);
    }

    private void goToMainActivityMethod() {
        Intent goToMainActivityIntent = new Intent(SplashScreenActivity.this,MainActivity.class);
        startActivity(goToMainActivityIntent);
    }
}

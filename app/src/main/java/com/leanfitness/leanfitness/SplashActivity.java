package com.leanfitness.leanfitness;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by ndabhi on 3/19/2018.
 */

public class SplashActivity extends AppCompatActivity {
    private Handler mHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        delayedFinish();
    }

    private void delayedFinish() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                launchMain();
            }
        };
        mHandler.postDelayed(r, 1500);
    }

    private void launchMain() {
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }
}

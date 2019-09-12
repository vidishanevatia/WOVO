package com.example.wovo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private Handler handler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        this.setTitle("");
        getSupportActionBar().hide();


        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
//                if (!isLoggedIn()) {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
//                } else {
//                    Intent intent = new Intent(SplashActivity.this, FragmentDrawerLayout.class);
//                    startActivity(intent);
//                    finish();
//                }
            }
        }, 3000);
    }


//    public  boolean isLoggedIn()
//    {
//        return preferences.getBoolean(IsLogin, false);
//    }

}

package com.example.hidden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    Animation app_splash;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // animasi loading
        app_splash = AnimationUtils.loadAnimation(this, R.anim.app_splash);

        // loading logo
        logo = findViewById(R.id.logo);

        // run animation
        logo.startAnimation(app_splash);

        // setting timer menjadi 2 detik
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // mengubah activity splash ke getstarted
                Intent gogetstarted = new Intent(SplashActivity.this,GetStartedActivity.class);
                startActivity(gogetstarted);
                finish();
            }
        }, 2000 ); // 2000ms = 2 detik


    }
}
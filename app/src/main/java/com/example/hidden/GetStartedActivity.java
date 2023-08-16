package com.example.hidden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GetStartedActivity extends AppCompatActivity {

    Animation ttb;
    Animation btt;
    ImageView logo;
    TextView tagline;
    Button btn_get_started;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        // load animation
        ttb = AnimationUtils.loadAnimation(this, R.anim.ttb);


        logo = findViewById(R.id.logo);
        tagline = findViewById(R.id.tagline);

        // run animation
        logo.startAnimation(ttb);
        tagline.startAnimation(ttb);

        btn_get_started = findViewById(R.id.btn_get_started);
        btn_get_started.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome = new Intent(GetStartedActivity.this,HomeActivity.class);
                startActivity(gotohome);
            }
        });


    }
}
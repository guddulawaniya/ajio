package com.example.ajio;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView rocket = findViewById(R.id.rocket);
        TextView name = findViewById(R.id.appname);
        Animation imagerocket = AnimationUtils.loadAnimation(this,R.anim.image_animation);
        rocket.startAnimation(imagerocket);

        Animation appanimation = AnimationUtils.loadAnimation(this,R.anim.text_animation);
        name.startAnimation(appanimation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_screen.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },2000);
    }
}
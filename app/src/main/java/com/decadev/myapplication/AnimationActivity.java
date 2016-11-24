package com.decadev.myapplication;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        final Button registerButton = (Button) findViewById(R.id.regButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerButton.animate()
                        .rotation(registerButton.getRotation()+ 15)
                        .scaleX((float)(1.2))
                        .start();


                ObjectAnimator.ofObject(
                        registerButton,
                        "backgroundColor",
                        new ArgbEvaluator(),
                        Color.BLACK,
                        Color.RED
                )
                        .setDuration(1000)
                        .start();
            }
        });
    }
}

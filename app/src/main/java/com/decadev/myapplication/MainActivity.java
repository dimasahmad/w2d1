package com.decadev.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login(View view) {
        Intent intent = new Intent(this, DynamicActivity.class);
        intent.putExtra("layout", R.layout.activity_login);
        startActivity(intent);
    }

    public void tts(View view) {
        Intent intent = new Intent(this, DynamicActivity.class);
        intent.putExtra("layout", R.layout.activity_tts);
        startActivity(intent);
    }

    public void animation(View view) {
        Intent intent = new Intent(this, AnimationActivity.class);
        startActivity(intent);
    }

    public void gradient(View view) {
        Intent intent = new Intent(this, GradientActivity.class);
        startActivity(intent);
    }
}

package com.decadev.myapplication;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        @LayoutRes int layout = getIntent().getIntExtra("layout", R.layout.activity_main);

        if (layout == R.layout.activity_login)
            setContentView(R.layout.activity_login);
        else if (layout == R.layout.activity_tts)
            setContentView(R.layout.activity_tts);

    }
}

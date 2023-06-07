package com.ravlal.ravlalcircleimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ravlal.ravlalcircle.imageview.RavlalCircleImageView;

public class MainActivity extends AppCompatActivity {

    RavlalCircleImageView ravlalCircleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ravlalCircleImageView = findViewById(R.id.myImageview);

    }
}
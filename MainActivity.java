package com.example.mayank.planttech;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Animation animation,animation2;
    ImageView plant,tech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plant=(ImageView)findViewById(R.id.plant);
        tech=(ImageView)findViewById(R.id.tech);

        animation= AnimationUtils.loadAnimation(this,R.anim.anim);
        animation2= AnimationUtils.loadAnimation(this,R.anim.down);
        tech.startAnimation(animation2);
        plant.startAnimation(animation);

        tech.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, welcome.class);

        startActivity(intent);
    }
}

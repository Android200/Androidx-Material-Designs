package com.material.component;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

public class Login_Animation_Ex extends AppCompatActivity {
    LinearLayout container;
    AnimationDrawable anim;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__animation__example);

        container = findViewById(R.id.container);
        ImageView progress = findViewById(R.id.imageView);
        ImageView progress2 = findViewById(R.id.imageView2);

        anim =(AnimationDrawable) container.getBackground();

        anim.setEnterFadeDuration(2000);
        anim.setExitFadeDuration(1000);

        AnimatedVectorDrawableCompat avd = AnimatedVectorDrawableCompat.create(Login_Animation_Ex.this, R.drawable.avd_loading_bar);
        progress.setImageDrawable(avd);
        Animatable animatable = (Animatable) progress.getDrawable();
        animatable.start();

        AnimatedVectorDrawableCompat avd2 = AnimatedVectorDrawableCompat.create(Login_Animation_Ex.this, R.drawable.heart_rate);
        progress2.setImageDrawable(avd2);
        Animatable animatable2 = (Animatable) progress2.getDrawable();
        animatable2.start();


    }

    @Override
    protected void onResume() {
        super.onResume();
        if(anim != null && !anim.isRunning())
            anim.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(anim != null && anim.isRunning())
            anim.stop();
    }
}

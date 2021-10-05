package com.example.meetup.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.BounceInterpolator;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.meetup.R;
import com.example.meetup.activites.SignInActivity;

public class MainActivity extends AppCompatActivity {
    TextView appname;
    LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appname = findViewById(R.id.appname);
        lottie=findViewById(R.id.lottie);

//        appname.animate().translationY(250).setDuration(2000).setStartDelay(0).setInterpolator(new BounceInterpolator());
       lottie.animate().setDuration(1000);
       appname.animate().setDuration(1000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a = new Intent(getApplicationContext(), SignInActivity.class);
                startActivity(a);
            }
        },5000);
    }
}
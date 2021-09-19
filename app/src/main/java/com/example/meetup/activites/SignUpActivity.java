package com.example.meetup.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.meetup.R;
import com.example.meetup.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {
    private ActivitySignUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void  setListeners(){
        binding.textSignIn.setOnClickListener(
                v-> onBackPressed()
        );
    }

}
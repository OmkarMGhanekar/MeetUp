package com.example.meetup.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.meetup.R;
import com.example.meetup.databinding.ActivityChatBinding;
import com.example.meetup.models.User;
import com.example.meetup.utilities.Constants;

public class ChatActivity extends AppCompatActivity {
    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadReceiverDetails();
        setListeners();
    }

    private void loadReceiverDetails()
    {
        receiverUser =(User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }

    private void setListeners(){
        binding.imageBack.setOnClickListener(v-> onBackPressed());
    }
}
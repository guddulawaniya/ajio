package com.example.ajio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ajio.databinding.ActivityProfileSidebarBinding;

public class profileSidebar extends AppCompatActivity {

    ActivityProfileSidebarBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileSidebarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.crossbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              onBackPressed();
            }
        });
        binding.homeicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              onBackPressed();
            }
        });
        binding.searchbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent = new Intent(profileSidebar.this,Search_Activity.class);
              startActivity(intent);
              finish();
            }
        });
    }
}
package com.example.ajio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ajio.databinding.ActivityProductsBinding;

import java.util.ArrayList;

public class Products_Activity extends AppCompatActivity {

    ActivityProductsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProductsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ImageView likebutton = findViewById(R.id.likebutton);

        ArrayList<Models> list = new ArrayList<>();

        list.add(new Models("superdry","Brand print pool Sliders","200","48%","150",R.drawable.sneakers));
        list.add(new Models("superdry","Brand print pool Sliders","200","48%","150",R.drawable.sneakers));
        list.add(new Models("superdry","Brand print pool Sliders","200","48%","150",R.drawable.sneakers));
        list.add(new Models("superdry","Brand print pool Sliders","200","48%","150",R.drawable.sneakers));
        list.add(new Models("superdry","Brand print pool Sliders","200","48%","150",R.drawable.sneakers));
        list.add(new Models("superdry","Brand print pool Sliders","200","48%","150",R.drawable.sneakers));


        binding.productRecyclerview.setLayoutManager(new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false));
        productsAdapter adapter = new productsAdapter(list,this);
        binding.productRecyclerview.setAdapter(adapter);

//        likebutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                likebutton.setImageResource(R.drawable.likebgafterclick);
//            }
//        });

        binding.productmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Products_Activity.this,profileSidebar.class);
                startActivity(intent);
                finish();
            }
        });
        binding.searchproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Products_Activity.this,Search_Activity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
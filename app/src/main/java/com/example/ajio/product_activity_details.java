package com.example.ajio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ajio.databinding.ActivityProductDetailsBinding;

import java.util.ArrayList;

public class product_activity_details extends AppCompatActivity {

    ActivityProductDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProductDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Models> list = new ArrayList<>();
        list.add(new Models(R.drawable.image1));
        list.add(new Models(R.drawable.image2));
        list.add(new Models(R.drawable.image3));
        list.add(new Models(R.drawable.image2));
        list.add(new Models(R.drawable.image1));
        list.add(new Models(R.drawable.image2));
        list.add(new Models(R.drawable.image3));

        TextView moreoffers = findViewById(R.id.moreoffers);
        moreoffers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ButtomSheetDetails buttomSheet = new ButtomSheetDetails();
                buttomSheet.show(getSupportFragmentManager(),"modelbuttomsheet");
            }
        });

        TextView viewallproducts = findViewById(R.id.viewallproducts);
        viewallproducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(product_activity_details.this,Products_Activity.class);
                startActivity(intent);
            }
        });
        binding.pdetailmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(product_activity_details.this,profileSidebar.class);
                startActivity(intent);
            }
        });

        binding.psearchproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(product_activity_details.this,Search_Activity.class);
                startActivity(intent);
            }
        });

        binding.productrecyclerviewdtail.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        productDetailslideradapter detailslideradapter = new productDetailslideradapter(list,this);
        binding.productrecyclerviewdtail.setAdapter(detailslideradapter);
    }
}
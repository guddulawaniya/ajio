package com.example.ajio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.ajio.databinding.ActivityFullimageBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;

public class fullimage_Activity extends AppCompatActivity {

    ActivityFullimageBinding binding;

    int[] images = {R.drawable.sneakers,
            R.drawable.sneakers,
            R.drawable.sneakers,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFullimageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.crossbuttonfullactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        productsliderAdapter sliderAdapter = new productsliderAdapter(images);
        binding.fullimageslider.setSliderAdapter(sliderAdapter);
        binding.fullimageslider.setIndicatorAnimation(IndicatorAnimationType.WORM);
        binding.fullimageslider.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
    }
}
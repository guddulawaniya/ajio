package com.example.ajio;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.ajio.databinding.FragmentHomeFragmentBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;


public class home_fragment extends Fragment {

    FragmentHomeFragmentBinding binding;
    ArrayList<Models> list;
    SliderView sliderView;

    int[] images = {R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeFragmentBinding.inflate(inflater,container,false);
        list = new ArrayList<>();
        list.add(new Models(R.drawable.image1,"image 1"));
        list.add(new Models(R.drawable.image2,"image 2"));
        list.add(new Models(R.drawable.image3,"image 3"));
        list.add(new Models(R.drawable.image2,"image 2"));
        list.add(new Models(R.drawable.image1,"image 1"));
        list.add(new Models(R.drawable.image2,"image 2"));
        list.add(new Models(R.drawable.image3,"image 1"));
        // Inflate the layout for this fragment
        horzontalAdapter horzontalAdapter = new horzontalAdapter(list, getContext());

        binding.homefragmentsearchbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),Search_Activity.class);
                startActivity(intent);
            }
        });
        binding.notificationicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),Notification_Activity.class);
                startActivity(intent);
            }
        });
//        sliderView = getView().findViewById(R.id.image_slider);
//
//        SliderAdapter sliderAdapter = new SliderAdapter(images);
//
//        sliderView.setSliderAdapter(sliderAdapter);
//        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
//        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
//        sliderView.startAutoCycle();

        binding.horizontalrecyclerview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true));
        binding.horizontalrecyclerview.setAdapter(horzontalAdapter);

        binding.menutopbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),profileSidebar.class);
                startActivity(intent);
            }
        });




        return binding.getRoot();
    }
}
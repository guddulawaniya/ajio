package com.example.ajio;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ajio.databinding.FragmentButtomSheetDetailsBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ButtomSheetDetails extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_buttom_sheet_details, container, false);



        return  view;
    }
}
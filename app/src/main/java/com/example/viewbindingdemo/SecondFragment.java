package com.example.viewbindingdemo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewbindingdemo.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {

    FragmentSecondBinding fragmentSecondBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_second, container, false);
        fragmentSecondBinding = FragmentSecondBinding.inflate(inflater,container,false);
        return fragmentSecondBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentSecondBinding.secondFragmentTV.setText(R.string.seconf_frag);
    }
}
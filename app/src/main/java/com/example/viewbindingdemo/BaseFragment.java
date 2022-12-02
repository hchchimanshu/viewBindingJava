package com.example.viewbindingdemo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.viewbindingdemo.databinding.FragmentBaseBinding;

public class BaseFragment extends Fragment {

    //add viewBinding in build to gradle
    FragmentBaseBinding fragmentBaseBinding;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_base, container, false);
        fragmentBaseBinding = FragmentBaseBinding.inflate(inflater,container,false);
        return fragmentBaseBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        fragmentBaseBinding.textTV.setText(R.string.used_view_binding_text);
        fragmentBaseBinding.buttonBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(requireActivity(), "Attached View Binding", Toast.LENGTH_SHORT).show();
            }
        });

        fragmentBaseBinding.navigateBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_baseFragment_to_secondFragment);
            }
        });
    }
}
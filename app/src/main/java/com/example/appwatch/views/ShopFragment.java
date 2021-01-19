package com.example.appwatch.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.appwatch.R;
import com.example.appwatch.databinding.FragmentShopBinding;

public class ShopFragment extends Fragment {

   
    FragmentShopBinding fragmentShopBinding;

    public ShopFragment(){



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentShopBinding = FragmentShopBinding.inflate(inflater, container, false);
        return fragmentShopBinding.getRoot();
    }
}
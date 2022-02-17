package com.example.playstv;

import android.os.Bundle;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import com.example.playstv.databinding.*;

import com.google.android.material.progressindicator.BaseProgressIndicator;

public class MenuPrincipalFragment extends Fragment {
    NavController navController;

    private FragmentMenuPrincipalBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentMenuPrincipalBinding.inflate(inflater, container, false);
        return inflater.inflate(R.layout.fragment_menu_principal, container, false);

    }
}
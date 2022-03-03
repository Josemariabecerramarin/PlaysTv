package com.example.playstv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class suscripcionFragment extends Fragment {
    NavController navController;
    ImageButton volver;
    LinearLayout item1;
    LinearLayout item2;
    LinearLayout item3;
    ImageButton perfil;
    ImageButton camara;
    ImageButton botonsus;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_suscripcion, container, false);
    }

}
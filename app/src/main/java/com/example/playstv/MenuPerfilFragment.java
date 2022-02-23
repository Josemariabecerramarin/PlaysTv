package com.example.playstv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class MenuPerfilFragment extends Fragment {
    NavController navController;
    ImageButton buttonVolver;
    ImageButton buttonSuscripciones;
    ImageButton buttonCamara;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_perfil, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        buttonVolver = view.findViewById(R.id.logoVolver);
        buttonSuscripciones = view.findViewById(R.id.botonSuscripciones);
        buttonCamara = view.findViewById(R.id.botonCamara);


        buttonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuPrincipalFragment);
            }
        });

        buttonSuscripciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuPerfilFragment_to_menuSuscripcionesFragment);
            }
        });

        buttonCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuPerfilFragment_to_menuCamaraFragment);
            }
        });
    }
}
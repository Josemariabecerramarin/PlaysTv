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
import android.widget.LinearLayout;


public class opcionesFragment extends Fragment {
    NavController navController;
    ImageButton buttonSuscripciones;
    ImageButton buttonCamara;
    ImageButton volver;
    LinearLayout cuenta;
    LinearLayout canal;
    LinearLayout ajustes;
    LinearLayout buzon;
    LinearLayout ayuda;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_opciones, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        buttonSuscripciones = view.findViewById(R.id.botonSuscripciones);
        buttonCamara = view.findViewById(R.id.botonCamara);
        volver = view.findViewById(R.id.logoVolver);
        cuenta = view.findViewById(R.id.imageButtonCuenta);
        canal = view.findViewById(R.id.imageButtonCuenta);
        ajustes = view.findViewById(R.id.imageButtonAjustes);
        buzon = view.findViewById(R.id.imageButtonBuzon);
        ayuda = view.findViewById(R.id.imageButtonAyuda);



        buttonSuscripciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuSuscripcionesFragment);
            }
        });

        buttonCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuCamaraFragment);
            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuPrincipalFragment);
            }
        });

        cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuPerfilFragment);
            }
        });
    }
}
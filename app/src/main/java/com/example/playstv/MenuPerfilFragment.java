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


public class MenuPerfilFragment extends Fragment {
    NavController navController;
    ImageButton buttonVolver;
    ImageButton buttonSuscripciones;
    ImageButton buttonCamara;
    LinearLayout perfil;
    LinearLayout apodo;
    LinearLayout cambiarKey;
    LinearLayout cuenta;
    LinearLayout salir;
    ImageButton volverPerfil;



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
        perfil = view.findViewById(R.id.cambiarImagenPerfil);
        apodo = view.findViewById(R.id.imageButton4);
        cambiarKey = view.findViewById(R.id.imageButton7);
        cuenta = view.findViewById(R.id.imageButton8);
        salir = view.findViewById(R.id.imageButton9);
        volverPerfil = view.findViewById(R.id.botonPerfil);



        buttonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_SwipeFragment);
            }
        });

        volverPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesFragment);
            }
        });

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

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_cambiarImagenPerfilFragment);
            }
        });

        apodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_cambiarApodoFragment);
            }
        });

        cambiarKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_cambiarKeyFragment);
            }
        });

        cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_cuenta);
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuPerfilFragment_to_pantallaInicio);
            }
        });
    }
}
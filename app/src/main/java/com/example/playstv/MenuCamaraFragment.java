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
import android.widget.TextView;


public class MenuCamaraFragment extends Fragment {
    NavController navController;
    ImageButton buttonSuscripciones;
    ImageButton buttonPerfil;
    ImageButton volver;
    TextView subir;
    TextView crear;
    TextView emitir;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_camara, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        buttonSuscripciones = view.findViewById(R.id.botonSuscripciones);
        buttonPerfil = view.findViewById(R.id.botonPerfil);
        volver = view.findViewById(R.id.logoVolver);
        subir = view.findViewById(R.id.subir);
        crear = view.findViewById(R.id.crearVideo);
        emitir = view.findViewById(R.id.emitirDirecto);

        buttonSuscripciones.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuSuscripcionesFragment);
            }
        });

        buttonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_opcionesFragment);
            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_SwipeFragment);
            }
        });

        subir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_subirVideoFragment);
            }
        });

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_grabarVideoFragment);
            }
        });

        emitir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_emitirDirectoFragment);
            }
        });
    }
}
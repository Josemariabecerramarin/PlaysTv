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

public class AyudaConsejoFragment extends Fragment {
    NavController navController;
    ImageButton flecha;
    ImageButton volver;
    LinearLayout verHistorial;
    LinearLayout verConsultar;
    LinearLayout verIniciar;
    LinearLayout verActivar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ayuda_consejo, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        flecha = view.findViewById(R.id.botonFlecha);
        volver = view.findViewById(R.id.logoVolver);
        verHistorial = view.findViewById(R.id.verhistorial);
        verConsultar = view.findViewById(R.id.verConsultar);
        verIniciar = view.findViewById(R.id.verIniciar);
        verActivar = view.findViewById(R.id.verActivar);

        flecha.setOnClickListener(new View.OnClickListener() {
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

        verHistorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuVerHistorialFragment);
            }
        });

        verConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_consultarSubsFragment);
            }
        });

        verIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_iniciarCerrarFragment);
            }
        });

        verActivar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_controlParentalFragment);
            }
        });
    }
}
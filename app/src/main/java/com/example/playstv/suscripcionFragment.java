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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class suscripcionFragment extends Fragment {
    NavController navController;
    ImageButton volver;
    ImageView seguir;
    ImageView campana;
    ImageButton flecha;
    TextView verComentarios;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_suscripcion, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        volver = view.findViewById(R.id.logoVolver);
        seguir = view.findViewById(R.id.seguir);
        campana = view.findViewById(R.id.campana);
        flecha = view.findViewById(R.id.botonFlecha);
        verComentarios = view.findViewById(R.id.verComentarios);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_SwipeFragment);
            }
        });
        seguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Ya sigues a este usuario!", Toast.LENGTH_SHORT).show();
            }
        });
        campana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Notificaciones activadas!", Toast.LENGTH_SHORT).show();
            }
        });

        flecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuSuscripcionesFragment);
            }
        });
        verComentarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.comentariosFragment);
            }
        });
    }

}
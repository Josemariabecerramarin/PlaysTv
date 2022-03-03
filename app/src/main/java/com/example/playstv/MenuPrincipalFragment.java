package com.example.playstv;

import android.content.Intent;
import android.os.Bundle;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.playstv.databinding.*;

import com.google.android.material.progressindicator.BaseProgressIndicator;

public class MenuPrincipalFragment<ibLis> extends Fragment {
    NavController navController;
    ImageButton buttonSuscripciones;
    ImageButton buttonPerfil;
    ImageButton buttonCamara;
    FrameLayout redes;
    ImageButton compartir;
    boolean clicado = true;
    ImageButton lupa;
    ImageButton seguir;
    ImageButton like;
    ImageButton comentario;
    ImageView insta;
    ImageView facebook;
    ImageView telegram;
    ImageView wasap;
    ImageView mail;
    ImageView twitter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_menu_principal, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        buttonSuscripciones = view.findViewById(R.id.botonSuscripciones);
        buttonPerfil = view.findViewById(R.id.botonPerfil);
        buttonCamara = view.findViewById(R.id.botonCamara);
        redes = view.findViewById(R.id.redes);
        compartir = view.findViewById(R.id.compartir);
        lupa = view.findViewById(R.id.imageButton5);
        seguir = view.findViewById(R.id.imageButton);
        like = view.findViewById(R.id.imageView3);
        comentario = view.findViewById(R.id.imageButton6);
        insta = view.findViewById(R.id.imageView7);
        facebook = view.findViewById(R.id.facebook);
        telegram = view.findViewById(R.id.telegram);
        wasap = view.findViewById(R.id.wasap);
        mail = view.findViewById(R.id.mail2);
        twitter = view.findViewById(R.id.twitter);


        redes.setVisibility(View.GONE);

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

        buttonCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuCamaraFragment);
            }
        });
        compartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clicado){
                redes.setVisibility(View.VISIBLE);
                clicado = false;
                }else{
                    redes.setVisibility(View.GONE);
                    clicado = true;
                }
            }
        });

        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Las busquedas están deshabilitadas por el momento", Toast.LENGTH_SHORT).show();
            }
        });
        seguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Ahora sigues a este usuario!", Toast.LENGTH_SHORT).show();
            }
        });
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Tu like se ha sumado a la base de datos!", Toast.LENGTH_SHORT).show();
            }
        });
        comentario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Los comentarios están deshabilitados temporalmente", Toast.LENGTH_SHORT).show();
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Has compartido el video!", Toast.LENGTH_SHORT).show();
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Has compartido el video!", Toast.LENGTH_SHORT).show();
            }
        });
        telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Has compartido el video!", Toast.LENGTH_SHORT).show();
            }
        });
        wasap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Has compartido el video!", Toast.LENGTH_SHORT).show();
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Has compartido el video!", Toast.LENGTH_SHORT).show();
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Has compartido el video!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}





package com.example.playstv;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.playstv.databinding.*;

import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.pranavpandey.android.dynamic.toasts.DynamicToast;

public class MenuPrincipalFragment<ibLis> extends Fragment {

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
    LinearLayout siguiente;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_menu_principal, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        VideoView videoView = (VideoView) view.findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("https://redirect.veoh.com/flash/p/2/v105713956nN9KkFTq/h105713956.mp4?ct=ed68d1590f9ee35f948b8fd9f00bf493f79fece93db46d27"));
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
        siguiente = view.findViewById(R.id.siguiente);
        videoView.start();
        /*MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), R.raw.videoxokas4);
        mediaPlayer.start();*/


        redes.setVisibility(View.GONE);

        buttonSuscripciones.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MenuPrincipalFragment.this).navigate(R.id.action_menuSuscripcionesFragment);
            }
        });

        buttonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MenuPrincipalFragment.this).navigate(R.id.action_opcionesFragment);
            }
        });

        buttonCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MenuPrincipalFragment.this).navigate(R.id.action_menuCamaraFragment);
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
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MenuPrincipalFragment.this).navigate(R.id.action_principal2Fragment);
            }
        });

        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DynamicToast.makeSuccess(getContext(), "Las busquedas están deshabilitadas por el momento").show();
            }
        });
        seguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DynamicToast.makeSuccess(getContext(), "Ahora sigues a este usuario").show();
            }
        });
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DynamicToast.makeSuccess(getContext(), "Tu like se ha sumado a la base de datos").show();
            }
        });
        comentario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DynamicToast.makeSuccess(getContext(), "Los comentarios están deshabilitados temporalmente").show();
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DynamicToast.makeSuccess(getContext(), "Has compartido el video!").show();
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DynamicToast.makeSuccess(getContext(), "Has compartido el video!").show();
            }
        });
        telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DynamicToast.makeSuccess(getContext(), "Has compartido el video!").show();
            }
        });
        wasap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DynamicToast.makeSuccess(getContext(), "Has compartido el video!").show();
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DynamicToast.makeSuccess(getContext(), "Has compartido el video!").show();
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DynamicToast.makeSuccess(getContext(), "Las busquedas están deshabilitadas por el momento").show();
            }
        });

    }

}





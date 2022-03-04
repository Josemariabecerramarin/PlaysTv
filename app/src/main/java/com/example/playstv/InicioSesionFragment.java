package com.example.playstv;

import android.os.Bundle;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.playstv.databinding.FragmentInicioSesionBinding;

public class InicioSesionFragment extends Fragment {
    NavController navController;
    Button buttonIniciar;
    FragmentInicioSesionBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentInicioSesionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    //Navegamos hacia el menu principal
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        buttonIniciar = view.findViewById(R.id.buttonIniciar);

        buttonIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // lo que passa antes de el run
                binding.introduceCorreo.setVisibility(View.GONE);
                binding.buttonIniciar.setVisibility(View.GONE);
                binding.contraseA.setVisibility(View.GONE);
                binding.carga.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {   // delay per a simular la carrega i que es vegi la progressBar
                    @Override
                    public void run() {
                        // lo que passa despues de x tiempo
                        navController.navigate(R.id.action_SwipeFragment);

                    }
                }, 3500);  // el tiempo en milisegundos
            }
        });

    }
}
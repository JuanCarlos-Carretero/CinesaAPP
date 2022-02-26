package com.example.cinesaapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class InicioFragment extends Fragment {

    NavController navController;
    Button inicioSesion;
    Button inicioSesionFacebook;
    Button registrarse;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inicio, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        inicioSesion = view.findViewById(R.id.iniciarSesion);
        inicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_inicioSesion);
            }
        })
        ;

        inicioSesionFacebook = view.findViewById(R.id.iniciarSesionFacebook);
        inicioSesionFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_inicioSesionFacebook);
            }
        })
        ;

        registrarse = view.findViewById(R.id.registrarse);
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_registrarse);
            }
        })
        ;
    }
}
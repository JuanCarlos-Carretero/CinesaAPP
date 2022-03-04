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
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class peli1Fragment extends Fragment {

    NavController navController;
    FrameLayout elegirButaca;

    LinearLayout cine;
    ImageButton botonX;
    Button botonPasarPago;
    ImageButton botonCerrar;

    boolean clicado = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_peli1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        elegirButaca = view.findViewById(R.id.elegirButacas);
        elegirButaca.setVisibility(View.GONE);

        cine = view.findViewById(R.id.direccion);
        cine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!clicado){
                    elegirButaca.setVisibility(View.GONE);
                    clicado = true;
                }else{
                    elegirButaca.setVisibility(View.VISIBLE);
                    clicado = false;
                }
            }
        });

        botonCerrar = view.findViewById(R.id.botonCerrar);
        botonCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicado = true;
                navController.navigate(R.id.action_PaginaPrincipal);
            }
        });

        botonX = view.findViewById(R.id.x);
        botonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elegirButaca.setVisibility(View.GONE);
                clicado = true;
            }
        });

        botonPasarPago = view.findViewById(R.id.pasarPago);
        botonPasarPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elegirButaca.setVisibility(View.GONE);
                clicado = true;
                navController.navigate(R.id.action_paginaPago);
            }
        });
    }
}
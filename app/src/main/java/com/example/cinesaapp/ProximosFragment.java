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
import android.widget.ImageView;

public class ProximosFragment extends Fragment {

    NavController navController;

    ImageView botonMenu;
    ImageView fotoPerfil;

    FrameLayout overlayMenu;

    Button botonCine;
    Button botonEstrenos;
    Button botonCartelera;
    Button botonEventos;

    ImageButton botonPerfil;
    ImageButton botonCerrar;
    ImageButton botonLogOut;
    ImageButton botonPeliculas;
    ImageButton botonCines;
    ImageButton botonPromociones;
    ImageButton botonSalasPremium;
    ImageButton botonb2b;
    ImageButton botonCineLuxe;

    boolean clicado = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_proximos, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        overlayMenu = view.findViewById(R.id.overlayMenu);
        overlayMenu.setVisibility(View.GONE);

        botonMenu = view.findViewById(R.id.botonHamburguerMenu);
        botonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!clicado){
                    overlayMenu.setVisibility(View.GONE);
                    clicado = true;
                }else{
                    overlayMenu.setVisibility(View.VISIBLE);
                    clicado = false;
                }
            }
        });

        botonEventos = view.findViewById(R.id.botonEventos);
        botonEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_eventos);
            }
        });

        botonCartelera = view.findViewById(R.id.botonCartelera);
        botonCartelera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_PaginaPrincipal);
            }
        });

        botonEstrenos = view.findViewById(R.id.botonEstrenos);
        botonEstrenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_estrenos);
            }
        });

        botonCerrar = view.findViewById(R.id.botonCerrar);
        botonCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overlayMenu.setVisibility(View.GONE);
                clicado = true;
            }
        });

        botonLogOut = view.findViewById(R.id.botonLogOut);
        botonLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overlayMenu.setVisibility(View.GONE);
                clicado = true;
                navController.navigate(R.id.action_inicio);
            }
        });

        fotoPerfil = view.findViewById(R.id.hamburguerFotoPerfil);
        fotoPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overlayMenu.setVisibility(View.GONE);
                clicado = true;
                navController.navigate(R.id.action_MiPerfil);
            }
        });

        botonPeliculas = view.findViewById(R.id.botonPeliculas);
        botonPeliculas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overlayMenu.setVisibility(View.GONE);
                clicado = true;
                navController.navigate(R.id.action_PaginaPrincipal);
            }
        });

        botonCines = view.findViewById(R.id.botonCines);
        botonCines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overlayMenu.setVisibility(View.GONE);
                clicado = true;
                navController.navigate(R.id.action_cines);
            }
        });

        botonPromociones = view.findViewById(R.id.botonPromociones);
        botonPromociones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overlayMenu.setVisibility(View.GONE);
                clicado = true;
                navController.navigate(R.id.action_paginaIndisponible);
            }
        });

        botonSalasPremium = view.findViewById(R.id.botonSalasPremium);
        botonSalasPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overlayMenu.setVisibility(View.GONE);
                clicado = true;
                navController.navigate(R.id.action_paginaIndisponible);
            }
        });

        botonb2b = view.findViewById(R.id.botonBussines);
        botonb2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overlayMenu.setVisibility(View.GONE);
                clicado = true;
                navController.navigate(R.id.action_paginaIndisponible);
            }
        });

        botonCineLuxe = view.findViewById(R.id.botonCinesaLuxe);
        botonCineLuxe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overlayMenu.setVisibility(View.GONE);
                clicado = true;
                navController.navigate(R.id.action_paginaIndisponible);
            }
        });
        //Botones que no son del menuHamburguer

        botonCine = view.findViewById(R.id.botonCine);
        botonCine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_cines);
            }
        })
        ;

        botonPerfil = view.findViewById(R.id.botonPerfil);
        botonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_MiPerfil);
            }
        })
        ;
    }
}
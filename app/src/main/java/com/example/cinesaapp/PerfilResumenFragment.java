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

public class PerfilResumenFragment extends Fragment {

    NavController navController;

    ImageView botonMenu;
    ImageView fotoPerfil;

    FrameLayout overlayMenu;
    FrameLayout overlayCinesaCard;

    Button botonEntradas;
    Button botonCinesaCard;
    Button botonDatos;

    Button pedirCinesaCard;

    ImageButton cinesaCardCerrar;
    ImageButton botonCerrar;
    ImageButton botonLogOut;
    ImageButton botonPeliculas;
    ImageButton botonCines;
    ImageButton botonPromociones;
    ImageButton botonSalasPremium;
    ImageButton botonb2b;
    ImageButton botonCineLuxe;

    boolean clicado = true;
    boolean clicadoCinesaCard = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil_resumen, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        overlayMenu = view.findViewById(R.id.overlayMenu);
        overlayMenu.setVisibility(View.GONE);
        overlayCinesaCard = view.findViewById(R.id.overlayCinesaCard);
        overlayCinesaCard.setVisibility(View.GONE);

        pedirCinesaCard = view.findViewById(R.id.pedirCinesaCard);
        pedirCinesaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicado) {
                    if (!clicadoCinesaCard) {
                        overlayCinesaCard.setVisibility(View.GONE);
                        clicadoCinesaCard = true;
                    } else {
                        overlayCinesaCard.setVisibility(View.VISIBLE);
                        clicadoCinesaCard = false;
                    }
                }
            }
        });

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

        cinesaCardCerrar = view.findViewById(R.id.botonCerrarCinesaCard);
        cinesaCardCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overlayCinesaCard.setVisibility(View.GONE);
                clicadoCinesaCard = true;
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

        fotoPerfil = view.findViewById(R.id.fotoPerfil);
        fotoPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overlayMenu.setVisibility(View.GONE);
                clicado = true;
                navController.navigate(R.id.action_MiPerfil);
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

        botonPeliculas = view.findViewById(R.id.botonPeliculas);
        botonPeliculas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overlayMenu.setVisibility(View.GONE);
                clicado = true;
                navController.navigate(R.id.action_PaginaPrincipal);
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

        //Botones que no estan en el menu
        botonEntradas = view.findViewById(R.id.botonEntradas);
        botonEntradas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_perfilEntradas);
            }
        });

        botonCinesaCard = view.findViewById(R.id.botonCinesaCard);
        botonCinesaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_perfilCinesaCard);
            }
        });

        botonDatos = view.findViewById(R.id.botonDatos);
        botonDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_perfilDatos);
            }
        });

    }
}
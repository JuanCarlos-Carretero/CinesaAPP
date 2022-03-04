package com.example.cinesaapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.cinesaapp.databinding.FragmentInicioSesionBinding;
import com.example.cinesaapp.databinding.FragmentPaginaPagoBinding;

public class PaginaPagoFragment extends Fragment {

   NavController navController;
   ImageButton botonX;
   Button botonPagar;
    FragmentPaginaPagoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPaginaPagoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        botonX = view.findViewById(R.id.botonCerrar);
        binding.botonCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_peli1);
            }
        });

        botonPagar = view.findViewById(R.id.botonPagar);
        botonPagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // lo que passa antes de el run
                binding.carga.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {   // delay per a simular la carrega i que es vegi la progressBar
                    @Override
                    public void run() {
                        // lo que passa despues de x tiempo
                        navController.navigate(R.id.action_gracias);

                    }
                }, 3500);  // el tiempo en milisegundos

            }
        });
    }
}
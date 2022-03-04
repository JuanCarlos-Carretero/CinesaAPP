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

import com.example.cinesaapp.databinding.FragmentInicioSesionBinding;
import com.example.cinesaapp.databinding.FragmentRegistro2Binding;

public class Registro2Fragment extends Fragment {

    NavController navController;
    Button siguiente;
    FragmentRegistro2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRegistro2Binding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        siguiente = view.findViewById(R.id.siguiente);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // lo que passa antes de el run
                binding.carga.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {   // delay per a simular la carrega i que es vegi la progressBar
                    @Override
                    public void run() {
                        // lo que passa despues de x tiempo
                        navController.navigate(R.id.action_PaginaPrincipal);

                    }
                }, 3500);  // el tiempo en milisegundos

            }
        });
    }
}
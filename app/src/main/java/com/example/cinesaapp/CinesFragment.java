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
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class CinesFragment extends Fragment {

    NavController navController;
    ImageButton botonX;

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            LatLng La_Maquinista = new LatLng(41.44096978084341, 2.1985106665416683);
            LatLng Diagonal_Mar = new LatLng(41.40996736505576, 2.2164999708375475);
            LatLng Mataro_Parc = new LatLng(41.5549144820322, 2.4346380641938734);
            LatLng Parc_Valles = new LatLng(41.55017559411718, 2.024964701037247);
            LatLng BarnaSud = new LatLng(41.29914197581093, 2.0094284611242377);

            googleMap.addMarker(new MarkerOptions().position(La_Maquinista).title("Cinesa La Maquinista"));
            googleMap.addMarker(new MarkerOptions().position(Diagonal_Mar).title("Cinesa Diagonal Mar"));
            googleMap.addMarker(new MarkerOptions().position(Mataro_Parc).title("Cinesa Mataro Parc"));
            googleMap.addMarker(new MarkerOptions().position(Parc_Valles).title("Cinesa Parc Valles"));
            googleMap.addMarker(new MarkerOptions().position(BarnaSud).title("Cinesa BarnaSud"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(La_Maquinista));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cines, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }

        navController = Navigation.findNavController(view);

        botonX = view.findViewById(R.id.botonX);
        botonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_PaginaPrincipal);
            }
        })
        ;
    }
}
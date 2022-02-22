package com.example.cinesaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Esto de aqui es para quitar la action bar
        getSupportActionBar().hide();

        //Esto de aqui es para esconder la barra de notificaciones
        View decorView = getWindow().getDecorView();
         /*Hide both the navigation bar and the status bar.
         SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
         a general rule, you should design your app to hide the status bar whenever you
         hide the navigation bar.*/
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }
}
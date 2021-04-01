package com.example.wikitude;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ayuda(View view) {
        Intent a = new Intent(this, Ayuda.class);
        startActivity(a);

    }

    public void conocenos(View view) {
        Intent a = new Intent(this, Conocenos.class);
        startActivity(a);
    }

    public void mapa(View view) {
        Intent a = new Intent(this, MapsActivity.class);
        startActivity(a);

    }

    public void wikitude(View view) {
        String nombre_paquete = "com.wikitude.wikitudestudioandroidapptemplate";
        Intent i = new Intent();
        PackageManager manager = getPackageManager();
        i = manager.getLaunchIntentForPackage(nombre_paquete);
        i.addCategory(Intent.CATEGORY_LAUNCHER);
        startActivity(i);

    }


    }

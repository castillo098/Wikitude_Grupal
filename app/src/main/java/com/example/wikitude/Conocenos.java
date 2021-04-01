package com.example.wikitude;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Conocenos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conocenos);
    }

    public void pweb(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tecnologicoloja.edu.ec/"));
        startActivity(i);
    }

    public void rsociales(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/TecnologicoLoja/"));
        startActivity(i);
    }

    public void youtube(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCKcQ2KvksH21kCAZ76daGoA"));
        startActivity(i);
    }

    public void correo(View view) {
        Intent a = new Intent(this, Correo.class);
        startActivity(a);
    }

    public void atras(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }
    public void llamar(View view) {
        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0962641414 "));
        if (ActivityCompat.checkSelfPermission(Conocenos.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
            return;
        startActivity(i);
    }
}


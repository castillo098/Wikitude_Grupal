package com.example.wikitude;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class redes_sociales extends AppCompatActivity {
    EditText correo, titulo, texto;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redes_sociales);
        correo = (EditText) findViewById(R.id.correo);
        titulo = (EditText) findViewById(R.id.titulo);
        texto = (EditText) findViewById(R.id.texto);
        boton = (Button) findViewById(R.id.enviar);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                madarMai();
            }
        });
    }

    private void madarMai() {
        Intent email = new Intent(Intent.ACTION_SEND);
        email.setData(Uri.parse("mailto"));
        email.setType("text/plane");
        email.putExtra(Intent.EXTRA_EMAIL, correo.getText());
        email.putExtra(Intent.EXTRA_SUBJECT, titulo.getText());
        email.putExtra(Intent.EXTRA_TEXT, texto.getText());
        startActivity(Intent.createChooser(email, "Send Email"));

    }

    public void pagina_web(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tecnologicoloja.edu.ec/"));
        startActivity(i);
    }

    public void facebook(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/TecnologicoLoja/"));
        startActivity(i);
    }

    public void instagram(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/tecnologicoloja/?hl=es"));
        startActivity(i);
    }
    public void youtube(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCKcQ2KvksH21kCAZ76daGoA"));
        startActivity(i);
    }

    public void llamar_telefono(View view) {
        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0962641414 "));
        if (ActivityCompat.checkSelfPermission(redes_sociales.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
            return;
        startActivity(i);
    }

    public void atras(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }

}
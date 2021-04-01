package com.example.wikitude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Correo extends AppCompatActivity {
    EditText correo, titulo, texto;
    Button boton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);
        correo= (EditText) findViewById(R.id.correo);
        titulo=(EditText) findViewById(R.id.titulo);
        texto=(EditText) findViewById(R.id.texto);
        boton=(Button) findViewById(R.id.enviar);

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
        email.putExtra(Intent.EXTRA_TEXT,texto.getText());
        startActivity(Intent.createChooser(email,"Send Email"));

    }

}
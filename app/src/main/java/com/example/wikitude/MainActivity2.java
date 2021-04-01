package com.example.wikitude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    //Metodo boton anterior
    public void Atras(View view){
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);

    }
}
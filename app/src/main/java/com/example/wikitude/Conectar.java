package com.example.wikitude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Conectar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conectar);
    }
    public void atras(View view) {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
}
}
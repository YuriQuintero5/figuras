package com.example.listview;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalcularArea extends AppCompatActivity {
    private TextView  titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcular_area);
        titulo = findViewById(R.id.lblTitulo);
        titulo.setText("CUADRADO");

        // getActionBar().setDisplayHomeAsUpEnabled(true);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
    }
}

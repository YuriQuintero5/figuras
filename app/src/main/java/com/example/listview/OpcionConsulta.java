package com.example.listview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class OpcionConsulta extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operacion_consulta);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
    }
    // And override this method
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}

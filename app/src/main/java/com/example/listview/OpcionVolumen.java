package com.example.listview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class OpcionVolumen extends AppCompatActivity {
    private ListView Lista_Opciones;
    private String [] opciones;
    private ArrayAdapter<String> adapter;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operacion_volumen);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button

        Lista_Opciones = findViewById(R.id.listOpciones);
        opciones = getResources().getStringArray(R.array.opcionesVolumenes);
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, opciones);
        Lista_Opciones.setAdapter(adapter);
        Lista_Opciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent = new Intent(OpcionVolumen.this, CalcularVolumen.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(OpcionVolumen.this, CalcularVolumen.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(OpcionVolumen.this, CalcularVolumen.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(OpcionVolumen.this, CalcularVolumen.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
    // And override this method
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}

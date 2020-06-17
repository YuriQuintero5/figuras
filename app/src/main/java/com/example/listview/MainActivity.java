package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView Lista_Opciones;
    private String [] opciones;
    private ArrayAdapter<String> adapter;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lista_Opciones = findViewById(R.id.listOpciones);
        opciones = getResources().getStringArray(R.array.opciones);
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, opciones);
        Lista_Opciones.setAdapter(adapter);
        Lista_Opciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent = new Intent(MainActivity.this, OpcionArea.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, OpcionVolumen.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, OpcionConsulta.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}

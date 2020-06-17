package com.example.listview;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class OpcionConsulta extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Operacion> operacions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operacion_consulta);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button

        tabla = findViewById(R.id.tblConsulta);
        operacions = Datos.obtener();
        for (int i = 0; i < operacions.size(); i++){
            TableRow fila = new TableRow(this);

            TextView columna_uno = new TextView(this);
            TextView columna_dos = new TextView(this);
            TextView columna_tres = new TextView(this);
            TextView columna_cuatro = new TextView(this);

            columna_uno.setText(""+(i+1));
            columna_dos.setText(operacions.get(i).getOperacion());
            columna_tres.setText(operacions.get(i).getDatos());
            columna_cuatro.setText(operacions.get(i).getResultado());

            fila.addView(columna_uno);
            fila.addView(columna_dos);
            fila.addView(columna_tres);
            fila.addView(columna_cuatro);

            tabla.addView(fila);
        }
    }
    // And override this method
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}

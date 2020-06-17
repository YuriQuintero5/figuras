package com.example.listview;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

public class CalcularArea extends AppCompatActivity {
    private TextView  titulo;
    private EditText txtLado;
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcular_area);
        titulo = findViewById(R.id.lblTitulo);
        txtLado = findViewById(R.id.txtLado);
        titulo.setText("CUADRADO");

        // getActionBar().setDisplayHomeAsUpEnabled(true);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
    }
    public void calcular(View v){
        String sLado = txtLado.getText().toString();
        Integer lado = 0;
        if(isNumeric(sLado)) {
            lado = Integer.parseInt(sLado);
            Integer area = lado * lado;
            openDialog("CUADRADO", "Area: "+area.toString());
        }
    }
    public void openDialog(String title, String texto) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage(texto);
        builder1.setCancelable(false);

        builder1.setPositiveButton(
                "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        /*builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });*/

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
    public void limpiar(View v){
        txtLado.setText("");
    }

    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}

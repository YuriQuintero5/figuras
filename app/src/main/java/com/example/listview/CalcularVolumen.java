package com.example.listview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

public class CalcularVolumen extends AppCompatActivity {
    private TextView titulo;
    private EditText txtRadio;
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcular_volumen);
        titulo = findViewById(R.id.lblTitulo);
        txtRadio = findViewById(R.id.txtRadio);
        titulo.setText("ESFERA");

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
    }
    public void calcular(View v){
        String sRadio = txtRadio.getText().toString();
        double radio = 0f;
        if(isNumeric(sRadio)) {
            radio = Float.parseFloat(sRadio);
            Double volumen = (4/3) * radio * radio * Math.PI;


            openDialog("ESFERA", "Volumen: "+String.format("%.2f", volumen));
            Datos.guardar(new Operacion("Volumen de esfera", "Radio: "+sRadio,String.format("%.2f", volumen)));
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

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
    public void limpiar(View v){
        txtRadio.setText("");
    }

    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}

package com.example.carrieta6.tallerfiguras;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Circulo extends AppCompatActivity {
    private EditText radio;
    private Resources resources;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        radio = (EditText) findViewById(R.id.txtRadio);
    }
    public void Calcular(View view){
        String radS;
        Double rad;
        radS = radio.getText().toString();
        rad = Double.parseDouble(radS);
        Double res = (Math.PI * (Math.pow(rad, 2)));
        Figura fig = new Figura("Area del Circulo","Radio: "+rad,String.valueOf(res));
        fig.guardar();
        in = new Intent(Circulo.this,CirculoResultado.class);
        in.putExtra("respuesta", res);
        startActivity(in);
    }
    public void borrar(View view){
        radio.setText("");
    }
}

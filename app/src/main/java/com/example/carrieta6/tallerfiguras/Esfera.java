package com.example.carrieta6.tallerfiguras;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Esfera extends AppCompatActivity {
    private EditText radio;
    private Resources resources;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        radio = (EditText) findViewById(R.id.txtRadio);
    }
    public void Calcular(View view){
        String radS;
        Double rad;
        radS = radio.getText().toString();
        rad = Double.parseDouble(radS);
        Double res = ((4.0*Math.PI*Math.pow(rad,3))/3.0);
        Figura fig = new Figura("Area de la Esfera","Radio: "+rad,String.valueOf(res));
        fig.guardar();
        in = new Intent(Esfera.this,EsferaResultado.class);
        in.putExtra("respuesta", res);
        startActivity(in);
    }
    public void borrar(View view){
        radio.setText("");
    }
}

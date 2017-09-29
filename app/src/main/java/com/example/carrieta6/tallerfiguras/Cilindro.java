package com.example.carrieta6.tallerfiguras;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cilindro extends AppCompatActivity {
    private EditText radio;
    private EditText altura;
    private Resources resources;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);
        radio = (EditText) findViewById(R.id.txtRadio);
        altura = (EditText) findViewById(R.id.txtAltura);
    }
    public void Calcular(View view){
        String radS;
        String altS;
        Double rad;
        Double alt;
        altS = altura.getText().toString();
        radS = radio.getText().toString();
        rad = Double.parseDouble(radS);
        alt = Double.parseDouble(altS);
        Double res = (Math.PI * (Math.pow(rad, 2) * alt));
        Figura fig = new Figura("Area del Cilindro","Radio: "+rad,String.valueOf(res));
        fig.guardar();
        in = new Intent(Cilindro.this,CilindroResultado.class);
        in.putExtra("respuesta", res);
        startActivity(in);
    }
    public void borrar(View view){
        radio.setText("");
    }
}

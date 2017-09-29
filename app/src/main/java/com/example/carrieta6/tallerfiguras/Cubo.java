package com.example.carrieta6.tallerfiguras;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cubo extends AppCompatActivity {
    private EditText lado;
    private Resources resources;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        lado = (EditText) findViewById(R.id.txtLado);
    }
    public void Calcular(View view){
        String ladS;
        Double lad;
        ladS = lado.getText().toString();
        lad = Double.parseDouble(ladS);
        Double res = Math.pow(lad,3);
        Figura fig = new Figura("Area del Cubo","Lado: "+lad,String.valueOf(res));
        fig.guardar();
        in = new Intent(Cubo.this,CuboResultado.class);
        in.putExtra("respuesta", res);
        startActivity(in);
    }
    public void borrar(View view){
        lado.setText("");
    }
}

package com.example.carrieta6.tallerfiguras;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Rectangulo extends AppCompatActivity {
    private EditText base;
    private EditText altura;
    private Resources resources;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        base = (EditText) findViewById(R.id.txtbase);
        altura = (EditText) findViewById(R.id.txtAltura);
    }
    public void Calcular(View view){
        String basS;
        String altS;
        Double bas, alt;
        basS = base.getText().toString();
        altS  = altura.getText().toString();
        bas = Double.parseDouble(basS);
        alt = Double.parseDouble(altS);
        Double res = bas*alt;
        Figura fig = new Figura("Area del Rectangulo","base: "+basS+"altura: "+altS,String.valueOf(res));
        fig.guardar();
        in = new Intent(Rectangulo.this,RectanguloResultado.class);
        in.putExtra("respuesta", res);
        startActivity(in);
    }
    public void borrar(View view){
        base.setText("");
        altura.setText("");
    }
}

package com.example.carrieta6.tallerfiguras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConoResultado extends AppCompatActivity {
    Intent in;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono_resultado);
        res = (TextView) findViewById(R.id.lblConoResultado);
        Bundle datos = this.getIntent().getExtras();
        Double res2 = datos.getDouble("respuesta");
        res.setText(String.valueOf(res2));
    }
}

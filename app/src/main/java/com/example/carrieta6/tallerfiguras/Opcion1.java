package com.example.carrieta6.tallerfiguras;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Opcion1 extends AppCompatActivity {
    private ListView lv;
    private Resources resources;
    private String opc[];
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion1);
        lv = (ListView) findViewById(R.id.opcionesAreas);
        resources=this.getResources();
        opc = resources.getStringArray(R.array.arrayOpcionesAreas);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                switch (i){
                    case 0:
                        in = new Intent(Opcion1.this,Cuadrado.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Opcion1.this,Rectangulo.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(Opcion1.this,Triangulo.class);
                        startActivity(in);
                        break;
                    case 3:
                        in = new Intent(Opcion1.this,Circulo.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}

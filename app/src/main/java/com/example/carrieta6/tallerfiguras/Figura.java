package com.example.carrieta6.tallerfiguras;

/**
 * Created by arodrigu46 on 28/09/2017.
 */

public class Figura {
    private String operacion;
    private String datos;
    private String result;

    public Figura(String operacion, String datos, String result) {
        this.operacion = operacion;
        this.datos = datos;
        this.result = result;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    public void guardar(){
        Datos.guardar(this);
    }
}

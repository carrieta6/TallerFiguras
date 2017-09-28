package com.example.carrieta6.tallerfiguras;

import java.util.ArrayList;

/**
 * Created by arodrigu46 on 28/09/2017.
 */

public class Datos {
    private static ArrayList<Figura> figura = new ArrayList<>();
    public static void guardar(Figura fig){
        figura.add(fig);
    }
    public static ArrayList<Figura> obtener(){
        return figura;
    }
}

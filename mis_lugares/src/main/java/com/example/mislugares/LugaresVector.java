package com.example.mislugares;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vespertino on 05/10/2017.
 */

public class LugaresVector implements Lugares {

    protected List<Lugar> vectorLugares = ejemploLugares();

    public  LugaresVector(){
        vectorLugares = ejemploLugares();
    }
    public Lugar elemento(int id){
        return vectorLugares.get(id);
    }

    public void anyade(Lugar lugar){
        vectorLugares.add(lugar);
    }
    public  int nuevo(){
        Lugar lugar = new Lugar();
        vectorLugares.add(lugar);
        return  vectorLugares.size()-1;
    }
    public void borrar(int id){
        vectorLugares.remove(id);
    }
    public int tamanyo(){
        return vectorLugares.size();
    }
    public void actualiza(int id, Lugar lugar){
        vectorLugares.set(id,lugar);
    }

    public static ArrayList<Lugar> ejemploLugares(){
        ArrayList<Lugar> lugares = new ArrayList<Lugar>();


        return lugares;
    }

}

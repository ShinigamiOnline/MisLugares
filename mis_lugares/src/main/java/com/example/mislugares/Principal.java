package com.example.mislugares;

public class Principal {
    public static void main(String[] main) {
        Lugares lugares = new LugaresVector();
        for(int i = 0; i <lugares.tamanyo();i++){
            System.out.println(lugares.elemento(i).toString());
        }
    }

}

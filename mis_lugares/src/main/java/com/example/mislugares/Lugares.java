package com.example.mislugares;


public interface Lugares {
    Lugar elemento(int id); // Devuelve el elemento dado su id.
    void anyade(Lugar lugar); //Añade el elemento indicado.
    int nuevo();    // Añade un elemento en blanco y devuelve su id.
    void borrar(int id);    // elimina el elemento con el id indicado.
    int tamanyo();  //Devuelve el núemero de elementos.
    void actualiza(int id, Lugar lugar);   //Reemplaza un elemento.
}

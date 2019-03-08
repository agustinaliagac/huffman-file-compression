/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ues21.aed2.estructuras.lista;

/**
 *
 * @author Agustín Aliaga
 * @param <T>
 */
public class Nodo<T> {
    
    private T info;
    private Nodo<T> siguiente;

    public Nodo(T info, Nodo siguiente) {
        this.info = info;
        this.siguiente = siguiente;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public boolean hasNext() {
        return siguiente != null;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
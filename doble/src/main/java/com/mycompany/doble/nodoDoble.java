
package com.mycompany.doble;


public class nodoDoble {
    private nodoDoble anterior;
    private nodoDoble siguiente;
    
    private String dato;

  

    public nodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(nodoDoble anterior) {
        this.anterior = anterior;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public void setSiguiente(nodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public nodoDoble(nodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public nodoDoble getSiguiente() {
        return siguiente;
    }
    
    
    
    
    
    
    
}



package com.mycompany.doble;

import javax.swing.JOptionPane;


public class Doble {

    nodoDoble inicio ;
    
    Doble(){
    inicio =null;
    }
    
    public void insertarInicio(String dato){
        
        nodoDoble nuevo = new nodoDoble();
        nuevo.setAnterior(null);
        nuevo.setSiguiente(null);
        nuevo.setDato(dato);
    if(inicio==null){
        inicio = nuevo;
    }else{
    
    nuevo.setSiguiente(inicio);
    inicio.setAnterior(nuevo);
    inicio = nuevo;
    }
    
    }
public void imprimir(){

    nodoDoble temporal = inicio;
    
    if(inicio == null){
   JOptionPane.showMessageDialog(null, "no hay nadie en la lista", "leonardo el mas bonito", 0);
    }
    else{
    while(temporal != null){
            JOptionPane.showMessageDialog(null, "dato:" + temporal.getDato(), "leonardo el mas bonito", 0);
   temporal = temporal.getAnterior();
    }
    }
    
   
}

public void insertarFinal(String dato){
    nodoDoble nuevo = new nodoDoble(dato);
    
    if(inicio == null){
    
    }else{
    nodoDoble aux = nuevo;
     while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();
           
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);

            
    }

        
}
    
}

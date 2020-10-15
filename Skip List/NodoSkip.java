/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skiplist;

/**
 *
 * @author Alexis Sánchez
 */
public class NodoSkip <T>{
    NodoSkip<T>izq,der,arriba,abajo;
    T elem;

    public NodoSkip() {
        this.izq=null;
        this.der=null;
        this.arriba=null;
        this.abajo=null;
    }
    
    public NodoSkip(T elem){
        this.elem=elem;
        this.izq=null;
        this.der=null;
        this.arriba=null;
        this.abajo=null;
    }
    
    public NodoSkip<T> getIzq() {
        return izq;
    }

    public void setIzq(NodoSkip<T> izq) {
        this.izq = izq;
    }

    public NodoSkip<T> getDer() {
        return der;
    }

    public void setDer(NodoSkip<T> der) {
        this.der = der;
    }

    public NodoSkip<T> getArriba() {
        return arriba;
    }

    public void setArriba(NodoSkip<T> arriba) {
        this.arriba = arriba;
    }

    public NodoSkip<T> getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoSkip<T> abajo) {
        this.abajo = abajo;
    }

    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }
    
    
    
    
}






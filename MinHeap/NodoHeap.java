/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaminheap;

/**
 *
 * @author Alexis Sánchez
 */
public class NodoHeap<T extends Comparable<T>> {
    public T elem;
    public int llave;
    public NodoHeap<T>der,izq,papa;
    
    public NodoHeap(T elem) {
        der = null;
        izq = null;
        papa=null;
        this.elem = elem;
    }
    
    public T getElem(){
        return elem;
    }
    
    public int getLlave(){
        return llave;
    }

    public NodoHeap<T> getDer() {
        return der;
    }

    public void setDer(NodoHeap<T> der) {
        this.der = der;
    }

    public NodoHeap<T> getIzq() {
        return izq;
    }

    public void setIzq(NodoHeap<T> izq) {
        this.izq = izq;
    }

    public NodoHeap<T> getPapa() {
        return papa;
    }

    public void setPapa(NodoHeap<T> papa) {
        this.papa = papa;
    }
    
}



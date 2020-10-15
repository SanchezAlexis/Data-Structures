
package tareaminheap;

import java.util.ArrayList;

/**
 *
 * @author Alexis Sánchez
 */
public class MinHeap <T extends Comparable<T>> {
    private Integer[]Heap;
    private Integer tamaño;
    private Integer tamañoMax;
    private static final Integer FRONT =1;
    
    public MinHeap(Integer tamañoMax){
        this.tamañoMax=tamañoMax;
        this.tamaño=0;
        Heap=new Integer[this.tamañoMax+1];
        Heap[0]=Integer.MIN_VALUE;
    }
    
    private Integer padre(Integer pos){
        return pos/2;
    }
    
    private Integer hijoIzq(Integer pos){
        return (2*pos);
    }
    
    private Integer hijoDer(Integer pos){
        return (2*pos)+1;
    }
    
    private boolean esHoja(Integer pos){
        if (pos>=(tamaño/2)&&pos<=tamaño)
            return true;
        return false;
    }
    private void swap(Integer pos1, Integer pos2){
        Integer temp;
        temp=Heap[pos1];
        Heap[pos1]=Heap[pos2];
        Heap[pos2]=temp;
    }
    
    private void ordenaHeap(Integer pos){
        if(!esHoja(pos)){
            if(Heap[pos]>Heap[hijoIzq(pos)]||Heap[pos] > Heap[hijoDer(pos)]){
                if(Heap[hijoIzq(pos)]<Heap[hijoDer(pos)]){
                    swap(pos,hijoIzq(pos));
                    ordenaHeap(hijoIzq(pos));
                }
                else{
                    swap(pos,hijoDer(pos));
                    ordenaHeap(hijoDer(pos));
                }
            }
        }
    }
    public void inserta(Integer elem){
        if(tamaño>=tamañoMax)
            return;
        Heap[++tamaño]=elem;
        Integer actual=tamaño;
        
        while(Heap[actual]<Heap[padre(actual)]){
            swap(actual,padre(actual));
            actual=padre(actual);
        }
    }
    
    public void imprime(){
        for (int i = 1; i <= tamaño/2; i++) {
            System.out.println(" Padre: "+Heap[i]
                    +" Hijo Izquierdo: "+Heap[2*1]
                    +" Hijo Derecho: "+Heap[2*i+1]);
            System.out.println();
        }
    }
    public void minHeap(){
        for (int pos = (tamaño/2); pos >= 1; pos--) {
            ordenaHeap(pos);
        }
    }
    public int eliminaMin(){
        Integer elem=Heap[FRONT];
        Heap[FRONT]=Heap[tamaño--];
        ordenaHeap(FRONT);
        return elem;
    }
    
}












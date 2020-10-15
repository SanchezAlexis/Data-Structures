package skiplist;

import java.util.Random;

/**
 *
 * @author Alexis Sánchez
 */
public class SKL <T extends Comparable<T>>{
    NodoSkip<T>cabeza,cola;
    int cont;
    int numListas;

    public SKL() {
        cabeza=new NodoSkip<T>();
        cola=new NodoSkip<T>();
        numListas=0;
        cont=0;
    }
    
    public void meteNodo(NodoSkip<T>actual, NodoSkip<T>nuevo){
        nuevo.setIzq(actual);
        nuevo.setDer(actual.getDer());
        actual.setDer(nuevo);
        nuevo.getDer().setIzq(nuevo);
    }
    
    public void inserta(T elem){
        NodoSkip<T>nuevo=new NodoSkip(elem);
        NodoSkip<T>actual=busca(elem);
        NodoSkip<T>nuevo2=new NodoSkip();
        int numVolados=0;
        boolean termine=false;
        cont++;

        do{
            meteNodo(actual,nuevo);
            
            if(numVolados<Math.log(cont+2)&& random()>0.5){
                if(numVolados>numListas){
                    nuevo2=nuevo;
                    nuevo=new NodoSkip();
                    nuevo.setAbajo(cabeza);
                    cabeza.setArriba(nuevo);
                    cabeza=nuevo;
                    nuevo=new NodoSkip();
                    nuevo.setAbajo(cola);
                    cola.setArriba(nuevo);
                    cola=nuevo;
                    cabeza.setDer(cola);
                    cola.setIzq(cabeza);
                    numListas++;
                }
                
                numVolados++;
                nuevo=new NodoSkip(elem);
                nuevo2.setArriba(nuevo);
                nuevo.setAbajo(nuevo2);
                while(actual.getArriba()==null)
                    actual=actual.getIzq();
                actual=actual.getArriba();
            }
            else{
                termine=true;
            }
        }while(!termine);
            
    }
    
    public double random(){
        Random r=new Random();
        double num=r.nextDouble();
        return num;
    }
    
    private NodoSkip<T>busca(T elem){
        NodoSkip<T>actual=cabeza.der;
        int i=1;
        
        while(i<=numListas){
            while(actual.elem!=null && elem.compareTo(cabeza.elem)<0){
                actual=actual.der;
            }
            if(i!=numListas){
                actual=actual.izq;
                actual=actual.abajo;
            }
            else{
                actual=actual.izq;
            }
            i++;
        }
        if(actual.elem==elem)
            actual=actual.izq;
        return actual;
    }
    
    public void borra(T elem){
        NodoSkip<T>actual=busca(elem);
        
        if(actual.getElem()==null || !actual.getElem().equals(elem))
            return;
        while(actual!=null){
            NodoSkip<T>miIzq=actual.getIzq();
            NodoSkip<T>miDer=actual.getDer();
            miIzq.setDer(miDer);
            miDer.setIzq(miIzq);
            actual=actual.getArriba();
        }
        cont--;
        if(numListas<Math.log(cont+2)){
            cabeza=cabeza.getAbajo();
            cola=cola.getAbajo();
            actual=cabeza;
            while(actual!=null){
                actual.setArriba(null);
                actual=actual.getDer();
            }
            numListas--;
        }
        
    }
    
}

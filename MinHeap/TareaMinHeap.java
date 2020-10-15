
package tareaminheap;

import java.util.Random;

/**
 *
 * @author Alexis Sánchez
 */
public class TareaMinHeap {

    public static void main(String[] args) {
        Integer[]arr;
        Prueba p;
        int numElem;
        
        arr=creaArregloDesordenado(300000);
        numElem=arr.length;
        p=new Prueba(numElem);
        
        long inicio = System.currentTimeMillis();
        
        p.mergeSort(arr);
        imprimeArr(arr);
        long fin = System.currentTimeMillis();
        long total=fin-inicio;
        
        System.out.println("Tiempo de ejecucion en milisegundos: "+total);
        
    }
    
    public static void imprimeArr(Integer[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static Integer[]creaArregloOrdenado(int n){
        Integer[]arr=new Integer[n];
        
        for (int i = 0; i < n; i++)
            arr[i]=i;
        return arr;
    }
    
    public static Integer[]creaArregloInvertido(int n){
        Integer[]arr=new Integer[n];
        
        for (int i = 0; i < n; i++)
            arr[n-1-i]=i;
        return arr;
    }
    
    public static Integer[]creaArregloDesordenado(int n){
        Integer[]arr=new Integer[n];
        Random r=new Random();
        int num;
        for (int i = 0; i < n; i++) {
            num=r.nextInt(100);
            arr[i]=num;
        }
        return arr;
    }
    
}






































































































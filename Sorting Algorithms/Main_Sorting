package algoritmosordenamiento;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Alexis Sánchez
 * Fecha: 28 de agosto 2019
 * Objetivo: probar la eficiencia de algoritmos
 * de ordenamiento
 */
public class AlgoritmosOrdenamiento <T extends Comparable<T>>{
    
    
    public static void main(String[] args) throws IOException, InterruptedException {
        SistemaRecomendacion sr=new SistemaRecomendacion();
        sr.leerArchivo("C:\\EDA\\business10k.json",50);
        
//        System.out.println("Informacion Desordenada--------------------------"); 
//        System.out.println(sr.toString());
        sr.ordena();
//        sr.invierte();
        sr.mezcla();
        long startTime = System.nanoTime();

        sr.implementaQuickSort();
       
       
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("El ordenamiento duró en nano seg: "+ elapsedTime);
       
//       
        
//        System.out.println("Informacion Ordenada--------------------------");
//        System.out.println(sr.toString());
//        
//        System.out.println("Informacion Mezclada--------------------------");
//        System.out.println(sr.toString());
        
    }
    
    public static <T> void imprime(T[]arr, int n){
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
    
    public static Integer[]creaArregloRandom(int n){
        Integer[]arr=new Integer[n];
        Random r;
        int num;
        for (int i = 0; i < n; i++) {
            r=new Random();
            num=r.nextInt(20000);
            arr[i]=num;
        }
        return arr;
    }
    public static Integer[]creaArregloOrd(int n){
        Integer[]arr=new Integer[n];
        
        for (int i = 0; i < n; i++)
            arr[i]=i;
        
        return arr;
    }
    
    public static Integer[]creaArregloInv(int n){
        Integer[]arr=new Integer[n];
        
        for (int i = 0; i < n; i++)
            arr[i]=n-i;
        
        return arr;
    }
}

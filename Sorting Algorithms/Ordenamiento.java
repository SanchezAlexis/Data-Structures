package algoritmosordenamiento;

import java.util.ArrayList;

/**
 *
 * @author Alexis Sánchez
 * Tema: Algoritmos de Ordenamiento
 */
public class Ordenamiento <T extends Comparable<T>>{
    
    public <T extends Comparable<T>> void insertionSort(T[]arr, int n){
        int j; 
        T elem;
        for (int i = 1; i < n; i++){  
            elem = arr[i];  
            j = i - 1;  
  
            while (j >= 0 && arr[j].compareTo(elem)>0){  
                arr[j + 1] = arr[j];  
                j = j - 1;  
            }  
            arr[j + 1] = elem;  
        }  
    }
    public <T extends Comparable<T>> void bubbleSort(T[]arr, int n){
        T temp; 
        boolean flag; 
        
        for (int i = 0; i < n - 1; i++){ 
            flag = false; 
            for (int j = 0; j < n - i - 1; j++){ 
                if (arr[j].compareTo(arr[j + 1]) >0){ 
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    flag = true; 
                } 
            } 
            if (flag == false) 
                break; 
        }
    }
    public <T extends Comparable<T>> void quickSort(T[]arr, int min, int max){
        
        if (min < max){ 
            int indice = encPart(arr, min, max); 

            quickSort(arr, min, indice-1); 
            quickSort(arr, indice+1, max); 
        } 
    }
    public <T extends Comparable<T>> int encPart(T[]arr, int min, int max){
        T elem = arr[max];  
        int i = (min-1); 
        for (int j=min; j<max; j++){ 
            if (arr[j].compareTo(elem) <0){ 
                i++; 
                T temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        T temp = arr[i+1]; 
        arr[i+1] = arr[max]; 
        arr[max] = temp; 
  
        return i+1; 
    }
    
    public <T extends Comparable<T>> void mergeSort(T[]arr, int min, int max){
         
        if (min < max){ 
            int mitad = (min+max)/2; 

            mergeSort(arr, min, mitad); 
            mergeSort(arr , mitad+1, max); 

            merge(arr, min, mitad, max); 
        } 
    }
     
    public <T extends Comparable<T>> void merge(T[]arr, int min, int mitad, int max){
        int n1 = mitad - min + 1; 
        int n2 = max - mitad; 
  
        ArrayList<T> temp1=new ArrayList(); 
        ArrayList<T> temp2=new ArrayList(); 
  
        for (int i=0; i<n1; ++i) 
            temp1.add(i,arr[min + i]); 
        for (int j=0; j<n2; ++j) 
            temp2.add(j,arr[mitad + 1+ j]); 
 
        int i = 0, j = 0; 
  
        int k = min; 
        while (i < n1 && j < n2) 
        { 
            if (temp1.get(i).compareTo(temp2.get(j)) <= 0){ 
                arr[k] = temp1.get(i); 
                i++; 
            } 
            else{ 
                arr[k] = temp2.get(j); 
                j++; 
            } 
            k++; 
        } 
        while (i < n1){ 
            arr[k] = temp1.get(i); 
            i++; 
            k++; 
        } 
        while (j < n2){ 
            arr[k] = temp2.get(j); 
            j++; 
            k++; 
        } 
    }
    
    public <T extends Comparable<T>> void selectionSort(T[]arr, int n){
        T min;
        T aux;
        int pos;
        
        for(int i=0;i<n;i++){
            min=arr[i];
            pos=i;
            for(int j=i+1;j<n;j++){
                if(min.compareTo(arr[j])>0){
                    min=arr[j];
                    pos=j;
                    aux=arr[i];
                    arr[i]=arr[j];
                    arr[j]=aux;
                }    
            }
        }
    }
}

















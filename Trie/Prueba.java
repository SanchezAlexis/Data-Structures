
package tareatrie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Alexis Sánchez
 */
public class Prueba {
    public String[]palabras=new String[100000];
    public Trie arbol=new Trie();
    public int numPalabras=0;

    
    public Prueba() {
        
    }

    public void leeArchivo(int numDatos){
        File ent=new File("words.Txt");
        String s;
        int i=0;
        
        palabras=new String[numDatos];
        try(Scanner lec=new Scanner(ent)){
            while(lec.hasNext()&&i<numDatos) {
		s=lec.next();
                if(s.charAt(0)!='#'){
                    s=s.toLowerCase();
                    s=s.replace("'", "");
                    palabras[i]=s;
                    i++;
                    numPalabras++;
                }
            }
            lec.close();
	}
	catch(FileNotFoundException fnfe) {
            System.out.println("Error: "+fnfe);
	}
        mezcla();
        insertaPalabras();
    }
    
    public void mezcla(){
        ArrayList<String>lista=new ArrayList();
        
        for (int i = 0; i < numPalabras; i++) 
            lista.add(i, palabras[i]);
        Collections.shuffle(lista);
        for (int i = 0; i < numPalabras; i++)
            palabras[i]=lista.get(i);
    }
    
    public void insertaPalabras(){
        String s;
        for (int i = 0; i < numPalabras; i++){
            s=palabras[i];
            s=s.toLowerCase();
            s=s.replace("'", "");
            arbol.inserta(s);
        }
            
    }
    
    public void ordenaPalabras(){
        arbol.ordena();
    }
    
    public void ordenaMerge(){
        mergeSort(palabras,0,palabras.length-1);
        imprimePalabras();
    }
    
    public void imprimePalabras(){
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
    
    public boolean buscaPalabras(String llave){
        return arbol.busca(llave);
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
    
}























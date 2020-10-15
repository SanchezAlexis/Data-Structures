/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloomfilter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Alexis Sánchez
 */
public class Prueba {
    Bloom bf;
    public int numDatos;
    public String[]palabras;
    public int numPalabras;
    
    public Prueba(int numDatos, double f){
        this.numDatos=numDatos;
        bf=new Bloom(numDatos,f);
        numPalabras=0;
    }
    
    public void leeArchivo(){
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
        insertaPalabras();
    }
    
    public void insertaPalabras(){
        String s;
        for (int i = 0; i < numPalabras; i++){
            s=palabras[i];
            bf.inserta(s);
        }   
    }
    
    public void llaves(){
        System.out.println("\nTamaño del filtro: "+bf.getNumLlaves());
        bf.getLlaves();
    }
    public void numHash(){
        System.out.println("Numero de funciones Hash: "+bf.numHash);
    }
    public void tamañoMinimo(){
        System.out.println("Tamaño estimado del arreglo: "+bf.getTamañoMinimo());
    }
    public void imprimeFiltro(){
        boolean[]filter;
        
        filter=bf.getFilter();
        for (int i = 0; i < bf.numElem; i++) {
            System.out.print("\npos ["+i+"]: "+filter[i]);
        }
    }
            
}






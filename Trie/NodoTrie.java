
package tareatrie;

import java.util.ArrayList;

/**
 *
 * @author Alexis Sánchez
 */
public class NodoTrie {
    NodoTrie[]hijos=new NodoTrie[26];
    boolean finPalabra;
    String llave;
    
    public NodoTrie() {
        finPalabra=false;
        for (int i = 0; i < 26; i++) {
            hijos[i]=null;
        }
        llave=null;
    }
    
    public boolean isEmpty(){
        boolean vacio=true;
        int i=0;
        
        while(vacio && i<26){
            if(hijos[i]!=null)
                vacio=false;
            i++;
        }
        return vacio;
    }
   
    
}





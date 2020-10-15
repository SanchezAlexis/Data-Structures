
package tareatrie;

/**
 *
 * @author Alexis Sánchez
 */
public class Trie {
    NodoTrie raiz;

    public Trie() {
        raiz=new NodoTrie();
    }

    public void inserta(String llave){
        int longitud;
        int indice;
        NodoTrie temp=raiz;
        
        longitud=llave.length();
        for (int i = 0; i < longitud; i++) {
            indice=llave.charAt(i)-'a';
            if(temp.hijos[indice]==null)
                temp.hijos[indice]=new NodoTrie();
            temp=temp.hijos[indice];
        }
        temp.finPalabra=true;
        temp.llave=llave;
    }
    
    public boolean busca(String llave){
        int indice;
        int longitud;
        NodoTrie actual=raiz;
        boolean existe=false;
        
        longitud=llave.length();
        
        for (int i = 0; i < longitud; i++) {
            indice=llave.charAt(i)-'a';
            if(actual.hijos[indice]==null)
                existe=false;
            actual=actual.hijos[indice];
        }
        if(actual!=null && actual.finPalabra)
            existe=true;
        return existe;
    }
    
    public void elimina(String llave){
        elimina(raiz,llave,0);
    }
    
    private boolean elimina(NodoTrie actual, String llave,int indice){
        if(indice==llave.length()){
            if(!actual.finPalabra)
                return false;
            actual.finPalabra=false;
            return actual.isEmpty();
        }
        return true;
    }
    
    public void ordena(){
        ordena(raiz);
    }
    
    public void ordena(NodoTrie nodo){
        if(nodo==null)
            return;
        for (int i = 0; i < 26; i++) {
            if(nodo.hijos[i]!=null){
                if(nodo.hijos[i].llave!=null)
                    System.out.println(nodo.hijos[i].llave);
            }
            ordena(nodo.hijos[i]);
        }
    }
  
}













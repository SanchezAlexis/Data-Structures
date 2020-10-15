
package bloomfilter;

/**
 *
 * @author Alexis Sánchez
 */
public class BloomFilter {

    public static void main(String[] args) {
        Prueba p=new Prueba(100,0.5);
        
        p.leeArchivo();
        p.imprimeFiltro();
        p.llaves();
        p.numHash();
        p.tamañoMinimo();
        
    }
    
}




































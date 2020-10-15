package tareatrie;


/**
 *
 * @author Alexis Sánchez
 * Fecha: 19 de noviembre, 2019
 * Objtivo: Implementar el uso de Tries
 */
public class TareaTrie {

    public static void main(String[] args) {
        Prueba p=new Prueba();
        
        p.leeArchivo(300000);
        
        long inicio = System.currentTimeMillis();
        
        p.ordenaPalabras();
        
        long fin = System.currentTimeMillis();
        long total=fin-inicio;
        System.out.println("Tiempo de ejecucion en milisegundos: "+total);
    }
    
   
    
}




























































































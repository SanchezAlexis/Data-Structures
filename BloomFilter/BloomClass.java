
package bloomfilter;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Alexis Sánchez
 */
public class Bloom {
    public boolean[]filter;
    public int numElem;
    public double f;
    public int numHash;
    public ArrayList<Integer>llaves;
    public int limite;
    public int numLlaves=0;
    
    public Bloom(int numElem, double f){
        this.numElem=numElem;
        this.f=f;
        this.numHash=getNumHash(f);
        this.limite=numElem*2;
        filter=new boolean[limite];
        
        for (int i = 0; i < limite; i++) {
            filter[i]=false;
        }
        llaves=new ArrayList();
    }
    
    public void inserta(String palabra){
        int llave;
        for (int i = 0; i < numHash; i++) {
            llave=funcionHash(palabra,i);
            filter[llave]=true;
            numLlaves++;
            llaves.add(llave);
        }
    }
    
    public boolean existe(String palabra){
        int llave;
        for (int i = 0; i < numHash; i++) {
            llave=funcionHash(palabra,i);
            if (filter[llave]==false){
                return false;
            }
        }
        return true;
    }
    
    public int funcionHash(String palabra, int i){
        int l=palabra.length();
        int res, num;
        Random r=new Random();
        
        num=r.nextInt(10);
        
        if(num!=0)
            res=((l/(i+1))*num)*2;
        else
            res=((l/(i+1))*(num+1))*2;
            
        return res;
    }
    
    public boolean[]getFilter(){
        return filter;
    }
    public int getNumLlaves(){
        return numLlaves;
    }
    public void getLlaves(){
        System.out.println(llaves.toString());
    }
    public int getNumHash(double f){
        double k;
        int num;
        double lnp=Math.log(f);
        double ln2=Math.log(2);
        k=-lnp/ln2;
        num=(int) Math.round(k);
        return num;
    }
    public int getTamañoMinimo(){
        int min;
        double num;
        
        num=(numHash*numElem)/Math.log(2);
        min=(int)Math.round(num);
        
        return min;
    }
}

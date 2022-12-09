
import java.util.Random;
public class Vlk
{
    // instance variables - replace the example below with your own
    private int x;
    private Stvorec obrazok;
    
    /**
     * Constructor for objects of class vlk
     */
    public Vlk(){ 
       Random r = new Random();
       int i = r.nextInt(800);
       Random x = new Random();
       int j = x.nextInt(600);       
       obrazok = new Stvorec(i,j);
       obrazok.zmenFarbu("black");
       obrazok.zobraz();
       
    }
    
    public void pohyb(){
        Random z = new Random();
        int k = z.nextInt(10) -5;
        
        Random y = new Random();
        int l = y.nextInt(10) -5;
        
        obrazok.posunVodorovne(k);
        obrazok.posunZvisle(l);
    }
    
    
    
    
    

    
    
}


import java.util.Random;
public class ovca
{
    // instance variables - replace the example below with your own
    private int x;
    private Stvorec obrazok;
    /**
     * Constructor for objects of class ovca
     */
    public ovca()
    {
       Random r = new Random();
       int i = r.nextInt(800);
       Random x = new Random();
       int j = x.nextInt(600);
       
      
       
       
       
       
        
       obrazok = new Stvorec(i,j);
       obrazok.zmenFarbu("white");
       obrazok.zobraz();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}

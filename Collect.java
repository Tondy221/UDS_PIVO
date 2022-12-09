import java.util.ArrayList;
/**
 * Write a description of class collect here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Collect
{
    
    // instance variables - replace the example below with your own
    private int pocetVlkov;
    private int pocetOviec;
    private int maxVlci;
    private int macOvce;
    private Vlk vlci;
    private Ovca ovce;
    private Vlk [] vlkovia;
    private Ovca [] ovcovia;
    private int pocetTikov;

    /**
     * Constructor for objects of class collect
     */
    public Collect(int pocetVlkov, int pocetOviec, int maxVlci, int maxOvce){
        this.pocetVlkov = pocetVlkov;
        this.pocetOviec = pocetOviec;
        this.maxVlci = maxVlci;
        this.macOvce = maxOvce;
        this.vlkovia =new Vlk[maxVlci];
        this.ovcovia =new Ovca[maxOvce];
        
        for (int i = 0; i < pocetVlkov;i++){
            this.vlkovia[i] = new Vlk();           
        }
        
        for(int j = 0; j < pocetOviec; j++){
            this.ovcovia[j] = new Ovca();
        }
    }

    public Vlk vytvorVlkov(int pocetPridVlkov){
        if(pocetPridVlkov + pocetVlkov > maxVlci){
            System.out.print("vlci su premnozeny");
        }else{
            for(int i = pocetVlkov; i < pocetVlkov + pocetPridVlkov; i++){
                this.vlkovia[i] =new Vlk();
            }
            this.pocetVlkov = pocetVlkov + pocetPridVlkov;        
        }
                    
        return vlci;
        
    }
    
    public Ovca vytvorOvce(int pocetPridOviec){
        if(pocetPridOviec + pocetOviec > macOvce){
            System.out.print("ovce su premnozene");
        }else{
            for(int i = pocetOviec; i < pocetOviec + pocetPridOviec; i++){
                this.ovcovia[i] = new Ovca();
            }
            this.pocetOviec = pocetOviec + pocetPridOviec;
        }
        
        return ovce;
    }
    
    public int getPocetVlkov(){
        return this.pocetVlkov;
    }
    
    public int getPocetOviec()
    {
    return this.pocetOviec;
    }
    
    public void tik(){
        this.pocetTikov = this.pocetTikov + 1;
        
        
        for(int i = 0; i < pocetVlkov; i++){
            this.vlkovia[i].pohyb();
            
        }
        
        for(int j = 0; j < pocetOviec; j++){
            this.ovcovia[j].pohyb();
        }
            
        
    }
    
}

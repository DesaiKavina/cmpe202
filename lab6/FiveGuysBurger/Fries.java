import java.text.DecimalFormat;

public class Fries extends Leaf 
{
    public double amt;
    public String size;
    
    public Fries(String d, String size)
    {
        super(d);
        this.size = size;
        this.setPrice();
    }
    
    public double setPrice(){
        switch(this.size){
            case"LITTLE":
                this.amt = 2.79;
                break;
            case"REGULAR":
                this.amt = 3.39;
                break;
            case"LARGE":
                this.amt = 5.59;
                break;
            default:
                this.amt = 0.00;
        }
        return this.amt;
    }
    
    public void printDescription(){
        System.out.println(description);
    } 
}

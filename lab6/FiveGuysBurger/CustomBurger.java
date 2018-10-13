import java.text.DecimalFormat;

public class CustomBurger extends Composite
{

    private double amt;
    public CustomBurger ( String d )
    {
        super(d) ;
        setPrice();
    }
    
    public double setPrice()
    {
        switch(description){
            case"BCB":
                this.amt = 7.79;
                break;
            case"LCB":
                this.amt = 5.29;
                break;
            case"LBB":
                this.amt = 5.59;
                break;
            default:
                this.amt = 0.00;
        }
        return this.amt;
    }
    
    public void printDescription() 
    {
        DecimalFormat fmt = new DecimalFormat("0.00");
        String printDesc = "\n " + description + " " + fmt.format(setPrice()) + "\n";
        System.out.println(description + " ");
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
} 
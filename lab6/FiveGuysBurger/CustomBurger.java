import java.text.DecimalFormat;
import java.util.ArrayList;

public class CustomBurger extends Composite
{
    protected ArrayList<Component> customBurger = new ArrayList<Component>();
    private double amt;
    
    public CustomBurger ( String d )
    {
        super(d) ;
        setPrice();
    }
    
    public void addChild(Component c) {
        customBurger.add( c ) ;
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
    
    public void printDescription(String ReceiptType)
    {
        if(ReceiptType=="Customer Receipt")
        {
            DecimalFormat fmt = new DecimalFormat("0.00");
            String printDesc = description + "                     $" + fmt.format(setPrice());
            System.out.println(printDesc);
            
            int itr=0;
            for(itr=0; itr<customBurger.size(); itr++)
            {
                customBurger.get(itr).printDescription(ReceiptType);
            }
        }
        else
        {
            System.out.println(description);
            int itr=0;
            for(itr=0;itr<3;itr++)
            {
                if(itr==0)
                {
                    customBurger.get(1).printDescription(ReceiptType);
                    customBurger.get(2).printDescription(ReceiptType);
                }
                else if(itr==1)
                {
                    customBurger.get(3).printDescription(ReceiptType);
                    customBurger.get(4).printDescription(ReceiptType);
                }
                else if(itr==2)
                {
                    customBurger.get(0).printDescription(ReceiptType);
                }
            }
        }
    }
} 
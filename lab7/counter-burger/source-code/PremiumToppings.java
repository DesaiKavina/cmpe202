
/**
 * Class for adding PremiumToppings.
 */
public class PremiumToppings extends LeafDecorator
{
    private String[] options ;
    
    public PremiumToppings( String d )
    {
        super(d) ;
    }
    
    // premium toppings - all for $1.00 except Marinated Tomatoes
    public void setOptions( String[] options )
    {
        this.options = options ;
        for(int i=0; i<options.length; i++)
        {
            if( options[i].equals("Marinated Tomatoes") )
                this.price += 3.00;
            else
                this.price += 1.00;
        }
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
}

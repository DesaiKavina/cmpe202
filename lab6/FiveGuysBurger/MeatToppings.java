
public class MeatToppings extends Leaf
{
  
    public MeatToppings(String description)
    {
        super(description);
    }
    
    public void printDescription(String ReceiptType){
        System.out.println(" -> | "+description);
    } 
}

public class Toppings extends Leaf
{
  
    public Toppings(String description)
    {
        super(description);
    }
    
    public void printDescription(String ReceiptType){
        System.out.println(" "+description);
    } 
}

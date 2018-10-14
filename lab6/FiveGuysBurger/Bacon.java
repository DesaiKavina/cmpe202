public class Bacon extends Leaf
{
    public Bacon(String description)
    {
        super(description);
    }
    
    public void printDescription(String ReceiptType){
        System.out.println(" {{{{ " + description + " }}}} ");
    }
}

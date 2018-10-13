public class Bacon extends Leaf
{
    public Bacon(String description)
    {
        super(description);
    }
    
    public void printDescription(){
        System.out.println(" {{{{ " + description + " }}}} ");
    }
}

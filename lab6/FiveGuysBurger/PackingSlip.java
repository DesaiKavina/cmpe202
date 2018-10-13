
public class PackingSlip implements ReceiptStrategy
{
    public PackingSlip(){
        
    }
    
    public void printReceipt(Composite order){
        System.out.println("\n\nReceipt generated for packing slip\n");
        System.out.println("******************************\n");
        order.printDescription();
        System.out.println("\n******************************\n");
    }
}


public class PackingSlip implements ReceiptStrategy
{
    public PackingSlip(){
        
    }
    
    public void printReceipt(Composite order){
        System.out.println("\n\nReceipt generated for packing slip\n");
        System.out.println("******************************");
        order.printDescription("Packing Slip");
        System.out.println("\n******************************\n");
    }
}

import java.text.DecimalFormat;
public class CustomerReceipt implements ReceiptStrategy
{
    double amt;
    public CustomerReceipt(double amt){
        this.amt = amt;
    }
    
    public void printReceipt(Composite order){
        System.out.println("\nReceipt generated for Customer\n");
        System.out.println("******************************");
        order.printDescription("Customer Receipt");
        DecimalFormat fmt = new DecimalFormat("$0.00");
        System.out.println("\nSub. Total:             " + fmt.format(this.amt) );
        System.out.println("\n******************************\n");
    } 
}

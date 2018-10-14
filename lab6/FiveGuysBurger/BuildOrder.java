import java.text.DecimalFormat;
public class BuildOrder
{
    public static void run()
    {
        Composite order = new Composite(" ");
        
        CustomBurger burger = new CustomBurger("LBB");
        
        Toppings lettuce = new Toppings("LETTUCE");
        Toppings tomato = new Toppings("TOMATO");
        
        MeatToppings garlicOnion = new MeatToppings("G ONION");
        MeatToppings jalaGrilled = new MeatToppings("JALA Grilled");
        
        Bacon bacon = new Bacon("Bacon");
        
        burger.addChild(bacon);
        burger.addChild(lettuce);
        burger.addChild(tomato);
        burger.addChild(garlicOnion);
        burger.addChild(jalaGrilled);
        
        
        Fries fries = new Fries("LTL CAJ", "LITTLE");
        
        double friesAmt = fries.setPrice();
        double burgerAmt = burger.setPrice();
        
        double netAmt = friesAmt + burgerAmt;
        
        order.addChild(burger);
        order.addChild(fries);
        
        CustomerReceipt custReceipt = new CustomerReceipt(netAmt);
        custReceipt.printReceipt(order);
        
        PackingSlip packingslip = new PackingSlip();
        packingslip.printReceipt(order);
        
        //return order;
        //burger.printDescription();
    }  
}

import java.util.Random;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    //NoQuarterState noquarter;
    int model_no;
    int amt;
 
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        this.model_no = gumballMachine.model_no;
        this.amt = gumballMachine.amt;
    }
  
    public void insertQuarter(int coin) 
    {
       if(model_no==1)
       {
           System.out.println("You can't insert another quarter");
       }
       else if(model_no==2)
       {
           if(coin==25 && gumballMachine.getAmt()<50)
           {
               System.out.println("You inserted another quarter, payment received");
               amt = gumballMachine.getAmt() + coin;
               gumballMachine.setAmt(amt);
               gumballMachine.setState(gumballMachine.getHasQuarterState());
           }
           else if(coin==25 && gumballMachine.getAmt()>=50)
           {
                System.out.println("You have already inserted two quarters, cannot insert more");
           }
           else
           {
               System.out.println("Wrong coin inserted, please insert a quarter");
           }
       }
       else if(model_no==3)
       {
            if((coin==25 || coin==10 || coin==5) && gumballMachine.getAmt()<50)
            {
                System.out.println("You inserted another coin");
                amt = gumballMachine.getAmt() + coin;
                gumballMachine.setAmt(amt);
                if(amt!=50)
                    System.out.println("You still have to enter more coin(s)");
                    
                gumballMachine.setState(gumballMachine.getHasQuarterState());
            }
            else if((coin==25 || coin==10 || coin==5) && gumballMachine.getAmt()>=50)
            {
                System.out.println("You have already inserted 50 cents, cannot insert more");
            }
            else
            {
               System.out.println("Wrong coin inserted, you can only insert quarters, dimes and nickels");
            }
       }
    }
 
    public void ejectQuarter() 
    {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    
    public void turnCrank() 
    {
       System.out.println("----------- The amount is "+gumballMachine.getAmt());
       if(model_no==1)
       {
           if(gumballMachine.getAmt()==25)
           {
                System.out.println("You turned the crank...");
                gumballMachine.setState(gumballMachine.getSoldState());
           }
       }
       else if(model_no==2 || model_no==3)
       {
           if(gumballMachine.getAmt()>=50)
           {
               System.out.println("You turned the crank...");
               gumballMachine.setState(gumballMachine.getSoldState());;
           }
           else
           {
               System.out.println("The total sum received is not yet 50 cents");
           }
       }
    }
    
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}

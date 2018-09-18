public class NoQuarterState implements State 
{
    GumballMachine gumballMachine;
    int model_no;
    int amt;
    
    public NoQuarterState(GumballMachine gumballMachine) 
    {
        this.gumballMachine = gumballMachine;
        this.model_no = gumballMachine.model_no;
        this.amt = gumballMachine.amt;
    }
 
    public void insertQuarter(int coin) 
    {
        gumballMachine.setAmt(0);
        if(model_no==1)
        {
            if(coin==25)
            {
                System.out.println("You inserted a quarter, full payment received");
                amt = gumballMachine.getAmt() + coin;
                gumballMachine.setAmt(amt);
                gumballMachine.setState(gumballMachine.getHasQuarterState());
            }
            else
            {
                System.out.println("Wrong coin inserted, please insert a quarter");
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } 
        }
        else if(model_no==2)
        {
            if(coin==25)
            {
                System.out.println("You inserted a quarter, insert one more quarter");
                amt = gumballMachine.getAmt() + coin;
                gumballMachine.setAmt(amt);
                gumballMachine.setState(gumballMachine.getHasQuarterState());
            }
            else
            {
                System.out.println("Wrong coin inserted, please insert a quarter");
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
        }
        else if(model_no==3)
        {
            if(coin==25 || coin==10 || coin==5)
            {
                System.out.println("You inserted a coin, insert more coins");
                amt = gumballMachine.getAmt() + coin;
                gumballMachine.setAmt(amt);
                gumballMachine.setState(gumballMachine.getHasQuarterState());
            }
            else
            {
                System.out.println("Wrong coin inserted, you can only insert quarters, dimes and nickels");
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
        }
    }
 
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}

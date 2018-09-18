public class SoldState implements State {
 
    GumballMachine gumballMachine;
    int amt;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        this.amt = gumballMachine.amt;
    }
       
    public void insertQuarter(int coin) {
        System.out.println("Please wait, we're already giving you a gumball");
    }
 
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }
 
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }
 
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
            gumballMachine.setAmt(0);
        } 
        else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
            gumballMachine.setAmt(0);
        }
    }
 
    public String toString() {
        return "dispensing a gumball";
    }
}



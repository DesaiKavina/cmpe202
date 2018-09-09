public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine1 = new GumballMachine(5,1);
        GumballMachine gumballMachine2 = new GumballMachine(5,2);
        GumballMachine gumballMachine3 = new GumballMachine(5,3);
        
        System.out.println("\n"+gumballMachine1+"\n");
        gumballMachine1.insertQuarter(25);
        System.out.println("----- Turning the crank after inserting 25 cents in machine 1");
        gumballMachine1.turnCrank();
        System.out.println("-----------------------------------------------------------");
        gumballMachine1.insertQuarter(10);
        System.out.println("----- Turning the crank after inserting 10 cents in machine 1");
        gumballMachine1.turnCrank();
        System.out.println("-----------------------------------------------------------");
        System.out.println("\n"+gumballMachine1+"\n");
        
        System.out.println("\n"+gumballMachine2+"\n");
        System.out.println("----- Turning the crank without inserting anything in machine 2");
        gumballMachine2.turnCrank();
        System.out.println("-----------------------------------------------------------");
        gumballMachine2.insertQuarter(25);
        gumballMachine2.insertQuarter(25);
        System.out.println("----- Turning the crank after inserting 50 cents in machine 2");
        gumballMachine2.turnCrank();
        System.out.println("-----------------------------------------------------------");
        gumballMachine2.insertQuarter(25);
        System.out.println("----- Turning the crank after inserting 25 cents in machine 2");
        gumballMachine2.turnCrank();
        System.out.println("\n"+gumballMachine2+"\n");

        System.out.println("\n"+gumballMachine3+"\n");
        gumballMachine3.insertQuarter(25);
        gumballMachine3.insertQuarter(10);
        gumballMachine3.insertQuarter(10);
        gumballMachine3.insertQuarter(5);
        System.out.println("----- Turning the crank after inserting 50 cents in machine 3");
        gumballMachine3.turnCrank();
        System.out.println("------------------------------------------------------------");
        gumballMachine3.insertQuarter(25);
        gumballMachine3.insertQuarter(20);    //inserting a wrong coin
        System.out.println("----- Turning the crank after inserting 45 cents in machine 3");
        gumballMachine3.turnCrank();
        System.out.println("------------------------------------------------------------");
        gumballMachine3.insertQuarter(25);
        gumballMachine3.insertQuarter(5);
        gumballMachine3.insertQuarter(5);
        gumballMachine3.turnCrank();
        System.out.println("\n"+gumballMachine3+"\n");
    }
}

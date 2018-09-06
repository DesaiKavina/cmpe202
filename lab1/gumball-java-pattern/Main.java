public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine1 = new GumballMachine(5,3);

        System.out.println(gumballMachine1);

        gumballMachine1.insertQuarter(25);
        gumballMachine1.insertQuarter(10);
        gumballMachine1.insertQuarter(10);
        gumballMachine1.insertQuarter(5);
        gumballMachine1.turnCrank();
        System.out.println("-----------------------------------------");
        gumballMachine1.insertQuarter(25);
        gumballMachine1.insertQuarter(20);
        gumballMachine1.turnCrank();
        System.out.println("-----------------------------------------");
        System.out.println(gumballMachine1);
        System.out.println("-----------------------------------------");
    }
}

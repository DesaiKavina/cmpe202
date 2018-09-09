

public class Main {

    public static void main(String[] args) {
        GumballMachine obj = new GumballMachine(5);
        
        int [] array1 = {25};
        int [] array2 = {25,25};
        int [] array3 = {5,5,5,10,25,5};
        int [] array4 = {5,5,5,10,25};
         
        System.out.println(obj);
        
        System.out.println("\nMachine 1, entering 25 cents .....................");
        obj.CheckCase(1, array1);
        obj.turnCrank();
        System.out.println("\nMachine 1, entering 25 cents ......................");
        obj.CheckCase(1, array1);
        obj.turnCrank();
        System.out.println("\nMachine 1, entering 25 cents .....................");
        obj.CheckCase(1, array1);
        obj.turnCrank();
        System.out.println("\nMachine 1, entering 25 cents ......................");
        obj.CheckCase(1, array1);
        obj.turnCrank();
        System.out.println("\nMachine 1, entering 25 cents .....................");
        obj.CheckCase(1, array1);
        obj.turnCrank();
        System.out.println("\nMachine 1, entering 25 cents ......................");
        obj.CheckCase(1, array1);
        obj.turnCrank();
        
        System.out.println("\nMachine 2, entering 50 cents .....................");
        obj.CheckCase(2, array2);
        obj.turnCrank();
        System.out.println("\nMachine 2, entering 50 cents .....................");
        obj.CheckCase(2, array2);
        obj.turnCrank();
        
        System.out.println("\nMachine 3, entering 55 cents .....................");
        obj.CheckCase(3, array3);
        obj.turnCrank();
        System.out.println("\nMachine 3, entering 50 cents .....................");
        obj.CheckCase(3, array4);
        obj.turnCrank();
        System.out.println("\nMachine 3, entering 50 cents .....................");
        obj.CheckCase(3, array4);
        obj.turnCrank();

        System.out.println("\n"+obj);
    }
}

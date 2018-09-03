

public class Main {

    public static void main(String[] args) {
        GumballMachine obj = new GumballMachine(5);
        int [] array1 = {25};
        int [] array2 = {25,25};
        int [] array3 = {5,5,5,10,25};
        
        System.out.println(obj);
        obj.CheckCase(1, array1);
        obj.turnCrank();
        
        obj.CheckCase(1, array1);
        obj.turnCrank();
        
        obj.CheckCase(2, array2);
        obj.turnCrank();
        
        obj.CheckCase(2, array2);
        obj.turnCrank();
        
        obj.CheckCase(3, array3);
        obj.turnCrank();
        
        obj.CheckCase(3, array3);
        obj.turnCrank();

        System.out.println(obj);
    }
}

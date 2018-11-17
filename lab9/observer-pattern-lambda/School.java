import java.util.ArrayList;
import java.awt.List;

public class School implements Subject
{
    public static void main(String[] args) {

        final School school = new School();
        
        school.attach(name -> {
            System.out.println("---------------------- Anxious Observer -------------------------");
            System.out.println("Oh No, again a test: " + name);
        });
        
        school.attach(name -> {
            System.out.println("---------------------- Patient Observer -------------------------");
            System.out.println("Lets calm down and prepare for the next test: " + name);
        });
        
        school.attach(name -> {
            System.out.println("---------------------- Optimistic Observer -------------------------");
            System.out.println("Oh wow!! I love tests like this: " + name + "\n");
        });

        school.notifyObserver("Maths - Monday");
        school.notifyObserver("Science - Friday");
    }
    
    private ArrayList<Observer> observers = new ArrayList<Observer>() ;

    @Override
    public void notifyObserver(String name) {
        for (final Observer parent : this.observers) {
            parent.observeTestDate(name);
        }
    }

    @Override
    public void attach(Observer parent) {
        this.observers.add(parent);
    }

    @Override
    public void detach(Observer parent) {
        this.observers.remove(parent);
    }
}

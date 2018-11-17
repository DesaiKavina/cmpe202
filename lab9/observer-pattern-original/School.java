import java.util.ArrayList;
import java.awt.List;

public class School implements Subject
{
    public static void main(String[] args) {

        final School school = new School();
        final AnxiousObserver anxiousParent = new AnxiousObserver();
        final PatientObserver patientParent = new PatientObserver();
        final OptimisticObserver optimisticParent = new OptimisticObserver();

        school.attach(anxiousParent);
        school.attach(patientParent);
        school.attach(optimisticParent);

        school.notifyObserver("Maths - Monday");
        school.notifyObserver("Science - Friday");
    }

    //private List parents = Lists.newCopyOnWriteArrayList();
    
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

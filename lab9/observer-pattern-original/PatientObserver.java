
public class PatientObserver implements Observer
{
    @Override
    public void observeTestDate(String name) {
        // Print the details of newly announced test
        System.out.println("---------------------- Patient Observer -------------------------");
        System.out.println("Lets calm down and prepare for the next test: " + name);
    }
}

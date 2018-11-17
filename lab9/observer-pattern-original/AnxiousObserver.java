
public class AnxiousObserver implements Observer
{
    @Override
    public void observeTestDate(String name) {
        // Print the details of newly announced test
        System.out.println("---------------------- Anxious Observer -------------------------");
        System.out.println("Oh No, again a test: " + name);
    }
}

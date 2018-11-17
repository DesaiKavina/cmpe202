
public class OptimisticObserver implements Observer
{
    @Override
    public void observeTestDate(String name) {
        // Print the details of newly announced test
        System.out.println("---------------------- Optimistic Observer -------------------------");
        System.out.println("Oh wow!! I love tests like this: " + name + "\n");
    }
}

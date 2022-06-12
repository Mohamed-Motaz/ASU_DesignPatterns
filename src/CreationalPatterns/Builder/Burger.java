package CreationalPatterns.Builder;

public class Burger implements Item{
    @Override
    public void name() {
        System.out.println("Burger name");
    }

    @Override
    public void price() {
        System.out.println("Burger price: 15.7");
    }
}

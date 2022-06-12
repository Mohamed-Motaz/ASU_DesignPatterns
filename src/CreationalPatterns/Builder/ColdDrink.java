package CreationalPatterns.Builder;

public class ColdDrink implements Item{

    @Override
    public void name() {
        System.out.println("ColdDrink name");
    }

    @Override
    public void price() {
        System.out.println("ColdDrink price 4.32");
    }
}

package CreationalPatterns.AdapterPattern;

public class PlasticToyDuck implements ToyDuck{

    @Override
    public void squeak() {
        System.out.println("Plastic Toy Duck squeaking");
    }
}

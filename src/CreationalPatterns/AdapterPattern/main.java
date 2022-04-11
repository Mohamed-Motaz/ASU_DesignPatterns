package CreationalPatterns.AdapterPattern;

public class main {
    public static void main(String args[]){
        Sparrow s = new Sparrow();
        ToyDuck td = new PlasticToyDuck();

        ToyDuck bd = new BirdAdapter(s);

        s.fly();
        s.makeSound();

        td.squeak();
        bd.squeak();
    }
}

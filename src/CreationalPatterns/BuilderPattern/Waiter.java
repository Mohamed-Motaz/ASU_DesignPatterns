package CreationalPatterns.BuilderPattern;

public class Waiter {
    private PizzaBuilder builder;

    public void setPizzaBuilder(PizzaBuilder pb){
        builder = pb;
    }

    public void preparePizza(){
        builder.preparePizza();
    }

    public Pizza getPizza(){
        return builder.getPizza();
    }
}

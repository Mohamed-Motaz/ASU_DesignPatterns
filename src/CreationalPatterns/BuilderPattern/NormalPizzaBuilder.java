package CreationalPatterns.BuilderPattern;

public class NormalPizzaBuilder extends PizzaBuilder{
    @Override
    public void preparePizza() {
        System.out.println("Preparing normal pizza");
        pizza = new Pizza();
    }
}

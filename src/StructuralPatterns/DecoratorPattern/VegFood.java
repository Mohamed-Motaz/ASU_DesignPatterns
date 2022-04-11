package StructuralPatterns.DecoratorPattern;

public class VegFood implements Food{

    @Override
    public double foodPrice() {
        System.out.println("In Veg Food");
        return 0;
    }

    @Override
    public String prepareFood() {
        System.out.println("In prepare food");

        return null;
    }
}

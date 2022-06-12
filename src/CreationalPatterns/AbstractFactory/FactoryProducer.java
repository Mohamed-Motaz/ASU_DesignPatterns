package CreationalPatterns.AbstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String ss){
        if (ss == null)
            return null;

        if (ss.equalsIgnoreCase("normal"))
            return new ShapeFactory();

        if (ss.equalsIgnoreCase("rounded"))
            return new RoundedShapeFactory();

        return null;
    }
}

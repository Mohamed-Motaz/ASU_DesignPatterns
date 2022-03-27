package CreationalPatterns.AbstractFactoryPattern;

public class FactoryProducer {
    public static String ROUNDED_FACT = "RoundedFact";
    public static String NORMAL_FACT = "NormalFact";

    public AbstractFactory getFactory(String s){
        if (s == null)
            return null;
        if (s.equals(ROUNDED_FACT))
            return new RoundedShapeFactory();
        if (s.equals(NORMAL_FACT))
            return new ShapeFactory();
        return null;
    }
}

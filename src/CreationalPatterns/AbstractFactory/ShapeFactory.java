package CreationalPatterns.AbstractFactory;

public class ShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String s) {
        if (s == null)
            return null;

        if (s.equalsIgnoreCase("square"))
            return new Square();
        if (s.equalsIgnoreCase("rectangle"))
            return new Rectangle();

        return null;
    }
}

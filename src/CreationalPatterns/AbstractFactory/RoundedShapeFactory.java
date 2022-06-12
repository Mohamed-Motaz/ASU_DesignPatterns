package CreationalPatterns.AbstractFactory;

public class RoundedShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String s) {
        if (s == null)
            return null;

        if (s.equalsIgnoreCase("square"))
            return new RoundedSquare();
        if (s.equalsIgnoreCase("rectangle"))
            return new RoundedRectangle();

        return null;
    }
}

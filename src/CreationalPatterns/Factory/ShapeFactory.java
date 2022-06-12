package CreationalPatterns.Factory;

public class ShapeFactory {
    public Shape getShape(String name){
        if (name == null)
            return null;

        if (name.equalsIgnoreCase("square"))
            return new Square();

        if (name.equalsIgnoreCase("rectangle"))
            return new Rectangle();

        return null;
    }
}

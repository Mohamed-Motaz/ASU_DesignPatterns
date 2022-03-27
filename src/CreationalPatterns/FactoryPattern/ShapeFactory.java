package CreationalPatterns.FactoryPattern;

public class ShapeFactory {

    public static String RECT = "Rect";
    public static String SQU = "Squ";

    public Shape getShape(String s){
        if (s == null)
            return null;
        if (s.equals(RECT))
            return new Rectangle();
        if (s.equals(SQU))
            return new Square();
        return null;
    }
}

package CreationalPatterns.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory{

    public static String RECT = "Rect";
    public static String SQU = "Squ";

    public BaseShape getShape(String s){
        if (s == null)
            return null;
        if (s.equals(RECT))
            return new Rectangle();
        if (s.equals(SQU))
            return new Square();
        return null;
    }
}

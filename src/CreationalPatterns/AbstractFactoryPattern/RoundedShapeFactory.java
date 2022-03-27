package CreationalPatterns.AbstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory{
    public static String ROUNDED_RECT = "RoundedRect";
    public static String ROUNDED_SQU = "RoundedSqu";


    public BaseShape getShape(String s){
        if (s == null)
            return null;
        if (s.equals(ROUNDED_RECT))
            return new RoundedRectangle();
        if (s.equals(ROUNDED_SQU))
            return new RoundedSquare();
        return null;
    }

}

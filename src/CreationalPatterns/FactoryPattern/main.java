package CreationalPatterns.FactoryPattern;

public class main {
    public static void main(String[] args){
        ShapeFactory fact = new ShapeFactory();

        Shape square = fact.getShape(ShapeFactory.SQU);
        square.draw();

        Shape rect = fact.getShape(ShapeFactory.RECT);
        rect.draw();
    }
}

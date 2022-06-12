package CreationalPatterns.Factory;

public class Main {
    public static void main(String[] args){
        ShapeFactory sf = new ShapeFactory();

        Shape s = sf.getShape("square");
        s.draw();

        s = sf.getShape("rectangle");
        s.draw();
    }
}

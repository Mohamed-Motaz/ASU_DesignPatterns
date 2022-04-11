package CreationalPatterns.PrototypePattern;

public class main {
    public static void main(String[] args){
        ShapeCache cache = new ShapeCache();
        Shape clonedShape = (Shape) cache.getShape("square");
        Shape clonedShape2 = (Shape) cache.getShape("rectangle");

    }
}

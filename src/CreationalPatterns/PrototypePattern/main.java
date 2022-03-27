package CreationalPatterns.PrototypePattern;

public class main {
    public static void main(String[] args){
        ShapeCache.loadCache();
        Shape clonedShape = (Shape) ShapeCache.getShape("square");

        Shape clonedShape2 = (Shape) ShapeCache.getShape("rectangle");

    }
}

package StructuralPatterns.Decorator;

public class Main {
    public static void main(String[] args){
        ShapeDecorator dec = new RedShapeDecorator(new Rectangle());

        dec.draw();
    }
}

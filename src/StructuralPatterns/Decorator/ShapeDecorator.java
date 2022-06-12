package StructuralPatterns.Decorator;

public abstract class ShapeDecorator implements Shape{
    protected Shape shape;

    @Override
    public void draw() {
        shape.draw();
    }

    public ShapeDecorator(Shape s){
        shape = s;
    }
}

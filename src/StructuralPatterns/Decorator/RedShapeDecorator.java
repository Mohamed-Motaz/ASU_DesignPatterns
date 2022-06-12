package StructuralPatterns.Decorator;

public class RedShapeDecorator extends ShapeDecorator{
    protected Shape ss;

    public RedShapeDecorator(Shape s) {
        super(s);
        ss = s;
    }

    @Override
    public void draw() {
        ss.draw();
        System.out.println("Red Shape");
    }
}

package StructuralPatterns.Bridge;

public class Circle extends Shape{
    public Circle(DrawApi d) {
        super(d);
    }

    @Override
    public void draw() {
        drawApi.drawCircle();
    }
}

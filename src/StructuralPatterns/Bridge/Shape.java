package StructuralPatterns.Bridge;

public abstract class Shape {
    protected DrawApi drawApi;

    public Shape(DrawApi d){
        drawApi = d;
    }

    public abstract void draw();
}

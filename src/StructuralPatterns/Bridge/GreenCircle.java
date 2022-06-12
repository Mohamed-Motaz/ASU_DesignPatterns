package StructuralPatterns.Bridge;

public class GreenCircle implements DrawApi{
    @Override
    public void drawCircle() {
        System.out.println("Green Circle");
    }
}

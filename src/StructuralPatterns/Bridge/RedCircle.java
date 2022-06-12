package StructuralPatterns.Bridge;

public class RedCircle implements DrawApi{

    @Override
    public void drawCircle() {
        System.out.println("Red Circle");
    }
}

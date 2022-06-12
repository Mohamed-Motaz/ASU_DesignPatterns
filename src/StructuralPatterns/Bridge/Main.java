package StructuralPatterns.Bridge;

public class Main {
    public static void main(String[] args){
        Shape redCircle = new Circle(new RedCircle());
        Shape greenCircle = new Circle(new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}

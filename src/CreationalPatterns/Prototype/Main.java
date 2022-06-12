package CreationalPatterns.Prototype;

public class Main {
    public static void main(String[] args){
        ShapeCache sc = new ShapeCache();
        sc.loadCache();


        Shape s = sc.getShape("circle");
        System.out.println(s.name);

        s = sc.getShape("rectangle");
        System.out.println(s.name);
    }
}

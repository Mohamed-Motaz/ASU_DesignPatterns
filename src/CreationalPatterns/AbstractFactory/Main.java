package CreationalPatterns.AbstractFactory;

public class Main {
    public static void main(String[] args){
        AbstractFactory fp = FactoryProducer.getFactory("rounded");
        fp.getShape("square").draw();
    }
}

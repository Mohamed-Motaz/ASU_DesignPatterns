package CreationalPatterns.AbstractFactoryPattern;

public class main {
    public static void main(String[] args){
        FactoryProducer facProducer = new FactoryProducer();


        AbstractFactory roundedFactory = facProducer.getFactory(FactoryProducer.ROUNDED_FACT);
        BaseShape rdSquare = roundedFactory.getShape(RoundedShapeFactory.ROUNDED_SQU);
        rdSquare.draw();

        AbstractFactory normalFactory = facProducer.getFactory(FactoryProducer.NORMAL_FACT);
        BaseShape normalSquare = normalFactory.getShape(ShapeFactory.SQU);
        normalSquare.draw();
    }
}

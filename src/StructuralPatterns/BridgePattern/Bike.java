package StructuralPatterns.BridgePattern;

public class Bike extends Vehicle{

    public Bike(Workshop ws1, Workshop ws2){
        super(ws1, ws2);

    }

    @Override
    public void manufacture() {
        System.out.println("Vehicle");
        ws1.work();
        ws2.work();
    }
}

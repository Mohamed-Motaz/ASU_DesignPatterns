package StructuralPatterns.BridgePattern;

public class Bus extends Vehicle{

    public Bus(Workshop ws1, Workshop ws2){
        super(ws1, ws2);

    }

    @Override
    public void manufacture() {
        System.out.println("BUS");
        ws1.work();
        ws2.work();
    }
}

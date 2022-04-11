package StructuralPatterns.BridgePattern;

public abstract class Vehicle {
    protected Workshop ws1, ws2;

    public Vehicle(Workshop ws1, Workshop ws2){
        this.ws1 = ws1;
        this.ws2 = ws2;
    }

    public abstract void manufacture();

}

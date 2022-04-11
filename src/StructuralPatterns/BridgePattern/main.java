package StructuralPatterns.BridgePattern;

public class main {
    public static void main(String args[]){
        Vehicle vehicle1 = new Bus(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();

    }
}

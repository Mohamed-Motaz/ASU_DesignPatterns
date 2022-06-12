package StructuralPatterns.Chain_Of_Responsibility;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    public void write(String m) {
        System.out.println("Error: " + m);
    }
}

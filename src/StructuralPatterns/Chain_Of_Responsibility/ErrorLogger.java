package StructuralPatterns.Chain_Of_Responsibility;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String m) {
        System.out.println("Error: " + m);
    }
}

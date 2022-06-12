package StructuralPatterns.Chain_Of_Responsibility;

public class InfoLogger extends AbstractLogger{
    public InfoLogger(int level) {
        super(level);
    }

    @Override
    public void write(String m) {
        System.out.println("Info: " + m);
    }
}

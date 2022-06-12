package StructuralPatterns.Chain_Of_Responsibility;

public class InfoLogger extends AbstractLogger{
    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String m) {
        System.out.println("Info: " + m);
    }
}

package StructuralPatterns.Chain_Of_Responsibility;

public abstract class AbstractLogger {
    protected int level;
    protected static int ERROR = 0;
    protected static int INFO = 1;
    protected static int DEBUG = 2;

    protected AbstractLogger nextLogger;

    public AbstractLogger(int level){
        this.level = level;
    }

    public void setNextLogger(AbstractLogger l){
        nextLogger = l;
    }

    public abstract void write(String m);

    public void logMessage(String message, int level){
        if (level <= this.level)
            write(message);

        if (nextLogger != null)
            nextLogger.logMessage(message, level);
    }

}

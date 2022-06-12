package StructuralPatterns.Chain_Of_Responsibility;

public class Main {
    public  static void main(String[] args){
        AbstractLogger eLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger iLogger = new InfoLogger(AbstractLogger.INFO);

        eLogger.setNextLogger(iLogger);

        //error is 0, info is 1

        //both loggers should log
        eLogger.logMessage("Hi", 1);

        //only the eLogger should log
        eLogger.logMessage("Hi again!", 0);
    }
}

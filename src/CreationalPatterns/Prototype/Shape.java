package CreationalPatterns.Prototype;

public abstract class Shape implements Cloneable{
    protected String name;

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException exp){
            exp.printStackTrace();
        }
        return clone;
    }
}

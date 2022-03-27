package CreationalPatterns.PrototypePattern;

public abstract class Shape implements Cloneable{
    public String name;
    public Object clone(){
        Object res = null;
        try {
            res = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return res;
    }
}

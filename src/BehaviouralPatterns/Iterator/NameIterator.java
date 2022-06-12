package BehaviouralPatterns.Iterator;

public class NameIterator implements Iterator{

    protected String[] names;
    protected int index;

    public NameIterator(String[] names){
        this.names = names;
    }

    @Override
    public Object next() {
       if (this.hasNext()){
           return names[index++];
       }
       return null;
    }

    @Override
    public boolean hasNext() {
        if (index < names.length)
            return true;
        return false;
    }
}

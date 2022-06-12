package StructuralPatterns.Iterator;

public class NameRepository implements Container{
    protected String[] names = {"1", "2", "3", "4"};
    protected NameIterator nameIterator;

    @Override
    public Iterator getIterator() {
        nameIterator = new NameIterator(names);
        return nameIterator;
    }
}

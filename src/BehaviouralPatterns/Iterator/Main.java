package BehaviouralPatterns.Iterator;

public class Main {
    public static void main(String[] args){
        NameRepository repo = new NameRepository();
        for (Iterator itr = repo.getIterator(); itr.hasNext();){
            System.out.println((String)itr.next());
        }
    }
}

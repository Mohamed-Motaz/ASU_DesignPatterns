package CreationalPatterns.Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    protected List<Item> items = new ArrayList<>();

    public void add(Item item){
        items.add(item);
    }

    public void showCost(){
        for (Item i: items){
            i.name();
            i.price();
        }
    }
}

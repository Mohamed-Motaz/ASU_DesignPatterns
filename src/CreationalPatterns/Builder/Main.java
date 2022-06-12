package CreationalPatterns.Builder;

import CreationalPatterns.Prototype.Shape;
import CreationalPatterns.Prototype.ShapeCache;

public class Main {
    public static void main(String[] args){
        MealBuilder builder = new MealBuilder();

        Meal m = builder.prepareNonVegMeal();
        m.showCost();

        System.out.println("\n\n");

        m = builder.prepareVegMeal();
        m.showCost();
    }

}

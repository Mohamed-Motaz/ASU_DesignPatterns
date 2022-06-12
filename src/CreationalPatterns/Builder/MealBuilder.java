package CreationalPatterns.Builder;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.add(new ColdDrink());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.add(new Burger());
        meal.add(new ColdDrink());
        return meal;
    }
}

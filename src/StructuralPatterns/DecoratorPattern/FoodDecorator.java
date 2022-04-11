package StructuralPatterns.DecoratorPattern;

public abstract class FoodDecorator implements Food{
    Food food;
    protected FoodDecorator(Food food){
        this.food = food;
    }
    @Override
    public double foodPrice() {
        return food.foodPrice();
    }

    @Override
    public String prepareFood() {
        return food.prepareFood();
    }

}

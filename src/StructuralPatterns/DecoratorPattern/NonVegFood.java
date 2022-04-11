package StructuralPatterns.DecoratorPattern;

public class NonVegFood extends FoodDecorator{
    protected NonVegFood(Food food) {
        super(food);
    }
    @Override
    public String prepareFood(){
        return super.prepareFood() + " With Roasted Chiken and Chiken Curry  ";
    }
    public double foodPrice()   {
        return super.foodPrice()+150.0;
    }
}

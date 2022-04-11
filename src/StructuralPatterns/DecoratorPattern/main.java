package StructuralPatterns.DecoratorPattern;

public class main {
    public static void main(String args[]){
        VegFood vf=new VegFood();
        System.out.println(vf.prepareFood());
        System.out.println();
        System.out.println( vf.foodPrice());
        System.out.println();
        Food f1=new NonVegFood((Food) new VegFood());
        System.out.println(f1.prepareFood());
        System.out.println();
        System.out.println( f1.foodPrice());
        System.out.println();
        Food f2=new ChineseFood((Food) new VegFood());
        System.out.println();
        System.out.println(f2.prepareFood());
        System.out.println();
        System.out.println( f2.foodPrice());
    }


}

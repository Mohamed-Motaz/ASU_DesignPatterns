package StructuralPatterns.Composite;

public class Main {
    public static void main(String[] args){
        Employee one = new Employee();

        Employee one_one = new Employee();
        Employee one_two = new Employee();

        Employee one_one_one = new Employee();
        Employee one_one_two = new Employee();

        Employee one_two_one = new Employee();
        Employee one_two_two = new Employee();

        one.add(one_one);
        one.add(one_two);

        one_one.add(one_one_one);
        one_one.add(one_one_two);

        one_two.add(one_two_one);
        one_two.add(one_two_two);


    }
}

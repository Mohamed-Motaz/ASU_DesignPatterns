package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    protected String name;
    protected List<Employee> employees = new ArrayList<>();

    public void add(Employee e){
        employees.add(e);
    }

    public void remove(Employee e){
        employees.remove(e);
    }

    public List<Employee> getEmployees(){
        return employees;
    }
}

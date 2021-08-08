package inheritanceemployee;

public abstract class Employee{
    private String employeeName;
    private double employeeWage;
    
    public Employee(String name, double wage){
        employeeName = name;
        employeeWage = wage;
    }
    
    public String getName(){
        return employeeName;
    }
    
    public double getWage(){
        return employeeWage;
    }
}
package inheritanceemployee;

import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Worker> supervises;
    
    public Manager(String name, double wage){
        super(name, wage);
        supervises = new ArrayList<Worker>();
    }
    
    public void addSupervisedEmployee(Worker employee){
        supervises.add(employee);
    }
    
    public ArrayList<Worker> getSupervises(){
        return supervises;
    }
}


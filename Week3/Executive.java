package inheritanceemployee;

public class Executive extends Employee{
    private double executiveAnnualBonus;
    
    public Executive(String name, double wage, double annualBonus){
        super(name, wage);
        executiveAnnualBonus = annualBonus;
    }
    
    public double getAnnualBonus(){
        return executiveAnnualBonus;
    }
    
    public double getWage(){
        double normalWage = super.getWage();
        double newWage = normalWage + getAnnualBonus()/52;
        return newWage;
    }
}
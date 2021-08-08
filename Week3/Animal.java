package inheritancebasic;

// write your code here

public abstract class Animal{
    public String animalName;
    public int animalAge;
    
    public Animal(String name, int age){
        animalName = name;
        animalAge = age;
    }
    
    public String getName(){
        return animalName;
    }
    
    public int getAge(){
        return animalAge;
    }
    
    public abstract String communicate();
}
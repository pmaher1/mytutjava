package inheritancebasic;

// write your code here

public class Dog extends Animal{
    public Dog(String name, int age){
        super(name,age);
        animalName = name;
        animalAge = age;
    }
    
    public String communicate(){
        return "Woof";
    }
}
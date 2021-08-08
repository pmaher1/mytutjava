package inheritancebasic;

// write your code here

public class Cat extends Animal{
    public Cat(String name, int age){
        super(name,age);
        animalName = name;
        animalAge = age;
    }
    
    public String communicate(){
        return "Meow";
    }
}